package com.CRUDApps;

import com.Entity.Teachers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteTeachers {

    //create a session factory
    //create a session
    //create a try catch-finally block

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                                            .configure("hibernate.cfg.xml")
                                            .addAnnotatedClass(Teachers.class)
                                            .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{

            //start the transaction
            session.beginTransaction();

            //fetch the teacher whose values to be deleted
            Teachers teachers = session.get(Teachers.class,3);
            System.out.println("The teacher at position 3: "+teachers);

            //delete the teacher
            session.delete(teachers);

            //commit the teacher code
            session.getTransaction().commit();

            System.out.println("teacher delete sucessful!!");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally{
            sessionFactory.close();
            session.close();
        }
    }
}
