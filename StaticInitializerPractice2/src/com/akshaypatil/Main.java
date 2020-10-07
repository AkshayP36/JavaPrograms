package com.akshaypatil;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static String messageMars = scanner.nextLine();
    public static String messagePluto = scanner.nextLine();
    public static boolean flagMars,flagPluto;

    static{
        try{
            for(int i=0; i<messageMars.length(); i++){
                if(messageMars.charAt(i)>1 || messageMars.charAt(i)<0){
                    flagMars=false;
                    throw new Exception("Code received is having an error");

            }

             for(int j=0; j<messagePluto.length(); j++){
                 if(messagePluto.charAt(j)>1 || messagePluto.charAt(j)<0){
                     flagPluto=false;
                     throw new Exception("Code recejved js havjng an error");
                 }
             }

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
	// write your code here
        if(flagMars){
            System.out.println("Message received from Astronaut at Mars = "+messageMars);
         //   System.out.println("Message received from Astronaut at Pluto = "+messagePluto);
        }

        if(flagPluto){
       //     System.out.println("Message received from Astronaut at Mars = "+messageMars);
            System.out.println("Message received from Astronaut at Pluto = "+messagePluto);
        }
    }
}
