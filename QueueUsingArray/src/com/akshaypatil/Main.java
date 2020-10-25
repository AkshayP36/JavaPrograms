package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee employee1= new Employee("abc",1);
        Employee employee2= new Employee("abcd",2);
        Employee employee3= new Employee("abce",3);
        Employee employee4= new Employee("abcf",4);
        Employee employee5= new Employee("abcg",5);

        //adding instances of an employee to the queue
        QueueArray queue = new QueueArray(3);
        queue.add(employee1);
        queue.add(employee2);
        queue.add(employee3);
        queue.add(employee4);
        queue.add(employee5);
      //  printing the queue elements
        queue.printqueue();

        //dequeuing the queue
        System.out.println("Pop element = "+queue.dequeue());
        System.out.println("---------");
        queue.printqueue();


        //doing peek from the queue
        System.out.println("peek element = "+queue.peekqueue());
        System.out.println("------------------");
        queue.printqueue();


        System.out.println("\n\n=====================");
        queue.dequeue();queue.dequeue();queue.dequeue();queue.dequeue();queue.dequeue();queue.dequeue();


        System.out.println("queue length = "+queue.size());

    }
}
