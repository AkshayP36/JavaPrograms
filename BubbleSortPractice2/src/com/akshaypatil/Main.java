package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] array = {12,0,45,-9,78,100};
	int temp;

	for(int sortedIndex = array.length-1; sortedIndex>0; sortedIndex--){
	    for(int unsortedIndex = 0; unsortedIndex<sortedIndex; unsortedIndex++){
	        if(array[unsortedIndex] > array[unsortedIndex+1]){
	            temp = array[unsortedIndex];
	            array[unsortedIndex] = array[unsortedIndex+1];
	            array[unsortedIndex+1] = temp;
            }
        }
    }

	for(int i=0; i<array.length-1; i++)
        System.out.print(array[i]+" ");
    }
}
