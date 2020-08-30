package com.akshaypatil;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* //To check Exceptions fo int values
	int x=9;
	int y=0;
      //  System.out.println(divide(x,y));
        System.out.println(divideLBYL(x,y));
        System.out.println(divideEAFP(x,y));


        //To check Exceptions in String
        int k= getInt();
        System.out.println("K = "+k);*/

        //Try - catch and throw
        int l,m,result;
        System.out.println("Please input valid two numbers");
        try{
            l=scanner.nextInt();
            m=scanner.nextInt();

        }catch (NoSuchElementException e){
            throw new ArithmeticException("Invalid input value");
        }

        try{
            result=l/m;
            System.out.println("Result = "+result);
        }catch(ArithmeticException e){
            throw new ArithmeticException("Can't divide by 0");
        }

    }


    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Please enter an number");
            return 0;
        }
    }
    public static int divide(int x, int y){
        return x/y;
    }
    public static int divideLBYL(int x, int y){
        if(y!=0)
            return x/y;
        else
            return 0;
    }
    public static int divideEAFP(int x, int y){
        try{
            return x/y;
        }
        catch(ArithmeticException e){
            System.out.println("Catched it!");
            return 0;
        }
    }
}
