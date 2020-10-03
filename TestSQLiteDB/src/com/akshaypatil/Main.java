package com.akshaypatil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try{
          //  Class.forName("org.sqlite.JDBC");
            Connection conn= DriverManager.getConnection("jdbc:sqlite:D:\\DevOps\\SQLite\\TimBuchlkaDBExamples\\musicTest.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

            statement.close();
            conn.close();

        }catch(SQLException e){
            System.out.println("Something went wrong.."+e.getMessage());
        }

       /* catch(ClassNotFoundException e){
            System.out.println("Class Not Found Exception.."+e.getMessage());
        }*/
    }
}
