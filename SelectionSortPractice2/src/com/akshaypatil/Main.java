package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array= {7,8,10,-3,-4,-14578,98,-3,980,-7};

        for(int unsortedIndex= array.length-1; unsortedIndex>0; unsortedIndex--){

            int maxValueIndex=0;
            for(int traverseIndex=0; traverseIndex<=unsortedIndex; traverseIndex++){
                if(array[traverseIndex]>array[maxValueIndex])
                    maxValueIndex=traverseIndex;
            }

            int temp = array[unsortedIndex];
            array[unsortedIndex]=array[maxValueIndex];
            array[maxValueIndex]=temp;
        }

        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
    }
}
