package paprika.neo4j;

import com.guigarage.sdk.BDD.DatasetSimpleLine;
import com.guigarage.sdk.BDD.SimpleLine;
import org.neo4j.cypher.CypherException;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sarra on 24/05/2016.
 */
public class CSCQuery extends Query {


    private CSCQuery(QueryEngine queryEngine) {
        super(queryEngine);
    }

    public static CSCQuery createCSCQuery(QueryEngine queryEngine) {
        return new CSCQuery(queryEngine);
    }

    @Override
    public void execute(boolean details) throws CypherException, IOException {
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE (cl:Class)-[:CLASS_OWNS_METHOD]->(:Method)-[:CALLS]->(:ExternalMethod{name:'sendSynchronousRequest:returningResponse:error:'}) RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as CSC";
            }
            Result result = graphDatabaseService.execute(query);
            queryEngine.resultToCSV(result, "_CSC.csv");
        }
    }

    public HashMap<String, Integer> count(){
        Result result;
        HashMap<String, Integer> res = new HashMap<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE (cl:Class)-[:CLASS_OWNS_METHOD]->(:Method)-[:CALLS]->(:ExternalMethod{name:'sendSynchronousRequest:returningResponse:error:'})  RETURN count(distinct(cl.app_key)) as app_cpt";

            result = graphDatabaseService.execute(query);
            HashMap hashMap =new HashMap(result.next());
            res.put("app_cpt",Integer.parseInt(hashMap.get("app_cpt").toString()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }

    public ArrayList<DatasetSimpleLine> executeDataset(boolean csv, boolean details) throws CypherException, IOException {
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (m:Method)-[:CALLS]->(:ExternalMethod{name:'sendSynchronousRequest:returningResponse:error:'}) RETURN m.app_key as app_key";
            if(details){
                query += ",m.full_name as full_name";
            }else{
                query += ",count(m) as CSC";
            }
            Result result = graphDatabaseService.execute(query);
            ArrayList<HashMap<String, Object>> list =new ArrayList<>();
            List<String> columns = result.columns();


            String classname;
            String[] tabString;
            ArrayList<DatasetSimpleLine> lines = new ArrayList<>();
            if(result !=null){
                while(result.hasNext()) {
                    HashMap res = new HashMap(result.next());
                    list.add(res);
                    tabString = res.get("full_name").toString().split("#");
                    classname = tabString[1];
                    lines.add(new DatasetSimpleLine(tabString[0],classname, res.get("app_key").toString()));
                }
            }

            if(csv){
                queryEngine.resultToCSV(columns, list, "_CSC.csv");
            }
            return lines;
        }
    }

    public ArrayList<SimpleLine> executeApp(String appKey, boolean details) throws CypherException, IOException {
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (m:Method) WHERE m.app_key='"+appKey+"' AND (m:Method)-[:CALLS]->(:ExternalMethod{name:'sendSynchronousRequest:returningResponse:error:'}) RETURN m.app_key as app_key, m.name as name";
            if(details){
                query += ",m.full_name as full_name";
            }else{
                query += ",count(m) as CSC";
            }
            Result result = graphDatabaseService.execute(query);
            String classname;
            String[] tabString;
            ArrayList<SimpleLine> lines = new ArrayList<>();
            if(result !=null){
                while(result.hasNext()) {
                    HashMap res = new HashMap(result.next());
                    tabString = res.get("full_name").toString().split("#");
                    classname = tabString[1];
                    lines.add(new SimpleLine(res.get("name").toString(),classname));
                }
            }
            return lines;
        }
    }
}