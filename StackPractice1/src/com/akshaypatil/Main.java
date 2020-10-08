package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        ArrayStack myStack = new ArrayStack(10);
        myStack.push(new Employee("Virat","Kohli",1));
        myStack.push(new Employee("Rohit","Sharma",2));
        myStack.push(new Employee("KL","Rahul",3));
        myStack.push(new Employee("Mayank","Agarwal",4));
        myStack.push(new Employee("YJ","Chahal",5));

        myStack.printStack();
        System.out.println("--------");
        myStack.pop();
        myStack.printStack();
        System.out.println("------------");
        System.out.println(myStack.peek());
    }
}
