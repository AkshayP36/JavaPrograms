package com.applications;

import com.Entity.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteActor {
    //create session factory
    //create session
    //create try catch finally block
    //add code to delete the actor from database

    public static void main(String[] args){

        SessionFactory sessionFactory = new Configuration().
                                            configure("hibernate.cfg.xml").
                                            addAnnotatedClass(Actor.class).
                                            buildSessionFactory();


        Session session = sessionFactory.getCurrentSession();

        try{

            //start the transcation
            session.beginTransaction();

            //get details of actor whose detils to be deleted-> 3rd actor
            Actor actor = session.get(Actor.class,3);
            System.out.println("The actor to be deleted : "+actor);

            //delete the actor
            session.delete(actor);

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Data deletion process completed");

        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }
}
