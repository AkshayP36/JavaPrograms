package com.CRUDApps;

import com.Entity.Teachers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateTeachers {
    //create a sessionfactory
    //create a session
    //write a try-catch and finally block

    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().
                                            configure("hibernate.cfg.xml").
                                            addAnnotatedClass(Teachers.class).
                                            buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{

            //begin transaction
            session.beginTransaction();

            //fetch the data at position 3
            Teachers teacher2 = session.get(Teachers.class,2);
            System.out.println("the data at row 2 : "+teacher2+"\n\n");


            //update the data
            teacher2.setFirstName("Ashish");
            teacher2.setLastName("Pathak");
            teacher2.setSubject("Maths");

            //save the data
            session.save(teacher2);

            //commit the data
            session.getTransaction().commit();

            System.out.println("data update is sucessful!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            sessionFactory.close();
            session.close();
        }
    }
}
