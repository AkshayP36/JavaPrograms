package com.akshaypatil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] array = {4,8,-12,0,3,-74,-62,987};
        Arrays.sort(array);

        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");

        System.out.println("\n\n");
        int[] array2 = {4,8,-12,0,3,-74,-62,987};
        Arrays.parallelSort(array2);

        for(int i=0; i<array2.length; i++)
            System.out.print(array2[i]+" ");

        System.out.println("\n\n");
        char[] array3 = {'A','T','e','Q','b'};
        Arrays.sort(array3);
        for(int i=0; i<array3.length; i++)
            System.out.print(array3[i]+" ");

        System.out.println("\n\n");
        String[] array4 = {"Akshay","Patil","Loves","Coding"};
        Arrays.sort(array4);
        for(int i=0; i<array4.length; i++)
            System.out.print(array4[i]+" ");


        
    }
}
