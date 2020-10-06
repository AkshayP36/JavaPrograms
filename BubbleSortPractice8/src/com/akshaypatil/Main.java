package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] myArray ={4,8,-9,-3,78,-90};

	for(int sortedIndex=myArray.length-1; sortedIndex>0; sortedIndex--){
	    for(int unsortedIndex=0; unsortedIndex<sortedIndex;unsortedIndex++){
	        if(myArray[unsortedIndex+1]<myArray[unsortedIndex]){
	            int temp = myArray[unsortedIndex+1];
	            myArray[unsortedIndex+1]=myArray[unsortedIndex];
	            myArray[unsortedIndex]=temp;
            }

        }
    }

	for(int i=0; i<myArray.length;i++)
        System.out.print(myArray[i]+" ");
    }
}
