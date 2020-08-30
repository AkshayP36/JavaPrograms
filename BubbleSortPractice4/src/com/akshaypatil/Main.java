package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] array = {4,7,10,-8,-56,-8,0,458,78};

	for(int unsortedIndex = array.length-1; unsortedIndex>0; unsortedIndex--){
	    for(int sortedIndex = 0; sortedIndex<unsortedIndex; sortedIndex++){
	        if(array[sortedIndex]>array[sortedIndex+1]){
	            int temp = array[sortedIndex];
	            array[sortedIndex] = array[sortedIndex+1];
	            array[sortedIndex+1] = temp;
            }
        }
    }

	for(int i=0; i<array.length; i++)
        System.out.print(array[i]+" ");
    }
}
