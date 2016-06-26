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
 * Created by Sarra on 22/05/2016.
 */
public class MVCQuery extends FuzzyQuery {
    protected static double high_noa = 13.5;
    protected static double veryHigh_noa = 24;
    protected static double high_nom = 19.5;
    protected static double veryHigh_nom = 30;
    protected static double veryLow_camc =0.1458333283662796;
    protected static double low_camc = 0.2;
    protected static double veryHigh_nol =502;
    protected static double high_nol =375;

    private MVCQuery(QueryEngine queryEngine) {
        super(queryEngine);
        fclFile = "fcl/MassiveViewController.fcl";
    }

    public static MVCQuery createMVCQuery(QueryEngine queryEngine) {
        return new MVCQuery(queryEngine);
    }

    public void execute(boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE HAS(cl.is_view_controller) AND cl.cohesion_among_methods_of_class <"
                    + low_camc + " AND cl.number_of_methods > " + veryHigh_nom + " AND cl.number_of_lines >"+high_nol+" RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as MVC";
            }
            result = graphDatabaseService.execute(query);
            queryEngine.resultToCSV(result,"_MVC_NO_FUZZY.csv");
        }
    }

    public HashMap<String, Integer> count()  {
        Result result;
        HashMap<String, Integer> res = new HashMap<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE HAS(cl.is_view_controller) AND cl.cohesion_among_methods_of_class <"
                    + low_camc + " AND cl.number_of_methods > " + veryHigh_nom + " AND cl.number_of_lines >"+high_nol+
                    " RETURN count(cl) as class_cpt, count(distinct(cl.app_key)) as app_cpt";

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
            String query = "MATCH (cl:Class) WHERE HAS(cl.is_view_controller) AND cl.cohesion_among_methods_of_class <"
                    + low_camc + " AND cl.number_of_methods > " + veryHigh_nom + " AND cl.number_of_lines >"+high_nol+" RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as MVC";
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
            if(csv){
                queryEngine.resultToCSV(columns,list,"_MVC_NO_FUZZY.csv");
            }
            return lines;

        }
    }

    public void executeFuzzy(boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE HAS(cl.is_view_controller) AND cl.cohesion_among_methods_of_class <"+ low_camc
                    + " AND cl.number_of_methods > "+ high_nom
                    + " AND cl.number_of_attributes > "+ high_noa
                    +  " AND cl.number_of_lines >"+high_nol
                    +" RETURN cl.app_key as app_key,cl.cohesion_among_methods_of_class as cohesion_among_methods_of_class,cl.number_of_methods as number_of_methods, cl.number_of_attributes as number_of_attributes, cl.number_of_lines as number_of_lines";
            if(details){
                query += ",cl.name as full_name";
            }
            result = graphDatabaseService.execute(query);
            List<String> columns = new ArrayList<>(result.columns());
            columns.add("fuzzy_value");
            int nol,noa,nom; double camc;
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
                camc = Float.parseFloat(res.get("cohesion_among_methods_of_class").toString());
                noa = Integer.parseInt( res.get("number_of_attributes").toString());
                nom = Integer.parseInt( res.get("number_of_methods").toString());
                nol = Integer.parseInt( res.get("number_of_lines").toString());
                if(camc <= veryLow_camc && noa >= veryHigh_noa && nom >= veryHigh_nom && nol>= veryHigh_nol){
                    res.put("fuzzy_value", 1);
                }else {
                    fb.setVariable("cohesion_among_methods_of_class",camc);
                    fb.setVariable("number_of_attributes",noa);
                    fb.setVariable("number_of_methods",nom);
                    fb.setVariable("number_of_lines",nol);
                    fb.evaluate();
                    res.put("fuzzy_value", fb.getVariable("res").getValue());
                }
                fuzzyResult.add(res);
            }
            queryEngine.resultToCSV(fuzzyResult,columns,"MVC.csv");
        }
    }

    public ArrayList<SimpleLine> executeApp(String appKey, boolean details) throws CypherException, IOException {
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.app_key='"+appKey+"' AND HAS(cl.is_view_controller) AND cl.cohesion_among_methods_of_class <"
                    + low_camc + " AND cl.number_of_methods > " + veryHigh_nom + " AND cl.number_of_lines >"+high_nol+" RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as MVC";
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


    public ArrayList<FuzzyLine> executeFuzzyApp(String appKey, boolean details) throws CypherException, IOException {
        Result result;
        ArrayList<FuzzyLine> fuzzyLines = new ArrayList<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.app_key='"+appKey+"' AND HAS(cl.is_view_controller) AND cl.cohesion_among_methods_of_class <"+ low_camc
                    + " AND cl.number_of_methods > "+ high_nom
                    + " AND cl.number_of_attributes > "+ high_noa
                    +  " AND cl.number_of_lines >"+high_nol
                    +" RETURN cl.app_key as app_key,cl.cohesion_among_methods_of_class as cohesion_among_methods_of_class,cl.number_of_methods as number_of_methods, cl.number_of_attributes as number_of_attributes, cl.number_of_lines as number_of_lines";
            if(details){
                query += ",cl.name as full_name";
            }
            result = graphDatabaseService.execute(query);
            FuzzyLine fuzzyLine;
            int nol,noa,nom; double camc;

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
                fuzzyLine = new FuzzyLine(res.get("full_name").toString(), "");
                camc = Float.parseFloat(res.get("cohesion_among_methods_of_class").toString());
                noa = Integer.parseInt( res.get("number_of_attributes").toString());
                nom = Integer.parseInt(res.get("number_of_methods").toString());
                nol = Integer.parseInt( res.get("number_of_lines").toString());
                if(camc <= veryLow_camc && noa >= veryHigh_noa && nom >= veryHigh_nom && nol>= veryHigh_nol){
                    //res.put("fuzzy_value", 1);
                    fuzzyLine.setProbability(1);
                }else {
                    fb.setVariable("cohesion_among_methods_of_class",camc);
                    fb.setVariable("number_of_attributes",noa);
                    fb.setVariable("number_of_methods",nom);
                    fb.setVariable("number_of_lines",nol);
                    fb.evaluate();
                   // res.put("fuzzy_value", fb.getVariable("res").getValue());
                    fuzzyLine.setProbability(fb.getVariable("res").getValue());
                }
                fuzzyLines.add(fuzzyLine);
            }
           // queryEngine.resultToCSV(fuzzyResult,columns,"MVC.csv");
        }
        return fuzzyLines;
    }
    public ArrayList<DatasetFuzzyLine> executeFuzzyDataset(boolean csv, boolean details) throws CypherException, IOException {
        Result result;
        ArrayList<DatasetFuzzyLine> lines=new ArrayList<>();

        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE HAS(cl.is_view_controller) AND cl.cohesion_among_methods_of_class <"+ low_camc
                    + " AND cl.number_of_methods > "+ high_nom
                    + " AND cl.number_of_attributes > "+ high_noa
                    +  " AND cl.number_of_lines >"+high_nol
                    +" RETURN cl.app_key as app_key,cl.cohesion_among_methods_of_class as cohesion_among_methods_of_class,cl.number_of_methods as number_of_methods, cl.number_of_attributes as number_of_attributes, cl.number_of_lines as number_of_lines";
            if(details){
                query += ",cl.name as full_name";
            }
            result = graphDatabaseService.execute(query);
            List<String> columns = new ArrayList<>(result.columns());
            columns.add("fuzzy_value");
            int nol,noa,nom; double camc;
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
            while(result.hasNext()){
                HashMap res = new HashMap(result.next());
                camc = Float.parseFloat(res.get("cohesion_among_methods_of_class").toString());
                noa = Integer.parseInt( res.get("number_of_attributes").toString());
                nom = Integer.parseInt( res.get("number_of_methods").toString());
                nol = Integer.parseInt( res.get("number_of_lines").toString());
                datasetFuzzyLine=new DatasetFuzzyLine(res.get("full_name").toString(),"",res.get("app_key").toString());
                if(camc <= veryLow_camc && noa >= veryHigh_noa && nom >= veryHigh_nom && nol>= veryHigh_nol){
                    res.put("fuzzy_value", 1);
                    datasetFuzzyLine.setProbability(1);
                }else {
                    fb.setVariable("cohesion_among_methods_of_class",camc);
                    fb.setVariable("number_of_attributes",noa);
                    fb.setVariable("number_of_methods",nom);
                    fb.setVariable("number_of_lines",nol);
                    fb.evaluate();
                    res.put("fuzzy_value", fb.getVariable("res").getValue());
                    datasetFuzzyLine.setProbability(fb.getVariable("res").getValue());
                }
                fuzzyResult.add(res);
                lines.add(datasetFuzzyLine);
            }
            if(csv){
                queryEngine.resultToCSV(fuzzyResult,columns,"MVC.csv");
            }
        }
        return lines;
    }
}
