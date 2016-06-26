package com.guigarage.sdk.BDD;

import java.text.DecimalFormat;
import java.util.Map;

/**
 * Created by Sarra on 21/06/2016.
 */
public class TableLine {
    public String metricName;
    public double median;
    public double q1;
    public double q3;
    public double high;
    public double veryHigh;

    private TableLine(String metricName, double median, double q1, double q3, double high, double veryHigh) {
        this.metricName = metricName;
        this.median = median;
        this.q1 = q1;
        this.q3 = q3;
        this.high = high;
        this.veryHigh = veryHigh;
    }

    public static TableLine createTableLine(String metric, Map<String, Double> values){
        System.out.println("Map = null"+ (values == null));




        TableLine tableLine=new TableLine(metric, round(values.get("MED"),3), round(values.get("Q1"),3),
                round(values.get("Q3"),3), round(values.get("HIGH (1.5)"),3), round(values.get("VERY HIGH (3.0)"),3));
      //  System.out.println("HIGH (1.5)"+ tableLine.veryHigh +" "+ tableLine.median + " "+tableLine.q3);
        return tableLine;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public double getMedian() {
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public double getQ1() {
        return q1;
    }

    public void setQ1(double q1) {
        this.q1 = q1;
    }

    public double getQ3() {
        return q3;
    }

    public void setQ3(double q3) {
        this.q3 = q3;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getVeryHigh() {
        return veryHigh;
    }

    public void setVeryHigh(double veryHigh) {
        this.veryHigh = veryHigh;
    }


    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
