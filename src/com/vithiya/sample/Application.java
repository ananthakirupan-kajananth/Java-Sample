package com.vithiya.sample;


import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
      /*  List<String> students=new ArrayList<>();
        students.add("Saman");
        students.add("Nimal");
        students.add("Raj");
        students.add("Nizar");
        students.add("Sinthu");
        System.out.println(students);

        List<String> filterdata=students.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());
        System.out.println(filterdata);
       */
        List<Sensor> sensors=new ArrayList<>();
        Sensor sensor1= new Sensor ("living room", 22);
        sensors.add(sensor1);
        Sensor sensor2= new Sensor ("Bed room", 28);
        sensors.add(sensor1);
        Sensor sensor3= new Sensor ("Bath room", 26);
        sensors.add(sensor1);
        Sensor sensor4= new Sensor ("Kitchen", 30);
        sensors.add(sensor1);
        Sensor sensor5= new Sensor ("Office room room", 28);
        sensors.add(sensor1);


        List<Sensor> hotSensors=sensors.stream()
                .filter(sensor -> sensor.getValue() <28)
                 .collect(Collectors.toList());
        System.out.println(hotSensors);


    }
}
