package com.akshaypatil;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Integer> factorial = new HashMap<>();

        //Adding factorial values in the Hashmap
        for(int i=0; i<=10; i++)
            factorial.put(i, factorialAddValues(i));


        //Displaying factorial values in the hashmap
        for(int i : factorial.keySet())
            System.out.println(i+" factorial = "+factorial.get(i));

        //Removing value of 4 factorial from the hashMap
        factorial.remove(4);

        //Checking if the factorial value removed from the hashmap list
        System.out.println("\n\n");
        if(factorial.containsKey(4))
            System.out.println("Value not removed yet");
        else
            for(int i : factorial.keySet())
                System.out.println(i+" factorial = "+factorial.get(i));


        //Adding conditional removal from key
        System.out.println("\n\n");
        factorial.remove(5,20);
        if(factorial.containsKey(5))
            System.out.println("Value not removed yet by conditional removal from key loop");
        else
            for(int i : factorial.keySet())
                System.out.println(i+" factorial = "+factorial.get(i));



            //Adding conditional removal from value
        System.out.println("\n\n");
        factorial.remove(5,120);
        if(factorial.containsValue(120))
            System.out.println("Value not removed yet");
        else
            for(int i : factorial.keySet())
                System.out.println(i+" factorial = "+factorial.get(i));
    }
    public static int factorialAddValues(int i){
       if(i==0 || i==1)
           return 1;
       return i*factorialAddValues(i-1);
    }
}
