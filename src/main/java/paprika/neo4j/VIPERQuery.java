package paprika.neo4j;

import com.guigarage.sdk.BDD.DatasetSimpleLine;
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
public class VIPERQuery extends Query {


    private VIPERQuery(QueryEngine queryEngine) {
            super(queryEngine);
        }

    public static VIPERQuery createVIPERQuery(QueryEngine queryEngine) {
        return new VIPERQuery(queryEngine);
    }

    @Override
    public void execute(boolean details) throws CypherException, IOException {
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (al:App) WHERE (al:App)-[:APP_OWNS_CLASS]->(:Class{is_interactor:true}) AND (al:App)-[:APP_OWNS_CLASS]->(:Class{is_router:true}) RETURN al.app_key as app_key";
            if(details){
                query += ",al.name as full_name";
            }else{
                query += ",count(al) as VIPER";
            }
            Result result = graphDatabaseService.execute(query);
            queryEngine.resultToCSV(result, "_VIPER.csv");
        }
    }

    public ArrayList<DatasetSimpleLine> executeDataset(boolean csv, boolean details) throws CypherException, IOException {
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (al:App) WHERE (al:App)-[:APP_OWNS_CLASS]->(:Class{is_interactor:true}) OR (al:App)-[:APP_OWNS_CLASS]->(:Class{is_router:true}) OR (al:App)-[:APP_OWNS_CLASS]->(:Class{is_presenter:true}) RETURN al.app_key as app_key";
            if(details){
                query += ",al.name as full_name";
            }else{
                query += ",count(al) as VIPER";
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
                    simpleLine = new DatasetSimpleLine(res.get("full_name").toString(),"","");
                    lines.add(simpleLine);
                }
            }
            if(csv)
            {
                queryEngine.resultToCSV(columns,list,"_VIPER.csv");

            }
            return lines;
        }
    }

    public HashMap<String, Integer> count()  {
        Result result;
        HashMap<String, Integer> res = new HashMap<>();
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query ="MATCH (al:App) WHERE (al:App)-[:APP_OWNS_CLASS]->(:Class{is_interactor:true})"+
                    " AND (al:App)-[:APP_OWNS_CLASS]->(:Class{is_router:true})RETURN "+
                    " count(al) as app_cpt";

            result = graphDatabaseService.execute(query);
            HashMap hashMap =new HashMap(result.next());
            res.put("app_cpt",Integer.parseInt(hashMap.get("app_cpt").toString()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }


    /* */

    public boolean executeApp(String appKey)  {
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (al:App) WHERE al.app_key='"+appKey+"' AND ((al)-[:APP_OWNS_CLASS]->(:Class{is_interactor:true}) OR (al)-[:APP_OWNS_CLASS]->(:Class{is_router:true})OR (al)-[:APP_OWNS_CLASS]->(:Class{is_presenter:true}))" +
                    " RETURN al.app_key as app_key";
            Result result = graphDatabaseService.execute(query);
            return (result.hasNext());
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}


