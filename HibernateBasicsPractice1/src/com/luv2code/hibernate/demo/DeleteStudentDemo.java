package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 5;

			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();


			// retrieve student based on the id: primary key
			//System.out.println("\nGetting student with id: " + studentId);
		  //  Student myStudent = session.get(Student.class, studentId);

		    //delete the student -> single transaction
			//session.delete(myStudent);

			//delete the student -> query transaction
			System.out.println("Deleting the transaction where id=6");
			session.createQuery("delete from Student where id=2").executeUpdate();


            // commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





