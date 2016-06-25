package com.guigarage.sdk.BDD;

/**
 * Created by Sarra on 25/06/2016.
 */
public class DatasetFuzzyLine extends DatasetSimpleLine {

    double probability;
    public DatasetFuzzyLine(String instanceName, String className, String applicationName) {
        super(instanceName, className, applicationName);
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = TableLine.round(probability*100, 2);
    }
}
