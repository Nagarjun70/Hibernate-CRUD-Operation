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
		
		Employee employeeE1=new Employee();
		employeeE1.setName("Person 1");
		employeeE1.setAge(23);
		employeeE1.setGender("male");
		employeeE1.setSal(34500);
		employeeE1.setDesignation("Backend Developper");
		employeeE1.setPhno(987654321);
		
		Employee employeeE2=new Employee();
		employeeE2.setName("Person 2");
		employeeE2.setAge(28);
		employeeE2.setGender("Female");
		employeeE2.setSal(44500);
		employeeE2.setDesignation("Frountend Developper");
		employeeE2.setPhno(987654320);
		
		Employee employeeE3=new Employee();
		employeeE3.setName("Person 3");
		employeeE3.setAge(24);
		employeeE3.setGender("male");
		employeeE3.setSal(59500);
		employeeE3.setDesignation("Java Developper");
		employeeE3.setPhno(987654331);
		
		entityTransaction.begin();
		entityManager.persist(employeeE1);
		entityManager.persist(employeeE2);
		entityManager.persist(employeeE3);
		entityTransaction.commit();
		
		
	}

}
