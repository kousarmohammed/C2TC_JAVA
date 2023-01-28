package com.tns.joinedtable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Joinedtable {
	public static void main(String[]args) {
		EntityManagerFactory factory=Persistence("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee=new Employee();
		employee.setName("junaid");
		employee.setSalary(50000);
		em.persist(employee);
		
		//create one manager
		Manager manager=new Manager();
		manager.setName("Sha");
		manager.setSalary(240000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("Added on employee and manager to database");
		em.close();
		factory.close();
		
		
	}


	}



