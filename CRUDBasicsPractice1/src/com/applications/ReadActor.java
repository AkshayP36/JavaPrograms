package com.applications;

import com.Entity.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadActor {
    //create a session factory
    //create a session
    //create a object to store the retrieved value

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                                            configure("hibernate.cfg.xml").
                                            addAnnotatedClass(Actor.class).
                                            buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();


        try{

            //Begin transcation
            session.beginTransaction();

            //create an list to store objects
            List<Actor> actorList = new ArrayList<>();

            // fetch the data based values
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the value to be displayed");
            int capacity = scanner.nextInt();


            for(int i=0;i<capacity;i++) {
                actorList.add(session.get(Actor.class,i));
            }

            //print the values
            for(int i=0;i<capacity;i++){
                System.out.println("the "+i+" th value = "+session.get(Actor.class,i));
            }


            //commit the session
            session.getTransaction().commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            session.close();
        }
    }

}
