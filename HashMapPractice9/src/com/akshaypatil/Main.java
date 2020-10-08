package com.akshaypatil;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> cities = new HashMap<>();
        cities.put("Mumbai","Maharashtra");
        cities.put("Delhi","Delhi");
        cities.put("Bangaluru","Karnataka");

        for(String navigator : cities.keySet()){
            System.out.println(cities.get(navigator));
        }

    }
}
