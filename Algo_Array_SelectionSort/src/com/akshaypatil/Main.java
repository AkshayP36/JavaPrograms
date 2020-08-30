package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] array = {45,78,79,12,-5,0,9};

	for(int unsortedIndex = array.length-1; unsortedIndex>0 ; unsortedIndex--){
	    int largest = 0;

	    for(int sortedIndex = 0; sortedIndex<=unsortedIndex ; sortedIndex++){
	        if(array[sortedIndex] > array[largest]) {
				largest = sortedIndex;
			}

		}
		int temp = array[largest];
		array[largest] = array[unsortedIndex];
		array[unsortedIndex] = temp;
        }



		System.out.println("results:");
	for(int i=0; i<array.length ; i++) {

		System.out.print(array[i] + " ");
	}
    }
}
