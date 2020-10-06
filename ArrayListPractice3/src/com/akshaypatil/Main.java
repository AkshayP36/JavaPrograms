package com.akshaypatil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CItyList> westernIndia = new ArrayList<>();

        westernIndia.add(new CItyList("Maharashtra","Mumbai"));
        westernIndia.add(new CItyList("Karnataka","Bangaluru"));
        westernIndia.add(new CItyList("Goa","Panji"));

        westernIndia.forEach(cItyList -> System.out.println(cItyList));
    }
}
