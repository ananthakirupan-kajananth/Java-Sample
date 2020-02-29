package com.vithiya.sample;

public class Sensor {
   private String name;
   private double Value;

    @Override
    public String toString() {
        return "Sensor{" +
                "name='" + name + '\'' +
                ", Value=" + Value +
                '}';
    }

    public Sensor() {
    }

    public Sensor(String name, double value) {
        this.name = name;
        Value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }
}
