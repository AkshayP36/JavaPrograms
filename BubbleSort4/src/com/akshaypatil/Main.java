package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] array={7,8,-9,45,120,-63,5841,-96};

	for(int sortedIndex = array.length-1; sortedIndex>0; sortedIndex--){
	    for(int traverseIndex = 0 ; traverseIndex<sortedIndex; traverseIndex++){
	        if(array[traverseIndex]>array[traverseIndex+1]){
	            int temp = array[traverseIndex];
	            array[traverseIndex]=array[traverseIndex+1];
	            array[traverseIndex+1]=temp;
            }
        }
    }

	for(int i=0; i<array.length; i++)
        System.out.print(array[i]+" ");
    }
}
