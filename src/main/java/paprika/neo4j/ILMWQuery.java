package paprika.neo4j;

import com.guigarage.sdk.BDD.SimpleLine;
import org.neo4j.cypher.CypherException;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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
                    System.out.println("QQ");
                    HashMap res = new HashMap(result.next());
                    simpleLine = new SimpleLine(res.get("full_name").toString(),"");
                    System.out.println("size: "+ res.size());
                    lines.add(simpleLine);
                    //   lines.add(new SimpleLine("cla","bla","ala"));
                    // lines.add(new SimpleLine("cla","bla","ala"));
                    //  System.out.println("size: "+ res.size());
                }
            }

            return lines;
        }
    }
}
