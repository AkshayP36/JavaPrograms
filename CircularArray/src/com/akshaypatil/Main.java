package com.akshaypatil;

import java.util.Scanner;

public class Main {
    static Object[] remove(Object array[], int index, int size, int start) {
        // index is with respect to first position
        int arrayPosition = (size + index) % array.length;
        int numberShifts = size - index - 1; // because we are not considering the value thats in that position
        int to = arrayPosition;// gives us index with respect to the array position
        int from = (to + 1) % array.length;
        for (int i = 0; i < numberShifts; i++) {
            array[to] = array[from];
            to = from;
            from = (from + 1) % array.length;
        }
        int lastValIndex = (size + start - 1) % array.length;
        array[lastValIndex] = null;
        return array;
    }

    // the method would return the new Object array after insertion
    static Object[] insert(Object array[], int index, int val, int size, int start) {
        int openPlace = (size + start) % array.length;// next available position
        int numberShifts = size - index; // taking all the values up till the value in the position
        int to = openPlace;// gives us index with respect to the array position
        int from = (to - 1) % array.length;
        for (int i = 0; i < numberShifts; i++) {
            array[to] = array[from];
            from = (from - 1) % array.length;
        }
        int newValuePostion = (size + index) % array.length;
        array[newValuePostion] = val;
        return array;
    }
    public static void main(String[] args) {

        // defining an array
        Object a[] = { 1, 8, 3, 6, 8, null, null, 14, 5 };
        System.out.println("The array looks like: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // starting point
        int startPoint = 7;
        // total amount of values in the array
        int size = 7;
        System.out.println(" ");
        System.out.println(" ");

        // printing circular array (only the values)
        System.out.println("The circular array: ");
        int k = startPoint;
        for (int i = 0; i < size; i++) {
            System.out.print(a[k] + " ");
            // modding to ensure it goes back to 0 when reaching the end of the array
            k = (k + 1) % a.length;
        }

        Scanner anik = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("What do you want to do?");
        System.out.println("Remove? (1)");
        System.out.println("Insert? (2)");
        int userInput = anik.nextInt();

        if (userInput == 1) {
            System.out.println("Which index?");
            int removeIndex = anik.nextInt();
            Object newArray[] = remove(a, removeIndex, size, startPoint);
            // printing the new array
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        } else {
            System.out.println("Which index?");
            int insertIndex = anik.nextInt();
            System.out.println("What number?");
            int newValue = anik.nextInt();
            Object newArray[] = insert(a, insertIndex, newValue, size, startPoint);
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }

    }
    }

