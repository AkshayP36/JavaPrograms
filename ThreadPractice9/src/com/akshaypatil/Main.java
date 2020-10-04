package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        System.out.println("Running main thread");

        new Thread(){
            public void run(){
                System.out.println("Running thread from anonymous class");
            }
        }.start();

        Thread anotherClass = new AnotherClass();
        anotherClass.start();

        Thread myRunnableClass= new Thread(new MyRunnableClass(){
            public void run(){
                System.out.println("Running thread from runnable class");
            }
        });
        myRunnableClass.start();

        (new Thread(new MyRunnableClass())).start();

        

    }
}
