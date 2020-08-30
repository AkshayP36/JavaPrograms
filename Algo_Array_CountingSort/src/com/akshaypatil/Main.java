package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int[] array = {1,4,7,8,9,6,3,2,10,5,9,8,6,4,3,7,5};
	int min=1, max=10;
	countingSort(array, 1,10);

	for(int i=0; i<array.length; i++)
        System.out.print(array[i]+" ");
    }
    public static void countingSort(int[] array, int min, int max){
        int[] newArray = new int[max-min+1];

        for(int i=0; i<array.length; i++){
            newArray[array[i]-1]++;
        }
        int j=0;
        for(int i=min; i<=max; i++){

            while(newArray[i-min]>0){

                array[j++]=i;
                newArray[i-min]--;
            }
        }
    }
}
