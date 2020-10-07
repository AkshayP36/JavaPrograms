package com.akshaypatil;

import java.util.Scanner;

public class Main {

    public static boolean flag=true;
    public static Scanner scanner = new Scanner(System.in);
    public static int B=scanner.nextInt();
    public static int H= scanner.nextInt();

    static{
        try{
            if(B<0 || H<0){
                flag=false;
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        if(flag){
	    System.out.println("Area = "+(B*H));
        }
    }
}
