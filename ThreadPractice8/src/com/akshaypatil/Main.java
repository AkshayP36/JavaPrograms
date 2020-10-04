package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calling Thread Main.");

        //Anonymous Thread class operations
        new Thread(){
            public void run(){
                System.out.println("Calling Thread Anonymous");
                currentThread().setName("Unsung worriers");
                System.out.println("Calling sleep to Thread "+currentThread().getName());
                try{
                    Thread.sleep(10000);
                }catch(InterruptedException e){
                    System.out.println("Interruption called for Thread "+currentThread().getName());
                }
                System.out.println("Sleep Time over for Thread "+currentThread().getName());
            }
        }.start();



        //Calling thread for extended class
        Thread extendedThreadClass= new ExtendedThreadClass();
        extendedThreadClass.start();



        //Calling thread from implemented class
        Runnable implementedThreadClass = new ImplementedThreadClass();
        implementedThreadClass.run();



        //Calling implemented class from main class
        Thread implementedThreadClassFromMain= new Thread(new ImplementedThreadClass(){
            public void run(){
                System.out.println("Calling Thread ImplementedFromMain");
                System.out.println("Calling sleep to Thread Pirates of Indian Ocean");
                try{
                    Thread.sleep(30000);
                }catch(InterruptedException e){
                    System.out.println("Interruption called for Thread Pirates of Indian Ocean");
                }
                System.out.println("Sleep Time over for Thread Pirates of Indian Ocean");
            }
        });
        implementedThreadClassFromMain.start();
    }
}
