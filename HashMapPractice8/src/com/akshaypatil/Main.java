package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculating area of circle");
        for(int i=0; i<10; i++){
            System.out.println(area(i));
        }
        System.out.println("\n\nCalculating area of Square");
        for(int i=0,j=0; i<10 && j<10; i++,j++){
            System.out.println(area(i,j));
        }

    }

    public static double area(int radius){
        return Math.PI*radius*radius;
    }

    public static double area(int length, int breath){
        return length*breath;
    }
}
