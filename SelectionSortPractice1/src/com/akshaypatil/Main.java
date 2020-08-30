package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] array = {7,8,12,-9,0,-456,-7,698};


	for(int unsortedIndex=array.length-1; unsortedIndex>0; unsortedIndex--){
		int largestValueIndex=0;
	    for(int sortedIndex=0; sortedIndex<=unsortedIndex; sortedIndex++){

	        if(array[sortedIndex]>array[largestValueIndex])
	            largestValueIndex=sortedIndex;

        }

	    int temp= array[largestValueIndex];
	    array[largestValueIndex] = array[unsortedIndex];
	    array[unsortedIndex]=temp;
    }

	for(int i=0; i<array.length; i++){
        System.out.print(array[i]+" ");
    }
    }
}
