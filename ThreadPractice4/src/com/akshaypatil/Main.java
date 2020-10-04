package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	System.out.println("Running Thread from main method");

	Thread name = new SubClassThread();
	name.start();

	//Creating anonymous class of Thread
        new Thread(){
            public void run(){
                System.out.println("Running thread from anonymous class");
            }
        }.start();

        //Running another Thread from Main method
        System.out.println("Running method from main class again");
    }
}
