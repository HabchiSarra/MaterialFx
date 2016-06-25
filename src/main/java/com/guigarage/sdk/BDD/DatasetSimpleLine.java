package com.guigarage.sdk.BDD;

/**
 * Created by Sarra on 25/06/2016.
 */
public class DatasetSimpleLine extends SimpleLine {
    String applicationName;
    public DatasetSimpleLine(String instanceName, String className, String applicationName) {
        super(instanceName, className);
        this.applicationName = applicationName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
