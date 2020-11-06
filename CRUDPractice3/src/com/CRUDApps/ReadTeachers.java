package com.CRUDApps;

import com.Entity.Teachers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadTeachers {
    //create a session factory
    //create a session
    //create a try catch and finally block

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                                             .configure("hibernate.cfg.xml")
                                             .addAnnotatedClass(Teachers.class)
                                             .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{

            //begin transaction
            session.beginTransaction();

            //fetch the teacher at positon 3
            Teachers teacher3 = session.get(Teachers.class,3);

            //print the fetched data
            System.out.println("The teacher : "+teacher3);

            //commit the transaction
            session.getTransaction().commit();

            System.out.println("The data reading sucessfully!!");
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
