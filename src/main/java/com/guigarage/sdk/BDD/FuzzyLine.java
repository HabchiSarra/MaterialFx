package com.guigarage.sdk.BDD;

/**
 * Created by Sarra on 25/06/2016.
 */
public class FuzzyLine extends SimpleLine {

    double probability;
    public FuzzyLine(String instanceName, String className) {
        super(instanceName, className);
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {

        this.probability = TableLine.round(probability*100, 2);
    }
}
