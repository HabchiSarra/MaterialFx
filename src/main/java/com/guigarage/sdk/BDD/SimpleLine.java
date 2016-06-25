package com.guigarage.sdk.BDD;

/**
 * Created by Sarra on 24/06/2016.
 */
public class SimpleLine {
    public String instanceName;
    public String className;

    public SimpleLine(String instanceName, String className) {
        this.instanceName = instanceName;
        this.className = className;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


}
