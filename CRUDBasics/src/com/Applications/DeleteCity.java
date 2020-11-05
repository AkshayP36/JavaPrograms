package com.Applications;

import com.CRUD.Entity.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCity {
    //create a session factory
    //create a session
    //create a try catch and finally block
    //write down method to delete the city entry

    public static  void main(String[] args){

        SessionFactory sessionFactory = new Configuration().
                                            configure("hibernate.cfg.xml").
                                            addAnnotatedClass(City.class).
                                            buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();


        try{

            //begin transaction
            session.beginTransaction();

            //fetch the data from column 49
            City city1 = session.get(City.class,49);
            System.out.println("The fetch city data : "+city1);

            //delete the data
            session.delete(city1);

            //commit the session to save the data into database
            session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }
}
