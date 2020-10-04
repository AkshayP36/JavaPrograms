package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
        System.out.println("Running thread from main method");

        //Trying sleep from another created class extended thread
        Thread newClass = new NewClass();
        newClass.start();

        //Interrupting the above class to throw error
        Thread newClass2= new NewClass2();
        newClass2.start();


        //Calling anonymous Thread class here
        new Thread(){
            public void run(){
                try{
                    System.out.println("Start running sleep Duddo Thread:");
                    Thread.sleep(15000);
                }catch(InterruptedException e){
                    System.out.println("This is anonymous Thread calling exception");
                }
                System.out.println("Sleep time over. Let's get back to work Dudoo Thread");
            }
        }.start();
    }
}
