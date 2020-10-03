package com.akshaypatil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //declaring arraylist
        List<Employee> employeeList = new ArrayList<>();

        //adding values to the arrayList
        employeeList.add(new Employee("Rahul", "C", 1));
        employeeList.add(new Employee("Vaibhav", "K", 2));
        employeeList.add(new Employee("Kewal", "S", 3));
        employeeList.add(new Employee("Vivek", "Y", 4));

        //Lambda expression
        employeeList.forEach(employee -> System.out.println(employee));

        //to display using for loop
        System.out.println("\n\n");
        for (int i = 0; i < employeeList.size(); i++) {
            for (int j = 0; j < employeeList.size(); j++) {
                System.out.println(employeeList.get(i).getFirstName());
            }
        }


        //convert into the array
        System.out.println("\n----------------------");
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);


            System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
            System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

            employeeList.remove(2);
            //   employeeList.forEach(employee -> System.out.println(employee));
        }
    }
}
