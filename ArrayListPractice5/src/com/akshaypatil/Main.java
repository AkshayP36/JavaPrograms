package com.akshaypatil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Fibonacci> fibonaccis=new ArrayList<>();
        int[] array1= {0,1,1};
        int[] array2= {1,2,3};
        int[] array3= {3,-1,-4};
        int[] array4= {6,7,-13};
        int[] array5= {0,2,2};
        fibonaccis.add(new Fibonacci(array1,8));
        fibonaccis.add(new Fibonacci(array2,8));
        fibonaccis.add(new Fibonacci(array3,15));
        fibonaccis.add(new Fibonacci(array4,12));
        fibonaccis.add(new Fibonacci(array5,13));

        fibonaccis.forEach(fibonacci -> System.out.println(fibonacci));
    }
}
