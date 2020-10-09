package com.emailapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private int mailboxCapacity=500;
    private String password;
    private String email;
    private String alternateEmail;
    private String companySuffix="mycodingcompany.com";

    //Constructor to ask for first name and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email address created: "+this.firstName+" "+this.lastName);

        //Call a method for the department, return department
            this.department = setDepartment();
            System.out.println("Employee department is = " + this.department);

        //call password method to generate random password
        this.password=randomPassword();
        System.out.println("Employee temporary password is: "+this.password);

        //generating email
        this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
        System.out.println("Employee professional mail id: "+email);
    }


    //ask for the department
    private String setDepartment() {
        System.out.println("Enter the department number from following list:\n" +
                "1 for Sales\n" +
                "2 for Development\n" +
                "3 for Accounting\n" +
                "0 for None");

        try{Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        switch(departmentChoice){
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            case 0:
                return "General";
            default:
                System.out.println("Please enter valid department");
                setDepartment();
        }
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        return null;
    }




    //create an random password
    private String randomPassword(){

        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ023654789/*-+~!@#$%^&*()_=-{}:?><[]';/.,'abcdefghijklmnopqrstuvwxyz";
        char[] password=new char[12];
        for(int i=0;i<12;i++){
            int random=(int) (Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(random);
        }

        return new String(password);
    }



    //set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }



    //set an alternate email id
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }



    //Change the password
    public void changePassword(String password){
        this.password=password;
    }


    //defining get methods
    //get mailbox capacity
    public int getMailboxCapacity(){
        return this.mailboxCapacity;
    }

    //get alternate email address
    public String getAlternateEmail(){
        return this.alternateEmail;
    }

    //get password
    public String getPassword(){
        return this.password;
    }

    //Display all info
    public String displayInfo(){
        return "Employee Name: "+firstName+" "+lastName+"\n"+
                "Employee Email: "+email+"\n"+
                "Employee Mailbox capacity: "+mailboxCapacity;
    }
}
