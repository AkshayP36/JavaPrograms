package com.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    //create string values for saving database url, username and password
    //create driver manager to check jdbc connection

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://localhost:3306/sakila?useSSL=false&serverTimezone=UTC";
        String username = "hbstudent";
        String password = "hbstudent";

        try {
            System.out.println("Connecting to database sakila....");
            Connection connection = DriverManager.getConnection(jdbcurl, username, password);
            System.out.println("Sucessfully connected to the database..");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
