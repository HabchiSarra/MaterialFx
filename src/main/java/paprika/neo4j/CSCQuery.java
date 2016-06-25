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

    public ArrayList<DatasetSimpleLine> executeDataset(boolean csv, boolean details) throws CypherException, IOException {
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "MATCH (cl:Class) WHERE (cl:Class)-[:CLASS_OWNS_METHOD]->(:Method)-[:CALLS]->(:ExternalMethod{name:'sendSynchronousRequest:returningResponse:error:'}) RETURN cl.app_key as app_key";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as CSC";
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
                    lines.add(new DatasetSimpleLine(res.get("full_name").toString(),"", res.get("app_key").toString()));
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
            String query = "MATCH (cl:Class) WHERE cl.app_key='"+appKey+"' AND (cl:Class)-[:CLASS_OWNS_METHOD]->(:Method)-[:CALLS]->(m:ExternalMethod{name:'sendSynchronousRequest:returningResponse:error:'}) RETURN cl.app_key as app_key, m.name as name";
            if(details){
                query += ",cl.name as full_name";
            }else{
                query += ",count(cl) as CSC";
            }
            Result result = graphDatabaseService.execute(query);
            String classname;
            String[] tabString;
            ArrayList<SimpleLine> lines = new ArrayList<>();
            if(result !=null){
                while(result.hasNext()) {
                    HashMap res = new HashMap(result.next());
                    lines.add(new SimpleLine(res.get("name").toString(),res.get("full_name").toString()));
                }
            }
            return lines;
        }
    }
}