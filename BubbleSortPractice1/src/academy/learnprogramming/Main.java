package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int[] array = {5,7,-9,45,78,36,0,150,15,15,22,23};

	for(int sortedArrayIndex = array.length-1; sortedArrayIndex>0 ; sortedArrayIndex--){
	    for(int sortIndex=0; sortIndex <sortedArrayIndex; sortIndex++){
	       if(array[sortIndex] > array[sortIndex+1])
	           swap(array, sortIndex, sortIndex+1);
        }
    }

	for(int i =0; i<array.length-1; i++)
        System.out.print(array[i]+" ");
    }
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
