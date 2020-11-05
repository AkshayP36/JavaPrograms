package com.applications;

import com.Entity.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateActor {
    //create a session factory
    //create a session
    //create a try catch and finally block and write a code into that

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().
                                            configure("hibernate.cfg.xml").
                                            addAnnotatedClass(Actor.class).
                                            buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{
            //begin transaction
            session.beginTransaction();


            //fetch the value at 5th row
            Actor actor = session.get(Actor.class, 5);


            //print the value at 5th row
            System.out.println("The actor value to be updated : "+actor);

            //update the values
            actor.setFirstName("Lakshmikant");
            actor.setLastName("Berde");


            //commit the code
            session.getTransaction().commit();


        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }
}
