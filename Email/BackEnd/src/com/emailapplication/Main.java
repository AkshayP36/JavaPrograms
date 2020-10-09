package com.emailapplication;

public class Main {
    public static void main(String[] args) {
        Email employee1 = new Email("Akshay","Patil");
        employee1.changePassword("mynewPassword5478");
        employee1.setAlternateEmail("akshay.patil@coder.com");
       // System.out.println("Alternate mail address : "+employee1.getAlternateEmail());
        System.out.println(employee1.displayInfo());


    }
}
