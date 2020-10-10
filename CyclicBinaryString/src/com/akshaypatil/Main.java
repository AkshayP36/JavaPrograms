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
     * Complete the 'maximumPower' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int maximumPower(String s) {
        int max=0;
       // System.out.println("string = "+s+" max="+max);

        //rotate string:>convert that string into decimal :> check if that decimal gives max power of 2 as compared to previous :> return that max value

        //traversing from entire string
        for(int i=0;i<s.length();i++){

            //converting string to decimal value
            int decimal=0,counter=0;
            for(int digit=s.length()-1;digit>=0;digit--){
                char location=s.charAt(digit);
                decimal=decimal+(location-'0')*(int)Math.pow(2,counter);
                counter++;
            }
            if(decimal<0)
                return -1;

            //finding max power of two by which i can divide the decimal
            if(decimal%2==0) {
                //finding 2's max power

                //comparing temp value with previous stored value
                for(int tempMax=s.length()-1;tempMax>=0;tempMax--){
                    if(decimal%Math.pow(2,tempMax)==0){
                        if (tempMax > max) {
                            max = tempMax;
                            break;
                        }
                    }
                }


            }
            //string rotation = left shift
           s=s.substring(s.length()-1)+s.substring(0,s.length()-1);
        }


        return max;

    }

}
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.maximumPower(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        */

        String mystring = "0011";
        Result myresult = new Result();
        int max=myresult.maximumPower(mystring);
        System.out.println(max);
    }
}
