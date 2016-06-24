package paprika.analyzer;

import paprika.metrics.*;
import paprika.model.*;

import java.util.HashMap;

/**
 * Created by Sarra on 02/05/2016.
 */
public class MetricsCalculator {



    public static void calculateAppMetrics(PaprikaApp app)
    {
        NumberOfClasses.createNumberOfClasses(app, app.getPaprikaClasses().size());
        int numberOfInterfaces=0;
        for(PaprikaClass c: app.getPaprikaClasses()){
            if(c.isInterface()){
                numberOfInterfaces++;
            }
        }
        NumberOfInterfaces.createNumberOfInterfaces(app,numberOfInterfaces);
        for(PaprikaClass paprikaClass: app.getPaprikaClasses()){
            calculateClassMetrics(paprikaClass);
        }
        calculateGraphMetrics(app);
    }


    public static void calculateClassMetrics(PaprikaClass paprikaClass){
        if(paprikaClass.isViewController())
        {
            IsViewController.createIsViewController(paprikaClass);
        }else if(paprikaClass.isInteractor()){
            IsInteractor.createIsInteractor(paprikaClass);
        }else if(paprikaClass.isRouter()){
            IsRouter.createIsRouter(paprikaClass);
        }else if(paprikaClass.isPresenter()){
            IsPresenter.createIsPresenter(paprikaClass);
        }

        NumberOfMethods.createNumberOfMethods(paprikaClass, paprikaClass.getPaprikaMethods().size());
        NumberOfImplementedInterfaces.createNumberOfImplementedInterfaces(paprikaClass,
                paprikaClass.getInterfaces().size());
        NumberOfAttributes.createNumberOfAttributes(paprikaClass, paprikaClass.getPaprikaVariables().size());
        if(paprikaClass.isInterface())
        {
            IsInterface.createIsInterface(paprikaClass, true);
        }
        CAMCMetric.createCAMCMetric(paprikaClass);
        NumberOfLines.createNumberOfLines(paprikaClass, paprikaClass.getNumberOfLinesOfCode());
        CouplingBetweenObjects.createCouplingBetweenObjects(paprikaClass);
        NumberOfChildren.createNumberOfChildren(paprikaClass);
        for(PaprikaMethod paprikaMethod: paprikaClass.getPaprikaMethods()){
            calculateMethodMetrics(paprikaMethod);
        }
        //this instruction must be called after the loop
        ClassComplexity.createClassComplexity(paprikaClass);
    }

    public static void calculateMethodMetrics(PaprikaMethod paprikaMethod){
        NumberOfParameters.createNumberOfParameters(paprikaMethod, paprikaMethod.getArguments().size());
        if(!paprikaMethod.getFunction() && ! paprikaMethod.getPaprikaClass().isInterface()){
            int n = calculateNumberOfDeclaredLocals(paprikaMethod.getStatement());
            NumberOfDeclaredLocals.createNumberOfDeclaredLocals(paprikaMethod,n);
            NumberOfDirectCalls.createNumberOfDirectCalls(paprikaMethod, paprikaMethod.getCalledMethods().size());
        }else{
            NumberOfDirectCalls.createNumberOfDirectCalls(paprikaMethod,0);
            NumberOfDeclaredLocals.createNumberOfDeclaredLocals(paprikaMethod,0);
        }
        //Checking if the method is a constructor
       if(paprikaMethod.getName().equals("init") || paprikaMethod.getName().equals("alloc")){
            IsInit.createIsInit(paprikaMethod, true);
        }
        String methodName;
        boolean lookForSetter =false;
        //Checking if the method is a setter or a getter
        methodName=paprikaMethod.getName();
        if(paprikaMethod.getArguments().size()==1 && methodName.startsWith("set") ){
            methodName= paprikaMethod.getName().replace(":","");
            methodName = methodName.replace("set", "");
            lookForSetter=true;
        }
        String varName;
        if(lookForSetter || paprikaMethod.getArguments().size()==0) {
            for (PaprikaVariable paprikaVariable : paprikaMethod.getPaprikaClass().getPaprikaVariables()) {
                if(!lookForSetter) {
                    varName=paprikaVariable.getName();
                    varName =varName.replaceFirst("_","");
                    if (paprikaMethod.getName().equals(paprikaVariable.getName())|| paprikaMethod.getName().
                            equalsIgnoreCase("get"+paprikaVariable.getName()) || varName.equalsIgnoreCase(paprikaMethod.getName())
                            || paprikaMethod.getName().equalsIgnoreCase("get"+varName)) {
                        if(paprikaMethod.getReturnType().equals(paprikaVariable.getType()))
                        {
                            IsGetter.createIsGetter(paprikaMethod, true);
                            break;
                        }

                    }
                }else {
                    varName=paprikaVariable.getName();
                    varName =varName.replaceFirst("_","");
                    if (methodName.equalsIgnoreCase(paprikaVariable.getName()) || methodName.equalsIgnoreCase(varName) ) {
                        if(paprikaMethod.getArguments().get(0).getName().equals(paprikaVariable.getType())) {
                            IsSetter.createIsSetter(paprikaMethod, true);
                            break;
                        }
                    }
                }
            }
        }


        if(paprikaMethod.getStatic()){
            IsStatic.createIsStatic(paprikaMethod,true);
        }
        NumberOfCallers.createNumberOfCallers(paprikaMethod,0);
        NumberOfLines.createNumberOfLines(paprikaMethod,paprikaMethod.getNumberOfLines());
        CyclomaticComplexity.createCyclomaticComplexity(paprikaMethod, paprikaMethod.getCyclomaticComplexity());
       // paprikaMethod.getPaprikaClass().addComplexity(paprikaMethod.getCyclomaticComplexity());
    }


    private static int calculateNumberOfDeclaredLocals(PaprikaStatement statement){
        int n= 0 ;
        n= statement.getVariables().size();
        for(PaprikaStatement st : statement.getChildrenStatements()){
            n=+ calculateNumberOfDeclaredLocals(st);
        }

        return n;

    }

    private static void calculateGraphMetrics(PaprikaApp app){
        HashMap<PaprikaMethod, Integer> numberOfCallers = new HashMap<>();
        Integer nb;
        for(PaprikaClass paprikaClass: app.getPaprikaClasses()){
            for (PaprikaMethod paprikaMethod: paprikaClass.getPaprikaMethods()){
                if(!numberOfCallers.containsKey(paprikaMethod)){
                    numberOfCallers.put(paprikaMethod,0);
                }
                for(Entity entity: paprikaMethod.getCalledMethods()){
                    if(entity instanceof PaprikaMethod){
                        nb=numberOfCallers.get((PaprikaMethod)entity);
                        if(nb==null){
                            numberOfCallers.put((PaprikaMethod)entity,1);
                        }else{
                            numberOfCallers.put((PaprikaMethod)entity,nb+1);
                        }
                    }
                }
            }
        }

        int depth;
        PaprikaClass paprikaClass2;
        for(PaprikaClass paprikaClass:app.getPaprikaClasses()){
            //calculate Depth Of Inheritance
            paprikaClass2=paprikaClass;
            depth=0;
            while(paprikaClass2.getParent() !=null){

                depth++;
                paprikaClass2=paprikaClass2.getParent();
            }
            if(paprikaClass2.getParentName()!=null){
                depth++;
            }
            DepthOfInheritance.createDepthOfInheritance(paprikaClass,depth);
            //calculate number of callers
            for(PaprikaMethod paprikaMethod: paprikaClass.getPaprikaMethods()){
                NumberOfCallers.createNumberOfCallers(paprikaMethod,numberOfCallers.get(paprikaMethod));
            }
        }
    }
}
