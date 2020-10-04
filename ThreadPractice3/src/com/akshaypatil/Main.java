package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
        
            for (int i = 0; i < 10; i++)
                System.out.print(i + " ");

            System.out.println("\n\n");
            new Thread() {
                public void run() {
                    for (int i = 0; i < 30; i++)
                        System.out.print(i + " ");
                }
            }.start();
            System.out.println("\n\n");
            Thread anotherClass = new AnotherClass();

            System.out.println("\n\n");
            for (double i = 0; i < 10; i = i + 0.5) {
                System.out.print(i + " ");
                anotherClass.start();
            }
        }

}
