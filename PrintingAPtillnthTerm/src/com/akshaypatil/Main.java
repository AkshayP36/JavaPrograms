package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	// initializing array
        int[] ap={1,2,3};
        int n=30;

        //calculating required values for formula
        int d=ap[1]-ap[0];

        //printing an=a1+(n-1)*d
        for(int i=1; i<=n;i++){
            System.out.print((ap[0]+(i-1)*d)+" ");
        }
    }
}
