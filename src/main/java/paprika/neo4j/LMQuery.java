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

/**
 * Created by Geoffrey Hecht on 14/08/15.
 */
public class LMQuery extends FuzzyQuery{
    protected static double high = 30.5;
    protected static double veryHigh = 47;

    private LMQuery(QueryEngine queryEngine) {
        super(queryEngine);
        fclFile = "fcl/LongMethod.fcl";
    }

    public static LMQuery createLMQuery(QueryEngine queryEngine) {
        return new LMQuery(queryEngine);
    }

    public void execute(boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (m:Method) WHERE m.number_of_lines >" + veryHigh + " RETURN m.app_key as app_key";
            if(details){
                query += ",m.full_name as full_name";
            }else{
                query += ",count(m) as LM";
            }
            result = graphDatabaseService.execute(query);
            queryEngine.resultToCSV(result,"_LM_NO_FUZZY.csv");
        }
    }

     public HashMap<String, Integer> count()  {
        Result result;
        HashMap<String, Integer> res = new HashMap<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query ="MATCH(cl:Class)-[:CLASS_OWNS_METHOD]->(m:Method) where m.number_of_lines>"+veryHigh+
                    "  return count(distinct(cl)) as class_cpt, count(distinct(m)) as method_cpt, count(distinct(m.app_key)) as app_cpt ";

            result = graphDatabaseService.execute(query);
            HashMap hashMap =new HashMap(result.next());
            res.put("class_cpt",Integer.parseInt(hashMap.get("class_cpt").toString()));
            res.put("app_cpt",Integer.parseInt(hashMap.get("app_cpt").toString()));
            res.put("method_cpt",Integer.parseInt(hashMap.get("method_cpt").toString()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
     }

    public HashMap<String, Integer> countFuzzy()  {
        Result result;
        HashMap<String, Integer> res = new HashMap<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query ="MATCH(cl:Class)-[:CLASS_OWNS_METHOD]->(m:Method) where m.number_of_lines>"+high+
                    "  return count(distinct(cl)) as class_cpt, count(distinct(m)) as method_cpt, count(distinct(m.app_key)) as app_cpt ";

            result = graphDatabaseService.execute(query);
            HashMap hashMap =new HashMap(result.next());
            res.put("class_cpt",Integer.parseInt(hashMap.get("class_cpt").toString()));
            res.put("app_cpt",Integer.parseInt(hashMap.get("app_cpt").toString()));
            res.put("method_cpt",Integer.parseInt(hashMap.get("method_cpt").toString()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }


    public ArrayList<DatasetSimpleLine> executeDataset(boolean csv, boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (m:Method) WHERE m.number_of_lines >" + veryHigh + " RETURN m.app_key as app_key, m.name as name";
            if(details){
                query += ",m.full_name as full_name";
            }else{
                query += ",count(m) as LM";
            }
            result = graphDatabaseService.execute(query);

            ArrayList<HashMap<String, Object>> list =new ArrayList<>();
            List<String> columns = result.columns();


            String classname;
            String[] tabString;
            ArrayList<DatasetSimpleLine> lines = new ArrayList<>();
            if(result !=null){
                while(result.hasNext()) {
                    System.out.println("sara is working i love you sara <3 ");
                    HashMap res = new HashMap(result.next());
                    list.add(res);
                    tabString = res.get("full_name").toString().split("#");
                    classname=tabString[1];
                    lines.add(new DatasetSimpleLine(res.get("name").toString(),classname, res.get("app_key").toString()));
                }
            }
            if(csv){
                queryEngine.resultToCSV(columns,list,"_LM_NO_FUZZY.csv");
            }
            System.out.println("n7abek ");
            return lines;

        }
    }

    public void executeFuzzy(boolean details) throws CypherException, IOException {
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query =  "MATCH (m:Method) WHERE m.number_of_lines >" + high + " RETURN m.app_key as app_key, m.number_of_lines as number_of_lines";
                if(details){
                    query += ",m.full_name as full_name";
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
                    cc = (int) res.get("number_of_lines");
                    if(cc >= veryHigh){
                        res.put("fuzzy_value", 1);
                    }else {
                        fb.setVariable("number_of_lines",cc);
                        fb.evaluate();
                        res.put("fuzzy_value", fb.getVariable("res").getValue());
                    }
                    fuzzyResult.add(res);
                    }
                    queryEngine.resultToCSV(fuzzyResult,columns,"_LM.csv");
            }
    }

    public ArrayList<SimpleLine> executeApp(String appKey, boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (m:Method) WHERE m.app_key='"+appKey+"' AND  m.number_of_lines >" + veryHigh + " RETURN m.app_key as app_key, m.name as name";
            if(details){
                query += ",m.full_name as full_name";
            }else{
                query += ",count(m) as LM";
            }
            result = graphDatabaseService.execute(query);
            String classname;
            String[] tabString;
            ArrayList<SimpleLine> lines = new ArrayList<>();
            if(result !=null){
                while(result.hasNext()) {
                    HashMap res = new HashMap(result.next());

                    tabString = res.get("full_name").toString().split("#");
                    classname=tabString[1];
                    lines.add(new SimpleLine(res.get("name").toString(),classname));
                }
            }
            return lines;
        }
    }


    public ArrayList<FuzzyLine> executeFuzzyApp(String appKey, boolean details) throws CypherException, IOException {
        Result result;
        ArrayList<FuzzyLine> fuzzyLines = new ArrayList<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query =  "MATCH (m:Method) WHERE m.app_key='"+appKey+"' AND m.number_of_lines >" + high + " RETURN m.app_key as app_key, m.number_of_lines as number_of_lines, m.name as name";
            if(details){
                query += ",m.full_name as full_name";
            }
            result = graphDatabaseService.execute(query);
            int cc;
            File fcf = new File(fclFile);
            //We look if the file is in a directory otherwise we look inside the jar
            FuzzyLine fuzzyLine;
            String[] tabString;
            String classname;
            FIS fis;
            if(fcf.exists() && !fcf.isDirectory()){
                fis = FIS.load(fclFile, false);
            }else{
                fis = FIS.load(getClass().getResourceAsStream(fclFile),false);
            }
            FunctionBlock fb = fis.getFunctionBlock(null);
            while(result.hasNext()){
                HashMap res = new HashMap(result.next());

                tabString = res.get("full_name").toString().split("#");
                classname=tabString[1];
                fuzzyLine=new FuzzyLine(res.get("name").toString(), classname);
                cc = (int) res.get("number_of_lines");
                if(cc >= veryHigh){
                   // res.put("fuzzy_value", 1);
                    fuzzyLine.setProbability(1);
                }else {
                    fb.setVariable("number_of_lines",cc);
                    fb.evaluate();
                   // res.put("fuzzy_value", fb.getVariable("res").getValue());
                    fuzzyLine.setProbability(fb.getVariable("res").getValue());
                }
                fuzzyLines.add(fuzzyLine);
            }

        }
        return fuzzyLines;
    }
    public ArrayList<DatasetFuzzyLine> executeFuzzyDataset(boolean csv, boolean details) throws CypherException, IOException {
        Result result;
        ArrayList<DatasetFuzzyLine> lines=new ArrayList<>();

        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query =  "MATCH (m:Method) WHERE m.number_of_lines >" + high + " RETURN m.app_key as app_key, m.number_of_lines as number_of_lines, m.name as name";
            if(details){
                query += ",m.full_name as full_name";
            }
            result = graphDatabaseService.execute(query);
            List<String> columns = new ArrayList<>(result.columns());
            columns.add("fuzzy_value");
            int cc;
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
            String[] tabString;
            String classname;
            FunctionBlock fb = fis.getFunctionBlock(null);
            while(result.hasNext()){
                HashMap res = new HashMap(result.next());
                cc = (int) res.get("number_of_lines");
                tabString = res.get("full_name").toString().split("#");
                classname=tabString[1];
                datasetFuzzyLine=new DatasetFuzzyLine(res.get("name").toString(),classname,res.get("app_key").toString());
                if(cc >= veryHigh){
                    res.put("fuzzy_value", 1);
                    datasetFuzzyLine.setProbability(1);
                }else {
                    fb.setVariable("number_of_lines",cc);
                    fb.evaluate();
                    res.put("fuzzy_value", fb.getVariable("res").getValue());
                    datasetFuzzyLine.setProbability(fb.getVariable("res").getValue());
                }
                fuzzyResult.add(res);
                lines.add(datasetFuzzyLine);
            }
            if(csv){
                queryEngine.resultToCSV(fuzzyResult,columns,"_LM.csv");
            }


        }
        return lines;
    }
}
