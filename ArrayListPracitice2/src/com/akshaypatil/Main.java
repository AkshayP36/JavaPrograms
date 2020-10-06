package com.akshaypatil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<StudentData> JuniorClass = new ArrayList<>();
        List<StudentData> SeniorClass = new ArrayList<>();

        JuniorClass.add(new StudentData("A","65444",25));
        JuniorClass.add(new StudentData("B","65445",24));
        JuniorClass.add(new StudentData("C","65446",54));
        JuniorClass.add(new StudentData("D","65447",54));
        JuniorClass.add(new StudentData("E","65448",4));

        JuniorClass.forEach(studentData -> System.out.println(studentData));

        System.out.println("\n\n");

        SeniorClass.add(new StudentData("A","65444",25));
        SeniorClass.add(new StudentData("B","65445",24));
        SeniorClass.add(new StudentData("C","65446",54));
        SeniorClass.add(new StudentData("D","65447",54));
        SeniorClass.add(new StudentData("E","65448",4));

        SeniorClass.forEach(studentData -> System.out.println(studentData));
    }
}
