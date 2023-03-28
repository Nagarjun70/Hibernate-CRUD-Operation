package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainEmployee 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ARJUN");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Employee employee1=new Employee();
		employee1.setId(201);
		employee1.setName("ARJUN");
		employee1.setAge(25);
		employee1.setGender("MALE");
		employee1.setSal(50000.0);
		employee1.setDesignation("JAVAD");
		
		Employee employee2=new Employee();
		employee2.setId(202);
		employee2.setName("ARYAA");
		employee2.setAge(26);
		employee2.setGender("MALE");
		employee2.setSal(45000.0);
		employee2.setDesignation("SE");
		
		Employee employee3=new Employee();
		employee3.setId(203);
		employee3.setName("SHIVAA");
		employee3.setAge(28);
		employee3.setGender("MALE");
		employee3.setSal(67000.0);
		employee3.setDesignation("ANALYST");
		
		Employee employee4=new Employee();
		employee4.setId(204);
		employee4.setName("NANU");
		employee4.setAge(20);
		employee4.setGender("MALE");
		employee4.setSal(25000.0);
		employee4.setDesignation("DEVELOPER");
		
		entityTransaction.begin();
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityManager.persist(employee4);
		entityTransaction.commit();
		
		
	}

}
