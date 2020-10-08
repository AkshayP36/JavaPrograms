package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        StackArray myarray= new StackArray(10);
        myarray.push(new Employee("A","B",1));
        myarray.push(new Employee("AA","BB",2));
        myarray.push(new Employee("AAA","BBB",3));
        myarray.push(new Employee("AAAA","BBBB",4));
        myarray.push(new Employee("AAAAA","BBBBB",5));

        myarray.printStack();

        myarray.pop();

        System.out.println("-----------------------------");
        myarray.printStack();

        System.out.println("------------------------------");
        myarray.peek();
    }
}
