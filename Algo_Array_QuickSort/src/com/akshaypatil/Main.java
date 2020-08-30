package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] array={4,-7,0,-456,987,63};

    quickSort(array,0,array.length);

	for(int i=0; i<array.length; i++){
        System.out.print(array[i]+" ");
    }

    }

    public static void quickSort(int[] array, int start, int end){
        if(end-start<2)
            return;

        int pivotIndex = pivot(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex+1, end);
    }
    public static int pivot(int[] input, int start, int end){
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i < j) {
            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
                }

            // NOTE: empty loop body {4,-7,0,-456,987,63};
            while (i < j && input[++i] <= pivot)
            if (i < j) {
                input[j] = input[i];
             }
        }
        input[j] = pivot;
        return j;
    }
}
