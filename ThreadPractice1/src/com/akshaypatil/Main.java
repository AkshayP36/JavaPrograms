package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
        Thread secondThread = new SecondThread();
        secondThread.start();
        System.out.println("Running Thread from main method");

        new Thread(){
            public void run(){
                System.out.println("Running thread from anonymous class!");
            }
        }.start();

        System.out.println("Running second thread from main method");


    }
}
