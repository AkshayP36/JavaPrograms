package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //defining employee instances
        Employee employee1= new Employee("abc",1);
        Employee employee2= new Employee("abcd",2);
        Employee employee3= new Employee("abce",3);
        Employee employee4= new Employee("abcf",4);
        Employee employee5= new Employee("abcg",5);


        //adding all employee instances onto stack
        LinkedListStack trackDevelopers = new LinkedListStack();
        trackDevelopers.push(employee1);
        trackDevelopers.push(employee2);
        trackDevelopers.push(employee3);
        trackDevelopers.push(employee4);
        trackDevelopers.push(employee5);

        //printing all stack elements
        trackDevelopers.printStack();


        //doing pop operation
        System.out.println("Pop element : "+trackDevelopers.pop());
        System.out.println("--------------------");
        trackDevelopers.printStack();
    }
}
