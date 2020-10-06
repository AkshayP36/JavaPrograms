package com.akshaypatil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> basicNumbers = new ArrayList<>();

        for(int i=0; i<20; i++) {
            basicNumbers.add(i, i);
        }

        for(int i=0; i<basicNumbers.size(); i++)
            System.out.print(basicNumbers.get(i)+" ");

        System.out.println("\n\n");
        System.out.println("is empty = "+basicNumbers.isEmpty());

        System.out.println("\n\n");
        System.out.println("does contains value 5? "+basicNumbers.contains(5));
    }
}
