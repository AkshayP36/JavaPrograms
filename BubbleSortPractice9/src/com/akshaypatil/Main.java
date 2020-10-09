package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        //initializing array
        int[] myarray={5,8,9,6,-8,-6,30};


        //bubble sort method
        for(int sorted=myarray.length-1; sorted>=0;sorted--){
            for(int traverse=0;traverse<sorted;traverse++){
                if(myarray[traverse]>myarray[traverse+1]){
                    int temp=myarray[traverse];
                    myarray[traverse]=myarray[traverse+1];
                    myarray[traverse+1]=temp;
                }
            }
        }

        //priting sorted array
        for(int i=0;i<myarray.length;i++){
            System.out.print(myarray[i]+" ");
        }
    }
}
