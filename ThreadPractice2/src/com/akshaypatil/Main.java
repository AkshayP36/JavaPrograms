package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        System.out.println("Running thread from main method!");

        new Thread(){
            public void run(){
                System.out.println("Running thread from anonymous thread!");
            }
        }.start();


        System.out.println("Running another thread from main method");

        Thread anotherClass = new AnotherClass();
        anotherClass.start();
    }
}
