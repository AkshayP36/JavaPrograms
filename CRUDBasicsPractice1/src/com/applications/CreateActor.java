package com.applications;

import com.Entity.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateActor {
    //create a session factory
    //create a session
    //create a try catch and finally block

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                                            configure("hibernate.cfg.xml").
                                            addAnnotatedClass(Actor.class).
                                            buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{

            //create a object to store the actor values
            Actor actor = new Actor("Ashok","Saraf");

            //begin transaction
            session.beginTransaction();

            //store the object values into database
            session.save(actor);


            //commit the code to save values into database
            session.getTransaction().commit();

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }
}
