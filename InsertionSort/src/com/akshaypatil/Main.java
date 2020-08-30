package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] array = {4,-8,63,98,-2,0,7,78};

	for(int unsortedIndex = 1; unsortedIndex<array.length; unsortedIndex++){
		int temp = array[unsortedIndex];
		int sortedMaxIndex;

		for(sortedMaxIndex = unsortedIndex; sortedMaxIndex>0 && array[sortedMaxIndex]>=array[unsortedIndex]; sortedMaxIndex--){
			array[sortedMaxIndex] = array[sortedMaxIndex-1];
		}

		array[sortedMaxIndex] = temp;
	}

	for(int i =0; i<array.length; i++){
        System.out.print(array[i]+" ");
    }
    }
}
