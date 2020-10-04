package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        System.out.println("Running Thread from main method");

        //To check get name and set name of a anonymous class

        new Thread(){
            public void run(){
                System.out.println("\n\n----------------------------");
                System.out.println("Running anonymous Thread");
              //  currentThread().setName("Akshay Learning Thread called");
                System.out.println("The name of the anonymous running thread is = "+currentThread().getName());
                System.out.println("\n\n");
            }
        }.start();

        System.out.println("----------------------------");
        //To check get name and set name from the another class created

        Thread anotherExtededClass = new AnotherExtendedClass();
        anotherExtededClass.start();
        System.out.println("\n\nCalling Thread get name from main method = "+anotherExtededClass.getName());
    }
}
