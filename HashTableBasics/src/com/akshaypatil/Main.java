package com.akshaypatil;

public class Main {

    public static void main(String[] args) {


        //declaring the employee instances
        Employee employee1= new Employee("abcd",1);
        Employee employee2= new Employee("abce",2);
        Employee employee3= new Employee("abcf",3);
        Employee employee4= new Employee("abcg",4);
        Employee employee5= new Employee("abch",5);

        //storing employee instances into hashtable
        HashtableArray hashtableArray = new HashtableArray();
        hashtableArray.put("a",employee1);
        hashtableArray.put("ab",employee2);
        hashtableArray.put("abc",employee3);
        hashtableArray.put("abcd",employee4);
        hashtableArray.put("abcde",employee5);
        hashtableArray.put("xcpolo",employee1);


        //printing an hashtable
        hashtableArray.printHashtable();


        //retrieve the value from hashtable
        System.out.println("------------------------");
        System.out.println(hashtableArray.get("99"));
        System.out.println(hashtableArray.get("abcd"));

    }
}
