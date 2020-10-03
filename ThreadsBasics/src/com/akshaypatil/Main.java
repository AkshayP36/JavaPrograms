package com.akshaypatil;
import static com.akshaypatil.ThreadColor.ANSI_GREEN;
import static com.akshaypatil.ThreadColor.ANSI_RED;
public class Main {

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Running thread from anonymous class!");
            }
        }.start();
        System.out.println(ANSI_GREEN+"Running Thread from main Thread!");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        System.out.println(ANSI_RED+"Running Thread again from main method!");


    }
}
