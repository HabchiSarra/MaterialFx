package paprika.analyzer;

import java.io.File;

/**
 * Created by Sarra on 28/02/2016.
 */
public class Main {
    public static void main(String[] args)
    {
        //The file path is hard-coded to avoid reading from System.in which is quite complicated with gradle
        File f = new File("C:\\Users\\Sarra\\Desktop\\Adapt-Paprika\\iOS-apps\\Assistance\\RamblerConferences-develop\\conferences\\Classes");
        Analyzer analyzer = new Analyzer();
        analyzer.identifyLMFuzzy();
    //    analyzer.computeStatistics();
  /*      String appName ="Conferences";
        String appKey = appName;
        String category="Assistance";
      try {
            analyzer.parse(f, appName, category, appKey);

        }catch (IOException ioe)
        {
            ioe.printStackTrace();
            System.out.println("The cause:"+ ioe.getCause());
        }*/


    }
}
