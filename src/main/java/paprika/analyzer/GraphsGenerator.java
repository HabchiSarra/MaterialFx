package paprika.analyzer;

import paprika.model.*;
import paprika.parser.ObjCBaseListener;
import paprika.parser.ObjCBaseVisitor;
import paprika.parser.ObjCParser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Sarra on 30/03/2016.
 */
public class GraphsGenerator extends ObjCBaseListener{
    PaprikaApp app;
    ArrayList<PaprikaClass> classes;
    PaprikaMethod currentMethod;
    boolean lookingForClassMethod;
    PaprikaExternalClass uknownClass;
    HashMap<ObjCParser.Message_expressionContext, Entity> methodsContexts;
    ParseTree currentStatement;
    Entity receiverEntity;
    CustomizedVisitor customizedVisitor;


    public GraphsGenerator(PaprikaApp app){
        this.app =app;
        this.classes = app.getPaprikaClasses();
        currentMethod = null;
        lookingForClassMethod = false;
        uknownClass = PaprikaExternalClass.createPaprikaExternalClass("UknownClass",this.app  );
        methodsContexts = new HashMap<>(0);
        receiverEntity = null;
        customizedVisitor = new CustomizedVisitor();

    }
    public void reInit(){
        currentMethod = null;
        lookingForClassMethod = false;
        methodsContexts = new HashMap<>(0);
        receiverEntity = null;
    }
    public void buildGraph(){
        buildClassDiagram();
        buildCallGraph();
    }

    public void buildCallGraph(){
        ParseTreeWalker walker = new ParseTreeWalker();
        for(PaprikaClass c : this.classes){
            if(!c.isInterface()){
                for(PaprikaMethod m : c.getPaprikaMethods()){
                    if(!m.getFunction()){
                        currentMethod = m ;
                        //System.out.println("method :: "+ currentMethod.getName());
                        walker.walk(this, m.getCtx());
                    }
                }
            }
        }
    }

    public void printGraph()
    {
        for(PaprikaClass c: classes){
            System.out.println("Class: "+ c.getName());
           /* if(c.getParent()!=null){
                System.out.println("____extends "+ c.getParent().getName());
            }*/
            for(PaprikaMethod m : c.getPaprikaMethods())
            {
               // System.out.println("The method: "+m.getName()+" uses the variables: ");
                /*for(Entity e : m.getCalledMethods())
                {
                    System.out.print("--" + e.getName());
                    if(e instanceof PaprikaMethod){
                        System.out.println(" From the class: "+((PaprikaMethod)e).getPaprikaClass().getName());
                    }else if(e instanceof PaprikaExternalMethod){
                        System.out.println(" From the class: "+((PaprikaExternalMethod)e).getPaprikaExternalClass().getName());
                    }
                    System.out.println("The receiver is: "+ )
                }*/

                /*for(PaprikaVariable v : m.getUsedVariables()){
                    System.out.println("== variable: "+ v.getName() + " de la classe "+ v.getPaprikaClass().getName());
                }*/

                for(PaprikaMessage message: m.getPaprikaMessages()){
                    System.out.println(""+ message.getCallingMethod().getName()+" -> "+message.getCalledMethod().getName());
                    System.out.print("The called class : " );
                    if(message.getCalledMethod() instanceof  PaprikaMethod){
                        System.out.println(((PaprikaMethod)message.getCalledMethod()).getPaprikaClass().getName());
                    }else{
                        System.out.println(((PaprikaExternalMethod)message.getCalledMethod()).getPaprikaExternalClass().getName());
                    }
                }
            }
        }
    }

    //Listening methods for computing the cyclomatic complexity
    @Override public void enterSelection_statement(@NotNull ObjCParser.Selection_statementContext ctx){
        String text = ctx.getText();
        if(text != null && text.startsWith("if")&& currentMethod != null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }

    @Override public void enterFor_in_statement(@NotNull ObjCParser.For_in_statementContext ctx){
        if(currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }

    @Override public void enterFor_statement(@NotNull ObjCParser.For_statementContext ctx){
        if(currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }

    @Override public void enterWhile_statement(@NotNull ObjCParser.While_statementContext ctx){
        if(currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }

    @Override public void enterDo_statement(@NotNull ObjCParser.Do_statementContext ctx){
        if(currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }

    @Override public void enterLabeled_statement(@NotNull ObjCParser.Labeled_statementContext ctx){
        if(ctx.constant_expression()!=null && currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }

    @Override public void enterCatch_statement(@NotNull ObjCParser.Catch_statementContext ctx){
        if(currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }
/*
    @Override public void enterAnd_expression(@NotNull ObjCParser.And_expressionContext ctx){
        if(ctx.getChildCount()>2 && currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }
    @Override public void enterInclusive_or_expression(@NotNull ObjCParser.Inclusive_or_expressionContext ctx){
        if(ctx.getChildCount()>2 && currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }
    @Override public void enterExclusive_or_expression(@NotNull ObjCParser.Exclusive_or_expressionContext ctx){
        if(ctx.getChildCount()>2 && currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }
    @Override public void enterLogical_or_expression(@NotNull ObjCParser.Logical_or_expressionContext ctx){
        if(ctx.getChildCount()>2 && currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }
    @Override public void enterLogical_and_expression(@NotNull ObjCParser.Logical_and_expressionContext ctx){
        if(ctx.getChildCount()>2 && currentMethod!=null){
            currentMethod.setCyclomaticComplexity(currentMethod.getCyclomaticComplexity()+1);
        }
    }*/

    @Override public void enterCompound_statement(@NotNull ObjCParser.Compound_statementContext ctx) {
        currentStatement= ctx;
    }

    @Override public void exitCompound_statement(@NotNull ObjCParser.Compound_statementContext ctx) {

        PaprikaStatement s=findStatement(currentMethod.getStatement(), (ObjCParser.Compound_statementContext) currentStatement);
        s= s.getParentStatement();
        if(s!=null){
            currentStatement =s.getContext();
        }else{
            currentStatement = null;
        }

    }
  /*
    @Override public void exitPostfix_expression(@NotNull ObjCParser.Postfix_expressionContext ctx) {
        PaprikaClass paprikaClass;
        PaprikaVariable variable;
        if(ctx.identifier() != null){
            //Resolve the variable class
            Entity entity = customizedVisitor.visitPrimary_expression(ctx.primary_expression());
            if(entity instanceof PaprikaExternalClass){

            }else{
                for(ObjCParser.IdentifierContext id : ctx.identifier()){
                    //Find the variable in the class
                    variable=null;
                    for(PaprikaVariable v : ((PaprikaClass) entity).getPaprikaVariables()){
                        if(v.getName().equals(id.IDENTIFIER().getText())){
                            currentMethod.useVariable(v);
                            variable =v;
                        }
                    }
                    if(variable == null){
                        //Look in the super classes
                        paprikaClass = ((PaprikaClass) entity);
                        while(paprikaClass!= null && variable==null) {

                            for(PaprikaVariable v : ((PaprikaClass) entity).getPaprikaVariables()){
                                if(v.getName().equals(id.IDENTIFIER().getText()) && v.getModifier() != PaprikaModifiers.PRIVATE){
                                    currentMethod.useVariable(v);
                                    variable = v;
                                }
                            }
                            paprikaClass = paprikaClass.getParent();

                        }

                    }
                    if(variable==null){
                        break ;

                    }else{
                        entity = resolveType(variable.getType());
                        if(entity instanceof  PaprikaExternalClass){
                            break;
                        }
                    }
                }
            }

        }
    }*/
    @Override public void exitMessage_expression(@NotNull ObjCParser.Message_expressionContext ctx){
        Entity entity = resolveReceiver(ctx.receiver());
        Entity saveEntity = entity;
        PaprikaMessage message;
        //Getting the method name
        String name="";
        int nbArgs=0;
        ObjCParser.SelectorContext sc =ctx.message_selector().selector();
        if (sc != null)
        {TerminalNode tn = sc.IDENTIFIER();
            name = (tn.toString());
        }else {

            for (ObjCParser.Keyword_argumentContext k : ctx.message_selector().keyword_argument()) {
                // The case of compound method name
                if (k.selector() != null) {
                    name=name.concat(k.selector().IDENTIFIER().toString()+":");
                }
                nbArgs++ ;
            }

        }
        //Looking for the method
        Entity receivingMethod=null;

        String parentName = null ;
        if(entity instanceof PaprikaClass){
            PaprikaClass cl  = (PaprikaClass) entity;
            reachingSuperClasses:
            while(cl!=null) {
                for (PaprikaMethod method :  cl.getPaprikaMethods()) {
                    if (method.getFunction()==false && method.getName().equals(name))//&& method.getArguments().size() == nbArgs && method.getStatic()== lookingForClassMethod)
                    {
                        receivingMethod = method;
                        break reachingSuperClasses;
                    }
                }
                parentName =cl.getParentName();
                cl = cl.getParent();

            }
            if(cl == null ) {
                if (parentName != null) {
                    entity = PaprikaExternalClass.createPaprikaExternalClass(parentName, app);
                }else{
                    // Check if it's alloc or init
                   /* if(name.equalsIgnoreCase("alloc")|| name.equalsIgnoreCase("init")){
                        PaprikaExternalMethod exm =PaprikaExternalMethod.createPaprikaExternalMethod(name,entity.getName(), getExternalClassWithName("NSObject"));
                        methodsContexts.put(ctx,exm );
                        PaprikaMessage.createPaprikaMessage(exm, receiverEntity, currentMethod);
                    }else */{
                        //TODO raise an error
                        System.out.println("ERROR : Method " + name + " not found in class " + entity.getName());
                        methodsContexts.put(ctx, null);
                    }
                }
            }else {
                    if (receivingMethod == null) {//Usesless
                        System.out.println("ERROR : Method " + name + " not found in class " + entity.getName());
                        methodsContexts.put(ctx, null);
                    } else {
                        //Create message
                        message =PaprikaMessage.createPaprikaMessage(receivingMethod, receiverEntity, currentMethod);
                        currentMethod.getPaprikaClass().coupledTo(cl);
                        methodsContexts.put(ctx, message);
                        currentMethod.callMethod(receivingMethod);
                    }
            }

        }



        if(entity instanceof PaprikaExternalClass){
            String rtype="UknownClass";
            if(name.equalsIgnoreCase("alloc") || name.equalsIgnoreCase("init")){
                rtype = saveEntity.getName();
                PaprikaExternalClass c = getExternalClassWithName("NSObject");
                if(c==null){
                    c=PaprikaExternalClass.createPaprikaExternalClass("NSObject",app);
                }
                receivingMethod = PaprikaExternalMethod.createPaprikaExternalMethod(name,rtype,c);
            }else {
                receivingMethod = PaprikaExternalMethod.createPaprikaExternalMethod(name, rtype, (PaprikaExternalClass) entity);
            }

            //@TODO coupledTo(externalClass)

            message = PaprikaMessage.createPaprikaMessage(receivingMethod, receiverEntity,currentMethod);
            methodsContexts.put(ctx,message);
            currentMethod.callMethod(receivingMethod);
        }

    }



    public Entity resolveReceiver(@NotNull ObjCParser.ReceiverContext ctx){
        lookingForClassMethod = false;
        PaprikaExternalClass externalClass;
        PaprikaClass paprikaClass;
        if(ctx.getText().equalsIgnoreCase("super")){
            lookingForClassMethod =true;
            if(currentMethod.getPaprikaClass().getParent() != null){
                receiverEntity =currentMethod.getPaprikaClass().getParent();
                return receiverEntity;
            }else if(currentMethod.getPaprikaClass().getParentName()!= null) {
                //The parent class is external
                externalClass = getExternalClassWithName(currentMethod.getPaprikaClass().getParentName());
                if (externalClass == null) {
                    externalClass = PaprikaExternalClass.createPaprikaExternalClass
                            (currentMethod.getPaprikaClass().getParentName(), app);

                }
                receiverEntity =externalClass;
                return externalClass;
            }

        }else if(ctx.class_name()!= null){
            lookingForClassMethod = true;
            paprikaClass = getClassFromName(ctx.class_name().IDENTIFIER().getText());
            if(paprikaClass!= null){
                receiverEntity =paprikaClass;
                return paprikaClass;
            }else{
                externalClass = getExternalClassWithName(ctx.class_name().IDENTIFIER().getText());
                if(externalClass==null){
                    externalClass = PaprikaExternalClass.createPaprikaExternalClass(ctx.class_name().IDENTIFIER().getText(),app);

                }
                receiverEntity =externalClass;
                return externalClass;

            }

        }else if(ctx.getText().equalsIgnoreCase("self")) {
            //System.out.println("self");
            receiverEntity = this.currentMethod.getPaprikaClass();
            return receiverEntity;
        }else if(ctx.getText().equalsIgnoreCase("selfclass")){
            receiverEntity = this.currentMethod.getPaprikaClass();
            lookingForClassMethod = true;
            return receiverEntity;
        }else {
            Entity e;
            e = customizedVisitor.visitExpression(ctx.expression());
            return e;
        }
        return this.uknownClass;
    }


    public PaprikaClass getClassFromName(String name){
        for (PaprikaClass c :  this.classes){
            if (c.getName().equals(name)){
               return c;
            }
        }
        return null;
    }

    public void buildClassDiagram(){
        PaprikaClass paprikaClass;
        for (PaprikaClass c: this.classes){
            //Create the inheritance link
            if(c.getParentName()!=null){
                if((paprikaClass= getClassFromName(c.getParentName()))!=null){
                    //The parent class is internal
                    c.setParent(paprikaClass);
                    paprikaClass.addChildren();
                    c.setParentName(null);
                }
            }
            //Create implementation links
            for(String interfaceName : c.getInterfacesNames()){
                if((paprikaClass = getClassFromName(interfaceName))!= null){
                    //The interface is internal
                    c.implement(paprikaClass);
                }
            }
            //We free the list of the interfaces' names
            c.setInterfacesNames(null);
        }
    }


    public PaprikaExternalClass getExternalClassWithName(String name){
        for(PaprikaExternalClass c : this.app.getPaprikaExternalClasses()){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
    public Entity resolveVariableType(Entity entity, String variableName){
        String parentName = null;
        if(entity instanceof PaprikaClass){
            PaprikaClass paprikaClass = (PaprikaClass) entity;
            while(paprikaClass != null) {
                for (PaprikaVariable variable : paprikaClass.getPaprikaVariables()) {
                    if (variable.getName().equals(variableName) ){//&& !(paprikaClass!= entity && variable.getModifier()==PaprikaModifiers.PRIVATE)) {//if the variable is in the superclass it shouldn't be private
                        receiverEntity = variable;
                        return resolveType(variable.getType());
                    }
                }
                parentName = paprikaClass.getParentName();
                paprikaClass =paprikaClass.getParent();
            }
            if(parentName!=null){
                //find the parent external class
                entity =getExternalClassWithName(parentName);
                if(entity == null){
                    entity = PaprikaExternalClass.createPaprikaExternalClass(parentName, app);
                }

            }else{
                System.out.println("Variable  "+ variableName+ " unfound ");
            }


        }
        if(entity instanceof PaprikaExternalClass){
            //External class
            receiverEntity =PaprikaExternalVariable.createPaprikaExternalVariable(variableName,
                    "UknownClass",(PaprikaExternalClass) entity, receiverEntity);

        }
        return uknownClass;
    }

    public Entity resolveFunctionType(String functioncName){
        //We first look inside the current class to handle the static function case
        for(PaprikaMethod method : currentMethod.getPaprikaClass().getPaprikaMethods()){
            if(method.getFunction()){
                if(method.getName().equals(functioncName)){
                    String type = method.getReturnType();
                    receiverEntity = method;
                    return resolveType(type);
                }
            }
        }
        //Then we look in the app functions
            for(PaprikaFunction method : app.getPaprikaFunctions()){

                    if(method.getName().equals(functioncName)){
                        String type = method.getReturnType();
                        receiverEntity = method;
                        return resolveType(type);
                    }
            }


        //Reaching this means the function is external and we can't know its return type
        //TODO create the function and attach it
        return uknownClass;
    }

    public Entity resolveType(String typeName){
        Entity c = getClassFromName(typeName);
        if(c==null){
            c=getExternalClassWithName(typeName);
            if(c==null){
                c=PaprikaExternalClass.createPaprikaExternalClass(typeName,app);
            }
        }
        return c;
    }

    public Entity resolveVariable(String variableName){
        //We first look into the local variables
        PaprikaStatement statement = findStatement(currentMethod.getStatement(), (ObjCParser.Compound_statementContext) currentStatement);
        if(statement!=null){
            while(statement!=null){
                for(PaprikaStatementVariable v : statement.getVariables())
                {
                    if(v.getName().equals(variableName)){
                        receiverEntity =v;
                        return resolveType(v.getType());
                    }
                }
                statement=statement.getParentStatement();
            }
        }else{
            System.out.println("ERROR statement unfound");
        }
        //we look into the method's arguments
        for(PaprikaArgument v : currentMethod.getArguments()){
            if(v.getArgumentName().equals(variableName)){
                receiverEntity = v;
                return resolveType(v.getName());
            }
        }
        //we look into the class variables
        PaprikaClass paprikaClass = currentMethod.getPaprikaClass();
        while(paprikaClass != null) {
            for (PaprikaVariable v : paprikaClass.getPaprikaVariables()) {
                if (v.getName().equals(variableName)) {
                    receiverEntity = v;
                    return resolveType(v.getType());
                }
            }
            paprikaClass=paprikaClass.getParent();
        }
        //reaching this means the variable may be GLOBAL
        for(PaprikaGlobalVariable v: app.getPaprikaGlobalVariables()){
            if(v.getName().equals(variableName)){
                receiverEntity =v;
                return resolveType(v.getType());
            }
        }


        return null;
    }

    public PaprikaStatement findStatement(PaprikaStatement statement, ObjCParser.Compound_statementContext ctx){
        PaprikaStatement statement1;
        if(statement.getContext() == ctx){
            return statement;
        }else{
            for(PaprikaStatement s: statement.getChildrenStatements()){
                statement1 = findStatement(s,ctx);
                if(statement1 != null){
                    return statement1;
                }
            }
        }
        return null;
    }

    class CustomizedVisitor extends  ObjCBaseVisitor<Entity>{



        @Override public Entity visitExpression(@NotNull ObjCParser.ExpressionContext ctx)
        {
            return visitAssignment_expression(ctx.assignment_expression(0));

        }
        @Override public Entity visitAssignment_expression(@NotNull ObjCParser.Assignment_expressionContext ctx)
        {
            if(ctx.conditional_expression()!= null){

                return visitConditional_expression(ctx.conditional_expression());
            }else{
                //System.out.println("HERE WE ARE ");
                return null;
            }

        }
        @Override public Entity visitConditional_expression(@NotNull ObjCParser.Conditional_expressionContext ctx)
        {
            return visitLogical_or_expression(ctx.logical_or_expression());
        }

        @Override public Entity visitLogical_or_expression(@NotNull ObjCParser.Logical_or_expressionContext ctx)
        {
            return visitLogical_and_expression(ctx.logical_and_expression(0));
            //@TODO if the list size is >1 : return "Boolean"
        }
        @Override public Entity visitLogical_and_expression(@NotNull ObjCParser.Logical_and_expressionContext ctx)
        {
            return visitInclusive_or_expression(ctx.inclusive_or_expression(0));
        }

        @Override public Entity visitInclusive_or_expression(@NotNull ObjCParser.Inclusive_or_expressionContext ctx)
        {
            return visitExclusive_or_expression(ctx.exclusive_or_expression(0));
        }

        @Override public Entity visitExclusive_or_expression(@NotNull ObjCParser.Exclusive_or_expressionContext ctx)
        {
            return visitAnd_expression(ctx.and_expression(0));
        }

        @Override public Entity visitAnd_expression(@NotNull ObjCParser.And_expressionContext ctx)
        {
            return visitEquality_expression(ctx.equality_expression(0));
        }

        @Override public Entity visitEquality_expression(@NotNull ObjCParser.Equality_expressionContext ctx)
        {
            return visitRelational_expression(ctx.relational_expression(0));
        }

        @Override public Entity visitRelational_expression(@NotNull ObjCParser.Relational_expressionContext ctx)
        {
            return visitShift_expression(ctx.shift_expression(0));
        }
        @Override public Entity visitShift_expression(@NotNull ObjCParser.Shift_expressionContext ctx)
        {
            return visitAdditive_expression(ctx.additive_expression(0));
        }

        @Override public Entity visitMultiplicative_expression(@NotNull ObjCParser.Multiplicative_expressionContext ctx)
        {
            return visitCast_expression(ctx.cast_expression(0));
        }
        @Override public Entity visitCast_expression(@NotNull ObjCParser.Cast_expressionContext ctx)
        {
            PaprikaClass c ;
            PaprikaExternalClass ec;
            if(ctx.type_name()!= null){
                lookingForClassMethod=true;
                c= getClassFromName(ctx.type_name().getText());
                if(c!=null){
                    receiverEntity =c;
                    return c;
                }else{
                    ec= getExternalClassWithName(ctx.type_name().getText());
                    if(ec==null){
                        ec =PaprikaExternalClass.createPaprikaExternalClass(ctx.type_name().getText(), app);
                    }
                    receiverEntity =ec;
                    return ec;
                }

            }else{
                return visitUnary_expression(ctx.unary_expression());
            }
        }

        @Override public Entity visitUnary_expression(@NotNull ObjCParser.Unary_expressionContext ctx)
        {
            if(ctx.postfix_expression()!=null){
                return visitPostfix_expression(ctx.postfix_expression());
            }else{
                PaprikaExternalClass ec = getExternalClassWithName("NSInteger");
                if(ec==null){
                    ec= PaprikaExternalClass.createPaprikaExternalClass("NSInteger",app);
                }
                receiverEntity =ec;
                return ec;
            }
        }

        @Override public Entity visitPostfix_expression(@NotNull ObjCParser.Postfix_expressionContext ctx)
        {
            Entity e;
            if(ctx.getText().endsWith("++") || ctx.getText().endsWith("--")){
                e = getExternalClassWithName("NSInteger");
                if(e==null){
                    e=PaprikaExternalClass.createPaprikaExternalClass("NSInteger",app);
                }
                receiverEntity = e;
                return e;
            }
            //@TODO check the next tokens values' before visiting primary_expression
            e= visitPrimary_expression(ctx.primary_expression());
            int nb= ctx.getChildCount();
            int i;
            String varName;
            ParseTree rule;
            for(i=1; i<nb ; i++){
                rule= ctx.getChild(i);
                if(rule instanceof ObjCParser.IdentifierContext){
                    //The identifier is a variable
                    varName= ((ObjCParser.IdentifierContext) rule).IDENTIFIER().getText();
                    e= resolveVariableType(e,varName);
                }else if (rule instanceof ObjCParser.Argument_listContext){
                    // This is a function call
                    System.out.println("-----Function call----");
                    if(e instanceof PaprikaExternalClass){
                        //this class must be removed
                        app.getPaprikaExternalClasses().remove((PaprikaExternalClass)e);
                    }
                    e= resolveFunctionType(ctx.primary_expression().getText());
                }else if(rule instanceof ObjCParser.ExpressionContext){
                    //@TODO The array case
                }
            }
            return e;
        }

        @Override public Entity visitPrimary_expression(@NotNull ObjCParser.Primary_expressionContext ctx)
        {
            Entity e;
            if(ctx.expression()!=null || ctx.message_expression()!= null || ctx.selector_expression()!= null ||
                    ctx.protocol_expression()!= null || ctx.encode_expression() != null){
                return visitChildren(ctx);
            }else{
                if(ctx.IDENTIFIER() != null){
                    //The identifier may be a Classname or a variable
                    lookingForClassMethod=true;
                    e= getClassFromName(ctx.IDENTIFIER().getText());
                    if(e==null){
                        e=getExternalClassWithName(ctx.IDENTIFIER().getText());
                            if(e==null){
                                // The identifier maybe  a variable
                                lookingForClassMethod=false;
                                e= resolveVariable(ctx.IDENTIFIER().getText());
                                if(e==null){
                                    //The identifier may be a new external class
                                    e=PaprikaExternalClass.createPaprikaExternalClass(ctx.IDENTIFIER().getText(),app);
                                    lookingForClassMethod = true;
                                    receiverEntity = e;
                                }
                            }else{
                                receiverEntity =e ;
                            }
                    }else{
                        receiverEntity = e;
                    }
                    return e;
                }else if(ctx.getText().equals("self")){
                    lookingForClassMethod=false;
                    receiverEntity =currentMethod.getPaprikaClass();
                    return receiverEntity;
                }else if(ctx.getText().equals("super")){
                    lookingForClassMethod =true;
                    if(currentMethod.getPaprikaClass().getParent() != null){
                        receiverEntity = currentMethod.getPaprikaClass().getParent();
                        return receiverEntity;
                    }else if(currentMethod.getPaprikaClass().getParentName()!= null){
                        //The parent class is external
                        e= getExternalClassWithName(currentMethod.getPaprikaClass().getParentName());
                        if(e== null){
                            e = PaprikaExternalClass.createPaprikaExternalClass
                                    (currentMethod.getPaprikaClass().getParentName(), app);
                        }
                        receiverEntity =e;
                        return e;
                    }
                }
            }
            return uknownClass;
        }

        @Override public Entity visitMessage_expression(@NotNull ObjCParser.Message_expressionContext ctx)
        {
            if(methodsContexts.get(ctx)!=null) {
                Entity entity = ((PaprikaMessage) methodsContexts.get(ctx)).getCalledMethod();
                receiverEntity = methodsContexts.get(ctx);
                if (entity instanceof PaprikaMethod) {
                    return resolveType(((PaprikaMethod) entity).getReturnType());
                } else {
                    return resolveType(((PaprikaExternalMethod) entity).getReturnType());
                }
            }else{
                return PaprikaExternalClass.createPaprikaExternalClass("UknownClass",app);
            }

        }
        @Override public Entity visitConstant(@NotNull ObjCParser.ConstantContext ctx)
        {
            //TODO uknown case
            receiverEntity = uknownClass;
            return uknownClass;
        }

        @Override public Entity visitSelector_expression(@NotNull ObjCParser.Selector_expressionContext ctx)
        {
            PaprikaExternalClass ec = getExternalClassWithName("SEL");
            if(ec==null){
                PaprikaExternalClass.createPaprikaExternalClass("SEL",app);
            }
            receiverEntity =ec;
            return ec;
        }

        @Override public Entity visitProtocol_expression(@NotNull ObjCParser.Protocol_expressionContext ctx)
        {
            PaprikaExternalClass ec = getExternalClassWithName("ID");
            if(ec==null){
                PaprikaExternalClass.createPaprikaExternalClass("ID",app);
            }
            receiverEntity =ec;
            return ec;
        }
        @Override public Entity visitEncode_expression(@NotNull ObjCParser.Encode_expressionContext ctx)
        {
            PaprikaExternalClass ec = getExternalClassWithName("NSSting");
            if(ec==null){
                PaprikaExternalClass.createPaprikaExternalClass("NSString",app);
            }
            receiverEntity =ec;
            return ec;

        }


    }
}
