package com.akshaypatil;
import static com.akshaypatil.ThreadColor.ANSI_GREEN;
import static com.akshaypatil.ThreadColor.ANSI_PURPLE;
import static com.akshaypatil.ThreadColor.ANSI_RED;


public class Main {

    public static void main(String[] args) {

        Thread anotherThread = new AnotherThread();
        anotherThread.start();


        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
                } catch(InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });

        myRunnableThread.start();

    }
}
