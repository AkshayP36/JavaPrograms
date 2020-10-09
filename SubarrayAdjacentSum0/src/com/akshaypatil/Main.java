package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        // intialize the array
        int[] myarray= {-4,4,8,-8,6,3,0,-7,12};

        // initializing counter for number of pairs
        int pair=0;

        //creating loop for counting adjacent pairs with sum =0
        for(int i=0;i<myarray.length-1;i++){
            if(myarray[i]+myarray[i+1]==0)
                pair++;
        }

        System.out.println("Total pairs = "+pair);
    }
}
