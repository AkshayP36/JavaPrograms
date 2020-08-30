package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] array = {1,4,-7,8,-9,50,-3};

	for(int sortedIndex = array.length-1; sortedIndex>0; sortedIndex--){
	    for(int traverse=0; traverse<sortedIndex; traverse++){
	        if(array[traverse]>array[traverse+1]){
	            int temp = array[traverse];
	            array[traverse]=array[traverse+1];
	            array[traverse+1]=temp;
            }
        }
    }

	for(int i=0; i<array.length; i++){
        System.out.print(array[i]+" ");
    }
    }
}
