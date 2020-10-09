package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=0;i<30;i++){
            for(int j=0;j<60;j++){
                if(i%3==0 || j%5==0)
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
