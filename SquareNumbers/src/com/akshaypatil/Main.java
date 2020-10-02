package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	int n=Integer.MAX_VALUE;
	boolean isSquare = isSquare(n);
        System.out.println(isSquare);
    }
    public static boolean isSquare(int n) {

        if(n<0)
            return false; // fix me!

        double squareRoot = Math.sqrt(n);
        int intcase = (int) squareRoot;
        squareRoot = squareRoot-intcase;
        if(squareRoot<0 || squareRoot>0)
            return false;
        else
            return true;
    }
}
