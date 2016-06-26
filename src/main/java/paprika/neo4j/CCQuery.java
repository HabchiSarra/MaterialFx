package paprika.neo4j;

import com.guigarage.sdk.BDD.DatasetFuzzyLine;
import com.guigarage.sdk.BDD.DatasetSimpleLine;
import com.guigarage.sdk.BDD.FuzzyLine;
import com.guigarage.sdk.BDD.SimpleLine;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import org.neo4j.cypher.CypherException;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class CCQuery extends FuzzyQuery{
    protected static double high = 28;
    protected static double veryHigh = 43;

    private CCQuery(QueryEngine queryEngine) {
        super(queryEngine);
        fclFile = "fcl/ComplexClass.fcl";
    }

    public static CCQuery createCCQuery(QueryEngine queryEngine) {
        return new CCQuery(queryEngine);
    }

    public void execute(boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.class_complexity > "+ veryHigh +" RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as CC";
            }
            result = graphDatabaseService.execute(query);
            queryEngine.resultToCSV(result,"_CC_NO_FUZZY.csv");
        }
    }

    public HashMap<String, Integer> count()  {
        Result result;
        HashMap<String, Integer> res=new HashMap<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.class_complexity > "+ veryHigh +" RETURN count(cl) as class_cpt, count(distinct(cl.app_key)) as app_cpt";
            result = graphDatabaseService.execute(query);
            HashMap hashMap =new HashMap(result.next());
            res.put("class_cpt",Integer.parseInt(hashMap.get("class_cpt").toString()));
            res.put("app_cpt",Integer.parseInt(hashMap.get("app_cpt").toString()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }

    public ArrayList<DatasetSimpleLine> executeDataset(boolean csv, boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.class_complexity > "+ veryHigh +" RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as CC";
            }
            result = graphDatabaseService.execute(query);
            ArrayList<HashMap<String, Object>> list =new ArrayList<>();
            List<String> columns = result.columns();

            DatasetSimpleLine simpleLine;
            ArrayList<DatasetSimpleLine> lines = new ArrayList<>();
            if(result !=null){
                while(result.hasNext()) {
                    HashMap res = new HashMap(result.next());
                    list.add(res);
                    simpleLine = new DatasetSimpleLine(res.get("full_name").toString(),"", res.get("app_key").toString());
                    lines.add(simpleLine);
                }
            }
            if(csv)
            {
                queryEngine.resultToCSV(columns, list,"_CC_NO_FUZZY.csv");
            }
            return lines;
        }
    }

    public void executeFuzzy(boolean details) throws CypherException, IOException {
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (cl:Class) WHERE cl.class_complexity > " + high + " RETURN cl.app_key as app_key, cl.class_complexity as cplx";
                if(details){
                    query += ",cl.name as full_name";
                }
                result = graphDatabaseService.execute(query);
                List<String> columns = new ArrayList<>(result.columns());
                System.out.println("Hello");
                columns.add("fuzzy_value");
                int cc;
                Object o;
                List<Map> fuzzyResult = new ArrayList<>();
                File fcf = new File(fclFile);

                //We look if the file is in a directory otherwise we look inside the jar
                FIS fis;

                if(fcf.exists() && !fcf.isDirectory()){
                    fis = FIS.load(fclFile, false);
                }else{
                    fis = FIS.load(getClass().getResourceAsStream(fclFile),false);
                }
                FunctionBlock fb = fis.getFunctionBlock(null);
                HashMap res;
                while(result.hasNext()){
                    synchronized (this) {
                        res = new HashMap(result.next());
                        cc= Integer.parseInt( res.get("cplx").toString());

                    }
                    if(cc >= veryHigh){
                        res.put("fuzzy_value", 1);
                    }else {
                        fb.setVariable("class_complexity",cc);
                        fb.evaluate();
                        res.put("fuzzy_value", fb.getVariable("res").getValue());
                    }
                    fuzzyResult.add(res);
                    }
                    queryEngine.resultToCSV(fuzzyResult,columns,"_CC.csv");
            }
    }

    public ArrayList<SimpleLine> executeApp(String appKey, boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.app_key='"+appKey+"' AND cl.class_complexity > "+ veryHigh +" RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as CC";
            }
            result = graphDatabaseService.execute(query);
            SimpleLine simpleLine;
            ArrayList<SimpleLine> lines = new ArrayList<>();
            if(result !=null){
                while(result.hasNext()) {
                    HashMap res = new HashMap(result.next());
                    simpleLine = new SimpleLine(res.get("full_name").toString(),"");
                    lines.add(simpleLine);
                }
            }

            return lines;
        }
    }


    public ArrayList<FuzzyLine> executeFuzzyApp(String appKey,boolean details) throws CypherException, IOException {
        Result result;
        ArrayList<FuzzyLine> fuzzyLines= new ArrayList<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.app_key='"+appKey+"' AND  cl.class_complexity > " + high + " RETURN cl.app_key as app_key, cl.class_complexity as class_complexity";
            if(details){
                query += ", cl.name as full_name";
            }
            result = graphDatabaseService.execute(query);
            System.out.println(query);
          //  List<String> columns = new ArrayList<>(result.columns());
           // columns.add("fuzzy_value");
            int cc;
           // List<Map> fuzzyResult = new ArrayList<>();
            File fcf = new File(fclFile);
            //We look if the file is in a directory otherwise we look inside the jar
            FIS fis;
            FuzzyLine fuzzyLine;
            if(fcf.exists() && !fcf.isDirectory()){
                fis = FIS.load(fclFile, false);
            }else{
                fis = FIS.load(getClass().getResourceAsStream(fclFile),false);
            }
            FunctionBlock fb = fis.getFunctionBlock(null);
            while(result.hasNext()){
                HashMap res = new HashMap(result.next());

                cc = Integer.parseInt(res.get("class_complexity").toString());
                System.out.println("1");
                fuzzyLine = new FuzzyLine(res.get("full_name").toString(), "");
                System.out.println("2");
                if(cc >= veryHigh){
                    fuzzyLine.setProbability(1);
                }else {
                    fb.setVariable("class_complexity",cc);
                    fb.evaluate();

                  //  res.put("fuzzy_value", fb.getVariable("res").getValue());
                    fuzzyLine.setProbability(fb.getVariable("res").getValue());
                }
             //   fuzzyResult.add(res);

                fuzzyLines.add(fuzzyLine);
            }
           // queryEngine.resultToCSV(fuzzyResult,columns,"_CC.csv");
        }
        System.out.println("size fuzylines"+fuzzyLines.size());
        return fuzzyLines;
    }

    public ArrayList<DatasetFuzzyLine> executeFuzzyDataset(boolean csv, boolean details) throws CypherException, IOException {
        Result result;
        ArrayList<DatasetFuzzyLine> lines=new ArrayList<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.class_complexity > " + high + " RETURN cl.app_key as app_key, cl.class_complexity as cplx";
            if(details){
                query += ",cl.name as full_name";
            }
            result = graphDatabaseService.execute(query);
            List<String> columns = new ArrayList<>(result.columns());
            System.out.println("Hello");
            columns.add("fuzzy_value");
            int cc;
            Object o;
            List<Map> fuzzyResult = new ArrayList<>();
            File fcf = new File(fclFile);
            DatasetFuzzyLine datasetFuzzyLine;
            //We look if the file is in a directory otherwise we look inside the jar
            FIS fis;

            if(fcf.exists() && !fcf.isDirectory()){
                fis = FIS.load(fclFile, false);
            }else{
                fis = FIS.load(getClass().getResourceAsStream(fclFile),false);
            }
            FunctionBlock fb = fis.getFunctionBlock(null);
            HashMap res;
            while(result.hasNext()){

                    res = new HashMap(result.next());
                    cc= Integer.parseInt( res.get("cplx").toString());
                datasetFuzzyLine=new DatasetFuzzyLine(res.get("full_name").toString(),"",res.get("app_key").toString());
                if(cc >= veryHigh){
                    res.put("fuzzy_value", 1);
                    datasetFuzzyLine.setProbability(1);
                }else {
                    fb.setVariable("class_complexity",cc);
                    fb.evaluate();
                    res.put("fuzzy_value", fb.getVariable("res").getValue());
                    datasetFuzzyLine.setProbability(fb.getVariable("res").getValue());
                }
                fuzzyResult.add(res);
                lines.add(datasetFuzzyLine);
            }
            if (csv) {
                queryEngine.resultToCSV(fuzzyResult,columns,"_CC.csv");
            }

        }
        return lines;
    }


}
