package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
        System.out.println("Running thread from main method");

        //Calling another class which implements runnable class
        Runnable anotherClass = new AnotherClass();
        anotherClass.run();

        //Calling new thread from main method
        Thread newThread = new Thread(new AnotherClass(){
            @Override
            public void run() {
                System.out.println("Calling thread from newly created newThread");
            }
        });
        newThread.start();

        //Calling one more time
        Thread secondNewThread = new Thread(new AnotherClass(){
            public void run(){
                System.out.println("Here is a second Newly created Thread is running");
            }
        });
        secondNewThread.start();
    }
}
