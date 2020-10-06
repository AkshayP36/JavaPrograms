package com.akshaypatil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CubeOfNumbers> cubeOfNumbers=new ArrayList<>();
        for(int i=0; i<10; i++) {
            cubeOfNumbers.add(new CubeOfNumbers(i));
        }

        cubeOfNumbers.forEach(cubeOfNumbers1 -> System.out.println(cubeOfNumbers));
    }
}
