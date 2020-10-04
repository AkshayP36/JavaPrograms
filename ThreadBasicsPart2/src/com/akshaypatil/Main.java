package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("Another Thread Akshay");
        anotherThread.start();


        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("Hello from the anonymous class's implementation of run()");
            }
        });

        myRunnableThread.start();

        System.out.println("Hello again from the main thread.");
    }
}
