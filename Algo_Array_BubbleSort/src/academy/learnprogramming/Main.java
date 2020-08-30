package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int[] myArray = {20,35,-15,7,55,1,-22};
	int call=0;

	for(int sortedArrayIndex = myArray.length-1; sortedArrayIndex>0; sortedArrayIndex--){
	    for(int sortIndex = 0; sortIndex<sortedArrayIndex ; sortIndex++){
	        call++;
	        if(myArray[sortIndex] > myArray[sortIndex+1])
	            swap(myArray, sortIndex, sortIndex+1);
        }
    }

	    for(int i=0; i<=myArray.length-1 ; i++)
        System.out.print(myArray[i]+" ");
        System.out.println("call = "+call);

    }

    public static void swap(int[] array , int i, int j){
        if(i==j)
            return;

        int temp= array[i];
        array[i] = array[j];
        array[j]=temp;
    }
}
