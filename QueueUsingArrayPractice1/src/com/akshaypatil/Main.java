package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        OSProcess process1 = new OSProcess("Startup",1);
        OSProcess process2 = new OSProcess("Google Chrome",2);
        OSProcess process3 = new OSProcess("File explorer",3);
        OSProcess process4 = new OSProcess("Chrome second browser",4);
        OSProcess process5 = new OSProcess("Internet explorer",5);
        OSProcess process6 = new OSProcess("Copy file from pen drive",6);

        //creating new queue for process boot
        OSQueue bootqueue=new OSQueue(2);

        //adding new process to the queue
        bootqueue.add(process1);
        bootqueue.add(process2);
        bootqueue.add(process3);
        bootqueue.add(process4);
        bootqueue.add(process5);
        bootqueue.add(process6);

        //printing all process in the OS
        bootqueue.printqueue();



        //closing an process from the queue
        System.out.println("\n\n------------Deque process list-----------------------");
        bootqueue.deque();
        bootqueue.printqueue();


        //checking an running process from the OS
        System.out.println("\n\n-----------------Peek the process element--------------");
        System.out.println(bootqueue.peek());



        //Closing all process from the queue
        System.out.println(bootqueue.deque());
        System.out.println(bootqueue.deque());
        System.out.println(bootqueue.deque());
        System.out.println(bootqueue.deque());
        System.out.println(bootqueue.deque());
        System.out.println(bootqueue.deque());
        System.out.println(bootqueue.deque());
        System.out.println(bootqueue.deque());
        System.out.println(bootqueue.deque());
        System.out.println(bootqueue.deque());
        System.out.println(bootqueue.deque());
    }
}
