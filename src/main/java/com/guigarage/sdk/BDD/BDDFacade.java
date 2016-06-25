package com.guigarage.sdk.BDD;

import com.guigarage.sdk.demos.SimpleViewAppDemo1;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.neo4j.cypher.CypherException;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import paprika.analyzer.Analyzer;
import paprika.analyzer.GraphsGenerator;
import paprika.analyzer.MetricsCalculator;
import paprika.analyzer.ModelGenerator;
import paprika.model.PaprikaApp;
import paprika.neo4j.*;
import paprika.parser.ObjCLexer;
import paprika.parser.ObjCParser;
import paprika.parser.ThrowingErrorListener;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sarra on 20/06/2016.
 */
public class BDDFacade {

    protected QueryEngine queryEngine;
    protected GraphDatabaseService graphDatabaseService;

    public BDDFacade(QueryEngine queryEngine) {
        this.queryEngine = queryEngine;
        graphDatabaseService = queryEngine.getGraphDatabaseService();
    }

    public ArrayList<PaprikaApp> getApps(){
        Result result;
        try (Transaction ignored = graphDatabaseService.beginTx()) {
            String query = "match (al:App) return al.name as name, al.app_key as app_key, al.number_of_classes as number_of_classes, al.category as category;";
            result = graphDatabaseService.execute(query);
            String name;
            String key;
            int numberOfClasses;
            String category;
            ArrayList<PaprikaApp> listApps = new ArrayList<>();

            while(result.hasNext()){
                HashMap res = new HashMap(result.next());
               // System.out.println("pss1");
                name = (String) res.get("name");
               // System.out.println("pss");
                key = (String) res.get("app_key");
             //   camc =(float) o;
                category = (String) res.get("category");
                numberOfClasses = (int) res.get("number_of_classes");
                PaprikaApp app = PaprikaApp.createPaprikaApp(name,category,key);
                app.setNumberOfClasses(numberOfClasses);
                listApps.add(app);
            }
            return listApps;
        }catch (CypherException ce){
            System.out.println(" Cypher Exception: "+ ce.getMessage());
            ce.printStackTrace();
            return new ArrayList<>(0);
        }
    }



        public Map<String,Double> calculateClassComplexityQuartile() {
            Map<String, Double> res=null;
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:Class) WHERE NOT HAS(n.is_interface) AND n.number_of_methods<>0  RETURN percentileCont(n.class_complexity,0.25) as Q1, percentileCont(n.class_complexity,0.5) as MED, percentileCont(n.class_complexity,0.75) as Q3";
                result = graphDatabaseService.execute(query);
                res = calculeTresholds(result);
                return res;
            }
        }

        public Map<String, Double> calculateCyclomaticComplexityQuartile() {
            Map<String, Double> res =null;
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:Method) WHERE NOT HAS(n.is_getter) AND NOT HAS(n.is_setter) AND (n.cyclomatic_complexity > 0 AND n.number_of_lines>0 ) RETURN percentileCont(n.cyclomatic_complexity,0.25) as Q1, percentileCont(n.cyclomatic_complexity,0.5) as MED, percentileCont(n.cyclomatic_complexity,0.75) as Q3";
                result = graphDatabaseService.execute(query);
                res = calculeTresholds(result);
            }
            return res;
        }

        public Map<String, Double> calculateNumberofMethodLines() {
            Map<String, Double> res=null;
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:Method) WHERE NOT HAS(n.is_getter) AND NOT HAS(n.is_setter) AND n.number_of_lines > 0 RETURN percentileCont(n.number_of_lines,0.25) as Q1, percentileCont(n.number_of_lines,0.5) as MED, percentileCont(n.number_of_lines,0.75) as Q3";
                result = graphDatabaseService.execute(query);
                res = calculeTresholds(result);
            }
           return res;
        }

        public Map<String, Double> calculateNumberofClassLines() {
            Map<String, Double> res;
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:Class) WHERE NOT HAS(n.is_interface)  AND (n.number_of_lines >10 AND n.number_of_methods<>0) RETURN percentileCont(n.number_of_lines,0.25) as Q1, percentileCont(n.number_of_lines,0.5) as MED, percentileCont(n.number_of_lines,0.75) as Q3";
                result = graphDatabaseService.execute(query);
                res = calculeTresholds(result);
            }
            return res;
        }

        public Map<String, Double> calculateNumberofViewControllerLines() {
            Map<String, Double> res=null;
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:Class) WHERE NOT HAS(n.is_interface)  AND (n.number_of_lines >0 AND n.number_of_methods<>0  AND n.is_view_controller) RETURN percentileCont(n.number_of_lines,0.25) as Q1, percentileCont(n.number_of_lines,0.5) as MED, percentileCont(n.number_of_lines,0.75) as Q3";
                result = graphDatabaseService.execute(query);
                res = calculeTresholds(result);
            }
            return res;
        }

        public Map calculateQuartile(String nodeType, String property){
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:" + nodeType + ") RETURN percentileCont(n." + property + ",0.25) as Q1,percentileCont(n." + property + ",0.5) as MED, percentileCont(n." + property + ",0.75) as Q3";
                result = graphDatabaseService.execute(query);
                return calculeTresholds(result);
            }
        }

        private Map calculeTresholds(Result result){
            Map<String, Double> res = new HashMap<>();
            //Only one result in that case
            while (result.hasNext())
            {
                Map<String,Object> row = result.next();
                //Sometime neo4J return a double or an int... With toString it's works in all cases
                double q1 = Double.valueOf(row.get("Q1").toString());
                double med = Double.valueOf(row.get("MED").toString());
                double q3 = Double.valueOf(row.get("Q3").toString());
                double high  = q3 + ( 1.5 * ( q3 - q1));
                double very_high  = q3 + ( 3 * ( q3 - q1));
                res.put("Q1",q1);
                res.put("Q3",q3);
                res.put("MED",med);
                res.put("HIGH (1.5)",high);
                res.put("VERY HIGH (3.0)",very_high);
            }
            return res;
        }

        private Map calculeInversedTresholds(Result result){
            Map<String, Double> res = new HashMap<>();
            //Only one result in that case
            while (result.hasNext())
            {
                Map<String,Object> row = result.next();
                //Sometime neo4J return a double or an int... With toString it's works in all cases
                double q1 = Double.valueOf(row.get("Q1").toString());
                double med = Double.valueOf(row.get("MED").toString());
                double q3 = Double.valueOf(row.get("Q3").toString());
                //double high  = q3 + ( 1.5 * ( q3 - q1));
                double low = q1-(1.5*(q3-q1));
                double very_low=q1-(3*(q3-q1));
                if(very_low<0){
                    very_low=0;
                }
                if(low<0){
                    low=0;
                }
                //double very_high  = q3 + ( 3 * ( q3 - q1));
                res.put("Q1",q1);
                res.put("Q3",q3);
                res.put("MED",med);
                res.put("HIGH (1.5)",low);
                res.put("VERY HIGH (3.0)",very_low);
            }
            return res;
        }


        /**
         * Excluding classes implementing 0 or 1 interface
         * @return
         */
        public Map<String, Double> calculateNumberOfImplementedInterfacesQuartile() {
            Map<String, Double> res=null;
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:Class) WHERE n.number_of_implemented_interfaces > 1 RETURN percentileCont(n.number_of_implemented_interfaces,0.25) as Q1, percentileCont(n.number_of_implemented_interfaces,0.5) as MED, percentileCont(n.number_of_implemented_interfaces,0.75) as Q3";
                result = graphDatabaseService.execute(query);
                res = calculeTresholds(result);
            }
            return res;
        }

        public Map<String, Double> calculateNumberOfMethodsForInterfacesQuartile() {
            Map<String, Double> res=null;
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:Class) WHERE HAS(n.is_interface) RETURN percentileCont(n.number_of_methods,0.25) as Q1, percentileCont(n.number_of_methods,0.5) as MED, percentileCont(n.number_of_methods,0.75) as Q3";
                result = graphDatabaseService.execute(query);
                res = calculeTresholds(result);
            }
            return res;
        }

        public Map<String, Double> calculateCohesionAmongMethodsOfClass() {//CAMC
            Map<String, Double> res=null;
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:Class) WHERE NOT HAS(n.is_interface) AND (n.cohesion_among_methods_of_class<>1) RETURN percentileCont(n.cohesion_among_methods_of_class,0.25) as Q1, percentileCont(n.cohesion_among_methods_of_class,0.5) as MED, percentileCont(n.cohesion_among_methods_of_class,0.75) as Q3";
                result = graphDatabaseService.execute(query);
                res = calculeInversedTresholds(result);
            }
            return res;
        }

        public Map<String, Double> calculateNumberOfMethodsQuartile()  {
            Map<String, Double> res=null;
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:Class) WHERE NOT HAS(n.is_interface) RETURN percentileCont(n.number_of_methods,0.25) as Q1, percentileCont(n.number_of_methods,0.5) as MED, percentileCont(n.number_of_methods,0.75) as Q3";
                result = graphDatabaseService.execute(query);
                res = calculeTresholds(result);
            }
            return res;
        }

        public Map<String, Double> calculateNumberOfAttributesQuartile()  {
            Map<String, Double> res=null;
            Result result;
            try (Transaction ignored = graphDatabaseService.beginTx()) {
                String query = "MATCH (n:Class) WHERE NOT HAS(n.is_interface)  RETURN percentileCont(n.number_of_attributes,0.25) as Q1, percentileCont(n.number_of_attributes,0.5) as MED, percentileCont(n.number_of_attributes,0.75) as Q3";
                result = graphDatabaseService.execute(query);
                res = calculeTresholds(result);
            }
            return res;
        }

    public void addApp(String path, String appName, String categoryName, String appKey){
        try {
            File f = new File(path);
            parse(f,appName,categoryName,appKey);

        }catch (IOException ioe)
        {
            ioe.printStackTrace();
            System.out.println("IOException; the cause:"+ ioe.getCause());
        }

    }


    public void parse(final File folder,  String appName,String category, String appKey) throws IOException {
        ObjCLexer lexer;
        CommonTokenStream tokens;
        ObjCParser parser;
        ParseTreeWalker walker;
        ParseTree tree;
        PaprikaApp app =PaprikaApp.createPaprikaApp(appName, category, appKey);
        ModelGenerator modelGenerator = new ModelGenerator(app);

        Analyzer.listFilesForFolder(folder);
        String fileContent;
        //AstPrinter astPrinter = new AstPrinter();
        //analyzing the .m files
        for(String  name: Analyzer.filesContents.keySet()){
            Analyzer.fileName = name;
            fileContent = Analyzer.filesContents.get(name);
            lexer = new ObjCLexer(new ANTLRInputStream(fileContent));
            tokens = new CommonTokenStream(lexer);
            parser = new ObjCParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            // try{
            tree =parser.translation_unit();
            //astPrinter.print((RuleContext) tree);
            walker = new ParseTreeWalker();
            walker.walk(modelGenerator, tree);
         /*   }catch(Exception e){
                System.out.println("The file : "+ name);
                System.out.println(e.getMessage());
            }*/

            //modelGenerator.printModel();
            modelGenerator.reInit();
        }
        //analyzing the .h files
        for(String name : Analyzer.headersContents.keySet()){
            fileContent = Analyzer.headersContents.get(name);
            Analyzer.fileName = name;
            // try{
            lexer = new ObjCLexer(new ANTLRInputStream(fileContent));
            tokens = new CommonTokenStream(lexer);
            parser = new ObjCParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            tree =parser.translation_unit();
            walker = new ParseTreeWalker();
            walker.walk(modelGenerator, tree);
           /* }catch(ParseCancellationException e){
                System.out.println("The file : "+ name);
                System.out.println(e.getMessage());
                e.printStackTrace();
                if (e.getCause() instanceof RecognitionException) {
                    RecognitionException re = (RecognitionException)e.getCause();
                    ParserRuleContext context = (ParserRuleContext)re.getCtx();
                    System.out.println("TEXT : "+context.getText());
                    re.printStackTrace();
                }
            }*/

            modelGenerator.reInit();
        }

        GraphsGenerator graphsGenerator = new GraphsGenerator(modelGenerator.getApp());
        graphsGenerator.buildGraph();
        //graphsGenerator.printGraph();
        //modelGenerator.printModel();
        MetricsCalculator.calculateAppMetrics(modelGenerator.getApp());
        ModelToGraph modelToGraph = new ModelToGraph(queryEngine, graphDatabaseService);
        modelToGraph.insertApp(modelGenerator.getApp());


    }


    public ArrayList<SimpleLine> detectAntipattern(String antipattern, String appKey){

        ArrayList<SimpleLine> lines =new ArrayList<>();
        try {

            switch (antipattern){
                case "BLOB":{
                    BLOBQuery blobQuery= BLOBQuery.createBLOBQuery(queryEngine);
                    System.out.println("aapppp  "+appKey);
                    lines=blobQuery.executeApp(appKey, true);
                    return lines;


                }
                case "Long Method": {
                    LMQuery lmQuery=LMQuery.createLMQuery(queryEngine);
                    lines=lmQuery.executeApp(appKey,true);
                    break;
                }
                case "Complex Class": {
                    CCQuery ccQuery=CCQuery.createCCQuery(queryEngine);
                    lines=ccQuery.executeApp(appKey,true);
                    break;
                }
                case "Blocking the Main-Thread":{
                    CSCQuery cscQuery=CSCQuery.createCSCQuery(queryEngine);
                    lines=cscQuery.executeApp(appKey,true);
                    break;
                }
                case "Massive View Controller":{
                    MVCQuery mvcQuery=MVCQuery.createMVCQuery(queryEngine);
                    lines=mvcQuery.executeApp(appKey,true);
                    break;
                }
                case "Ignoring Low-Memory Warnings" :{
                    ILMWQuery ilmwQuery=ILMWQuery.createILMWQuery(queryEngine);
                    lines=ilmwQuery.executeApp(appKey,true);
                    break;
                }
                case "Swiss Army Knife":{
                    SAKQuery sakQuery=SAKQuery.createSAKQuery(queryEngine);
                    lines=sakQuery.executeApp(appKey,true);
                    break;
                }
                case "VIPER":{

                    break;
                }
            default: break;
            }


        }catch (Exception exception){

        }
    return lines;
    }

    public ArrayList<FuzzyLine> detectAntipatternFuzzy(String antipattern, String appKey){

        ArrayList<FuzzyLine> lines =new ArrayList<>();
        try {

            switch (antipattern){
                case "BLOB":{
                    BLOBQuery blobQuery= BLOBQuery.createBLOBQuery(queryEngine);
                    lines=blobQuery.executeFuzzyApp(appKey, true);
                    return lines;
                }
                case "Long Method": {
                    LMQuery lmQuery=LMQuery.createLMQuery(queryEngine);
                    System.out.println("LM");
                    lines=lmQuery.executeFuzzyApp(appKey,true);
                    break;
                }
                case "Complex Class": {
                    CCQuery ccQuery=CCQuery.createCCQuery(queryEngine);
                    lines=ccQuery.executeFuzzyApp(appKey,true);
                    break;
                }
                case "Massive View Controller":{
                    MVCQuery mvcQuery=MVCQuery.createMVCQuery(queryEngine);
                    lines=mvcQuery.executeFuzzyApp(appKey,true);
                    break;
                }
                case "Swiss Army Knife":{
                    SAKQuery sakQuery=SAKQuery.createSAKQuery(queryEngine);
                    lines=sakQuery.executeFuzzyApp(appKey,true);
                    break;
                }
                default: break;
            }


        }catch (Exception exception){

        }
        return lines;
    }

    public ArrayList<DatasetSimpleLine> detectAntipatternDataset(String antipattern, boolean csv){

        ArrayList<DatasetSimpleLine> lines =new ArrayList<>();
        try {

            switch (antipattern){
                case "BLOB":{
                    BLOBQuery blobQuery= BLOBQuery.createBLOBQuery(queryEngine);
                    lines=blobQuery.executeDatatset( csv, true);
                    return lines;


                }
                case "Long Method": {
                    LMQuery lmQuery=LMQuery.createLMQuery(queryEngine);
                   lines=lmQuery.executeDataset(csv,true);
                    break;
                }
                case "Complex Class": {
                    CCQuery ccQuery=CCQuery.createCCQuery(queryEngine);
                    lines=ccQuery.executeDataset(csv,true);
                    break;
                }
                case "Blocking the Main-Thread":{
                    CSCQuery cscQuery=CSCQuery.createCSCQuery(queryEngine);
                   lines=cscQuery.executeDataset(csv,true);
                    break;
                }
                case "Massive View Controller":{
                    MVCQuery mvcQuery=MVCQuery.createMVCQuery(queryEngine);
                    lines=mvcQuery.executeDataset(csv,true);
                    break;
                }
                case "Ignoring Low-Memory Warnings" :{
                    ILMWQuery ilmwQuery=ILMWQuery.createILMWQuery(queryEngine);
                   lines=ilmwQuery.executeDataset(csv,true);
                    break;
                }
                case "Swiss Army Knife":{
                    SAKQuery sakQuery=SAKQuery.createSAKQuery(queryEngine);
                    lines=sakQuery.executeDataset(csv,true);
                    break;
                }
                case "VIPER":{

                    break;
                }
                default: break;
            }


        }catch (Exception exception){

        }
        return lines;
    }

    public ArrayList<DatasetFuzzyLine> detectAntipatternFuzzyDataset(String antipattern,boolean csv){

        ArrayList<DatasetFuzzyLine> lines =new ArrayList<>();
        try {

            switch (antipattern){
                case "BLOB":{
                    BLOBQuery blobQuery= BLOBQuery.createBLOBQuery(queryEngine);
                    lines=blobQuery.executeFuzzyDataset( csv, true );
                    return lines;
                }
                case "Long Method": {
                    LMQuery lmQuery=LMQuery.createLMQuery(queryEngine);
                    System.out.println("LM");
                    lines=lmQuery.executeFuzzyDataset( csv, true );
                    break;
                }
                case "Complex Class": {
                    CCQuery ccQuery=CCQuery.createCCQuery(queryEngine);
                    lines=ccQuery.executeFuzzyDataset(csv, true );
                    break;
                }
                case "Massive View Controller":{
                    MVCQuery mvcQuery=MVCQuery.createMVCQuery(queryEngine);
                    lines=mvcQuery.executeFuzzyDataset( csv, true );
                    break;
                }
                case "Swiss Army Knife":{
                    SAKQuery sakQuery=SAKQuery.createSAKQuery(queryEngine);
                    lines=sakQuery.executeFuzzyDataset( csv, true );
                    break;
                }
                default: break;
            }


        }catch (Exception exception){

        }
        return lines;
    }


}
