package com.akshaypatil;

public class Main {

    public static void main(String[] args) {


        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList myCompanyEmployee = new EmployeeLinkedList();
        myCompanyEmployee.addToFront(mikeWilson);
        myCompanyEmployee.addToFront(marySmith);
        myCompanyEmployee.printList();

        System.out.println("\n\n");
        myCompanyEmployee.removeFromFront();
        myCompanyEmployee.printList();



    }
}
