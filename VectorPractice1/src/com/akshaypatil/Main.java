package com.akshaypatil;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        List<BubbleSort> array1= new Vector<>();
        List<BubbleSort> array2= new Vector<>();
        List<BubbleSort> array3= new Vector<>();
        List<BubbleSort> array4= new Vector<>();
        int[] a = {1,-2,3,-9,-89};
        int[] b = {10,-20,30,-90,-890};
        int[] c = {14,-24,34,-49,-894};
        int[] d = {561,-267,367,-9767,-7689};
        array1.add(new BubbleSort(a));
        array2.add(new BubbleSort(b));
        array3.add(new BubbleSort(c));
        array4.add(new BubbleSort(d));

        array1.forEach(bubbleSort -> System.out.println(bubbleSort));
        array2.forEach(bubbleSort -> System.out.println(bubbleSort));
        array3.forEach(bubbleSort -> System.out.println(bubbleSort));
        array4.forEach(bubbleSort -> System.out.println(bubbleSort));

        System.out.println("\n\n\n");
        BubbleSort test = new BubbleSort(a);
        System.out.println(test.toString());
    }
}
