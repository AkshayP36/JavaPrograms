package com.akshaypatil;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	Map<Integer , String> populationRanking = new HashMap<>();

	//adding values in the hashMap
        populationRanking.put(1, "China");
        populationRanking.put(2, "India");
        populationRanking.put(3, "USA");
        populationRanking.put(4,"Brazil");

        // displaying a value from the hashmap
        System.out.println("The second most populated country in the world = "+populationRanking.get(2));

        //displaying all countries in the hashmap
        System.out.println("\nDisplaying all countries");
        for(int rank : populationRanking.keySet())
            System.out.println(rank+" : "+populationRanking.get(rank));

        //removing a country from the hashmap
        System.out.println("\nRemoving 4th country");
        populationRanking.remove(4);

        //Displaying if the country removed
        System.out.println("\n");
        if(populationRanking.containsKey(4))
            System.out.println("Country not removed from the list");
        else{
            for(int rank : populationRanking.keySet())
                System.out.println(rank+" : "+populationRanking.get(rank));
        }


    }
}
