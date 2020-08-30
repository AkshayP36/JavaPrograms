package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] array={7,14,-98,2,0,-8,-1};

	for(int unsortedIndex = array.length-1; unsortedIndex>0; unsortedIndex--){

	    int indexOfMaxValue=0;

	    for(int traverse=0; traverse<=unsortedIndex; traverse++){
	        if(array[traverse]>array[indexOfMaxValue])
	            indexOfMaxValue=traverse;
        }
	    int temp = array[indexOfMaxValue];
	    array[indexOfMaxValue]=array[unsortedIndex];
	    array[unsortedIndex]=temp;
    }

	for(int i=0; i<array.length; i++)
        System.out.print(array[i]+" ");
    }
}
