package com.akshaypatil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer,Integer> array = prime(12);
        for(int i=0; i<array.length;i++)
        System.out.print(array[i]);

    }
    public static String factors(int n) {
        return null;// your code
    }
    public static ArrayList<Integer> prime(int n){
        ArrayList<Integer,Integer> array=new HashMap<>();
        for(int i=2; i<=n/2; i++){
            if(n%i==0)
                array[i]=i;
        }

    }
}
