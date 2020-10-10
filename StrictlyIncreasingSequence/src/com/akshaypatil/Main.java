package com.akshaypatil;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'whoIsTheWinner' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String whoIsTheWinner(List<Integer> arr) {
        // WRITE DOWN YOUR CODE HERE

        //declaring flag to check array increasing or not
        boolean result=false;


        //check if array is increasing order
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)<arr.get(i+1))
                result=true;
            else{
                result=false;
                break;
            }
        }

        //returning results
        if(result) return "First";
        else return "Second";
    }

}
public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(5);
       // arr.add(4);
        String ans=Result.whoIsTheWinner(arr);
        System.out.println("Winner = "+ans);
    }
}
