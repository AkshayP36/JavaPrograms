package com.akshaypatil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        //defining standard o/p
        Scanner scanner = new Scanner(System.in);

        //taking number of test cases
        int testCases =scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<testCases;i++){

            //defining final o/p
            int maxOfFunc = 0;

            //Taking i/p samples
            int redSequence = scanner.nextInt();
            int[] redSequenceArray = new int[redSequence];
            for(int k=0;k<redSequence;k++){
                redSequenceArray[k]=scanner.nextInt();
            }
            scanner.nextLine();
            int blueSequence = scanner.nextInt();
            int[] blueSequenceArray = new int[blueSequence];
            for(int k=0;k<blueSequence;k++){
                blueSequenceArray[k]=scanner.nextInt();
            }


            //Checking Max of Func
            //sorting to find the Min among both colours
            Arrays.sort(blueSequenceArray);
            Arrays.sort(redSequenceArray);
            int min= blueSequenceArray[0]<redSequenceArray[0]?blueSequenceArray[0]:redSequenceArray[0];
            for(int k=0;k<blueSequenceArray.length;k++){
                if(blueSequenceArray[k]>0)
                    maxOfFunc=maxOfFunc+blueSequenceArray[k];
            }
            for(int k=0;k<redSequenceArray.length;k++){
                if(redSequenceArray[k]>0)
                    maxOfFunc=maxOfFunc+redSequenceArray[k];
            }

            //final calculations
           // System.out.println("Max = "+maxOfFunc);
          //  System.out.println("Min = "+min);


            //final o/p
            if(maxOfFunc==0)
                System.out.println(0);
            else
            System.out.println(maxOfFunc+min);

        }



        //closing the scanner
        scanner.close();



    }
}
