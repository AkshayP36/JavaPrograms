package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {

    public static void main(String[] args){
        //create session factory
        SessionFactory factory = new Configuration().
                                     configure("hibernate.cfg.xml")
                                     .addAnnotatedClass(Student.class)
                                     .buildSessionFactory();


        //create session
        Session session = factory.getCurrentSession();


        //creating a session code
        try{

            //create student object instance
            System.out.println("creating a new student object");
            Student tempStudent = new Student("Virat","Captain","virat@leading.com");

            //start a transaction
            session.beginTransaction();

            //query students
            List<Student> theStudents = session.createQuery("from Student").getResultList();

            //display the students
            getStudents(theStudents);


            System.out.println("-------------------------");
            //creating query using HIbernate Query Language(HQL) -> and displaying results
            List<Student> captainStudent = session.createQuery("from Student s where s.lastName='Captain'").getResultList();
            getStudents(captainStudent);



            System.out.println("-------------------------");
            //creating query using HIbernate Query Language(HQL) -> and displaying results
            theStudents  = session.createQuery("from Student s where s.email like '%@gmail.com'").getResultList();
            getStudents(theStudents);


            //commit the transaction
            session.getTransaction().commit();
        }
        finally{
            factory.close();
        }




    }

    private static void getStudents(List<Student> captainStudent) {
        for (Student captain : captainStudent) {
            System.out.println(captain);
        }
    }
}
