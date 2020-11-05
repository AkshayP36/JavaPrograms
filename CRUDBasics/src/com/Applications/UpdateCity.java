package com.Applications;

import com.CRUD.Entity.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateCity {
    //creation session factory
    //create session
    //create try catch and finally block
    //write down code to fetch the data and update it

    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().
                                            configure("hibernate.cfg.xml").
                                            addAnnotatedClass(City.class).
                                            buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{

            //start transaction
            session.beginTransaction();

            //get the value at position -> 50
            City city1= session.get(City.class,50);
            System.out.println("The fetched city details are : "+city1);


            //update the value at posiion -> 50
            city1.setName("Buldhana");
            city1.setCountryCode("In");
            city1.setDistrict("Maharashtra");
            city1.setPopulation("89");

            //save the session
            session.save(city1);

            //commit the code into database to store values into database
            session.getTransaction().commit();
            System.out.println("Data update done!");
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }
}
