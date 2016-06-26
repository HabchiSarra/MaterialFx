package paprika.neo4j;

import com.guigarage.sdk.BDD.DatasetFuzzyLine;
import com.guigarage.sdk.BDD.DatasetSimpleLine;
import com.guigarage.sdk.BDD.FuzzyLine;
import com.guigarage.sdk.BDD.SimpleLine;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import org.jfree.data.general.Dataset;
import org.neo4j.cypher.CypherException;
import org.neo4j.cypher.internal.compiler.v2_2.functions.Str;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Geoffrey Hecht on 14/08/15.
 */
public class SAKQuery extends FuzzyQuery{
    protected static double high = 2;
    protected static double veryHigh = 2;

    private SAKQuery(QueryEngine queryEngine) {
        super(queryEngine);
        fclFile = "fcl/SwissArmyKnife.fcl";
    }

    public static SAKQuery createSAKQuery(QueryEngine queryEngine) {
        return new SAKQuery(queryEngine);
    }

    public void execute(boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE HAS(cl.is_interface) AND cl.number_of_methods > " + veryHigh + " RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as SAK";
            }
            result = graphDatabaseService.execute(query);
            queryEngine.resultToCSV(result,"_SAK_NO_FUZZY.csv");
        }
    }

    public HashMap<String, Integer> count()  {
        Result result;
        HashMap<String, Integer> res = new HashMap<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query ="MATCH (cl:Class) WHERE HAS(cl.is_interface) AND cl.number_of_methods >" + veryHigh +
                    "  RETURN count(cl) as class_cpt, count(distinct(cl.app_key)) as app_cpt";

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
            String query = "MATCH (cl:Class) WHERE HAS(cl.is_interface) AND cl.number_of_methods > " + veryHigh + " RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as SAK";
            }
            result = graphDatabaseService.execute(query);

            ArrayList<HashMap<String, Object>> list =new ArrayList<>();
            List<String> columns = result.columns();
            ArrayList<DatasetSimpleLine> lines = new ArrayList<>();
            DatasetSimpleLine simpleLine;
            if(result !=null){
                while(result.hasNext()) {
                    HashMap res = new HashMap(result.next());
                    list.add(res);
                    simpleLine = new DatasetSimpleLine(res.get("full_name").toString(),"",res.get("app_key").toString());
                    lines.add(simpleLine);
                }
            }
            if(csv)
            {
                queryEngine.resultToCSV(columns,list,"_SAK_NO_FUZZY.csv");

            }
            return lines;
        }
    }
    public void executeFuzzy(boolean details) throws CypherException, IOException {
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (cl:Class) WHERE HAS(cl.is_interface) AND cl.number_of_methods > " + high + " RETURN cl.app_key as app_key,cl.number_of_methods as number_of_methods";
                if(details){
                    query += ",cl.name as full_name";
                }
                result = graphDatabaseService.execute(query);
                List<String> columns = new ArrayList<>(result.columns());
                columns.add("fuzzy_value");
                int cc;
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
                while(result.hasNext()){
                    HashMap res = new HashMap(result.next());
                    cc = Integer.parseInt( res.get("number_of_methods").toString());
                    if(cc >= veryHigh){
                        res.put("fuzzy_value", 1);
                    }else {
                        fb.setVariable("number_of_methods",cc);
                        fb.evaluate();
                        res.put("fuzzy_value", fb.getVariable("res").getValue());
                    }
                    fuzzyResult.add(res);
                    }
                    queryEngine.resultToCSV(fuzzyResult,columns,"_SAK.csv");
            }
    }
    public ArrayList<SimpleLine> executeApp(String appKey, boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.app_key='"+appKey+"' AND HAS(cl.is_interface) AND cl.number_of_methods > " + veryHigh + " RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as SAK";
            }
            result = graphDatabaseService.execute(query);
            ArrayList<SimpleLine> lines = new ArrayList<>();
            SimpleLine simpleLine;
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


    public ArrayList<FuzzyLine> executeFuzzyApp(String appKey, boolean details) throws CypherException, IOException {
        Result result;
        ArrayList<FuzzyLine> fuzzyLines = new ArrayList<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.app_key='"+appKey+"' AND HAS(cl.is_interface) AND cl.number_of_methods > " + high + " RETURN cl.app_key as app_key,cl.number_of_methods as number_of_methods";
            if(details){
                query += ",cl.name as full_name";
            }
            result = graphDatabaseService.execute(query);
            FuzzyLine fuzzyLine;

            int cc;
              File fcf = new File(fclFile);
            //We look if the file is in a directory otherwise we look inside the jar
            FIS fis;
            if(fcf.exists() && !fcf.isDirectory()){
                fis = FIS.load(fclFile, false);
            }else{
                fis = FIS.load(getClass().getResourceAsStream(fclFile),false);
            }
            FunctionBlock fb = fis.getFunctionBlock(null);
            while(result.hasNext()){
                HashMap res = new HashMap(result.next());
                cc = Integer.parseInt(res.get("number_of_methods").toString());
                fuzzyLine = new FuzzyLine(res.get("full_name").toString(),"");
                if(cc >= veryHigh){
                    fuzzyLine.setProbability(1);
                }else {
                    fb.setVariable("number_of_methods",cc);
                    fb.evaluate();
                 //   res.put("fuzzy_value", fb.getVariable("res").getValue());
                    fuzzyLine.setProbability(fb.getVariable("res").getValue());
                }
                fuzzyLines.add(fuzzyLine);
           //     fuzzyResult.add(res);
            }
          //  queryEngine.resultToCSV(fuzzyResult,columns,"_SAK.csv");
        }
        return fuzzyLines;
    }

    public ArrayList<DatasetFuzzyLine> executeFuzzyDataset(boolean csv, boolean details) throws CypherException, IOException {
        Result result;
        ArrayList<DatasetFuzzyLine> lines=new ArrayList<>();

        System.out.println("begining method");
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE HAS(cl.is_interface) AND cl.number_of_methods > " + high + " RETURN cl.app_key as app_key,cl.number_of_methods as number_of_methods";
            if(details){
                query += ",cl.name as full_name";
            }
            result = graphDatabaseService.execute(query);
            System.out.println("afterres method");
            List<String> columns = new ArrayList<>(result.columns());
            columns.add("fuzzy_value");
            int cc;
            List<Map> fuzzyResult = new ArrayList<>();
            File fcf = new File(fclFile);
            DatasetFuzzyLine datasetFuzzyLine;
            //We look if the file is in a directory otherwise we look inside the jar
            FIS fis;
            System.out.println("before fis");
            if(fcf.exists() && !fcf.isDirectory()){
                System.out.println("YES");
                fis = FIS.load(fclFile, false);
            }else{
                System.out.println("NO");
                fis = FIS.load(getClass().getResourceAsStream(fclFile),false);
            }
            System.out.println("after fis");
            FunctionBlock fb = fis.getFunctionBlock(null);

            while(result.hasNext()){
                HashMap res = new HashMap(result.next());
                System.out.println("before cc");
                cc = Integer.parseInt( res.get("number_of_methods").toString());
                System.out.println("after cc");
                datasetFuzzyLine=new DatasetFuzzyLine(res.get("full_name").toString(),"",res.get("app_key").toString());
                System.out.println("after dataset");

                if(cc >= veryHigh){
                    res.put("fuzzy_value", 1);
                    datasetFuzzyLine.setProbability(1);

                }else {
                    fb.setVariable("number_of_methods",cc);
                    fb.evaluate();
                    res.put("fuzzy_value", fb.getVariable("res").getValue());
                    datasetFuzzyLine.setProbability(fb.getVariable("res").getValue());

                }
                fuzzyResult.add(res);
                lines.add(datasetFuzzyLine);

            }
            if(csv){
                queryEngine.resultToCSV(fuzzyResult,columns,"_SAK.csv");
            }
        }
        return lines;
    }
}
