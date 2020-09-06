package com.akshaypatil;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> movieList = new HashMap<>();

        movieList.put("comedy","Andaj Apna Apna");
        movieList.put("action","Dabaang");
        movieList.put("romance","Hum Apke he Kaun?");
        movieList.put("suspense", "Kahani");

        System.out.println(movieList.get("comedy"));

        System.out.println("\n\n");
        for(String key : movieList.keySet())
            System.out.println(key+" type movie = "+movieList.get(key));

        System.out.println("\n\nLets remove a movie");
        movieList.remove("romance");
        for(String key : movieList.keySet())
            System.out.println(key+" type movie = "+movieList.get(key));


        System.out.println("\n\nTo check if the list contains movie on drama");
        if(movieList.containsKey("drama"))
            System.out.println("Yes. List has an movie based on drama");
        else
            System.out.println("No list doesn't contain movie on Drama. You can add one to the list");


        movieList.put("drama","Prem Ratan Dhan payo");
        System.out.println("\n\n");
        for(String key : movieList.keySet())
            System.out.println(key+" type movie = "+movieList.get(key));
    }
}
