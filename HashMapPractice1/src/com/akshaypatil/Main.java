package com.akshaypatil;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<>();

        //To add cities in the Hashmap
        capitalCities.put("Delhi","New Capital Region Delhi");
        capitalCities.put("Maharashtra", "Mumbai");
        capitalCities.put("Karnataka","Bangaluru");
        capitalCities.put("Gujarat","Ahmedabad");

        //To print one value
        System.out.println(capitalCities.get("Maharashtra"));

        //To print all values
        System.out.println("\n");
        for(String keys : capitalCities.keySet())
            System.out.println(keys+"'s capital city = "+capitalCities.get(keys));


        //Remove values from the hashmap
        System.out.println("\n\n");
        capitalCities.remove("Gujarat");
        for(String keys : capitalCities.keySet())
            System.out.println(keys+"'s capital city = "+capitalCities.get(keys));

        //To check if the key exists in the hashmap
        System.out.println("\n\n");
        if(capitalCities.containsKey("Gujarat"))
            System.out.println("The capital value of Gujarat still exists in the hashmap");
        else
            System.out.println("Value removed from the hashMap");
    }
}
