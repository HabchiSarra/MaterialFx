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
 * Created by Sarra on 22/05/2016.
 */
public class ILMWQuery extends Query {


    private ILMWQuery(QueryEngine queryEngine) {
        super(queryEngine);
    }

    public static ILMWQuery createILMWQuery(QueryEngine queryEngine) {
        return new ILMWQuery(queryEngine);
    }

    @Override
    public void execute(boolean details) throws CypherException, IOException {
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE HAS(cl.is_view_controller) AND NOT (cl:Class)-[:CLASS_OWNS_METHOD]->(:Method{name:'didReceiveMemoryWarning'}) RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as ILMW";
            }
            Result result = graphDatabaseService.execute(query);
            queryEngine.resultToCSV(result, "_ILMW.csv");
        }
    }

    public HashMap<String, Integer> count()  {
        Result result;
        HashMap<String, Integer> res = new HashMap<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query ="MATCH (cl:Class) WHERE HAS(cl.is_view_controller) AND NOT (cl:Class)-[:CLASS_OWNS_METHOD]->(:Method{name:'didReceiveMemoryWarning'})"+
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


    public ArrayList<DatasetSimpleLine> executeDataset(boolean csv , boolean details) throws CypherException, IOException {
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE HAS(cl.is_view_controller) AND NOT (cl:Class)-[:CLASS_OWNS_METHOD]->(:Method{name:'didReceiveMemoryWarning'}) RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as ILMW";
            }
            Result result = graphDatabaseService.execute(query);
            ArrayList<HashMap<String, Object>> list =new ArrayList<>();
            List<String> columns = result.columns();

            ArrayList<DatasetSimpleLine> lines = new ArrayList<>();
            DatasetSimpleLine simpleLine;
            if(result !=null){
                while(result.hasNext()) {
                    HashMap res = new HashMap(result.next());
                    list.add(res);
                    simpleLine = new DatasetSimpleLine(res.get("full_name").toString(),"", res.get("app_key").toString());
                    lines.add(simpleLine);
                }
            }
            if(csv){
                queryEngine.resultToCSV(columns,list, "_ILMW.csv");
            }
            return lines;

        }
    }
    public ArrayList<SimpleLine> executeApp(String appKey, boolean details) throws CypherException, IOException {
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE cl.app_key='"+appKey+"' AND HAS(cl.is_view_controller) AND NOT (cl:Class)-[:CLASS_OWNS_METHOD]->(:Method{name:'didReceiveMemoryWarning'}) RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as ILMW";
            }
            Result result = graphDatabaseService.execute(query);
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
}
