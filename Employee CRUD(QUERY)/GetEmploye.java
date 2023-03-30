package com.jsp.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetEmploye 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ARJUN");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Query query=entityManager.createQuery("select e from Employee e");  //Query from java.persistence package
		List<Employee> employeeE=query.getResultList();
		
		for (Employee employee : employeeE) {
			System.out.println(employee);
			System.out.println("The Employe id is: "+employee.getId());
			System.out.println("The Employe name is: "+employee.getName());
			System.out.println("The Employe gender is: "+employee.getGender());
			System.out.println("The Employe Age is: "+employee.getAge());
			System.out.println("The Employe Sal is: "+employee.getSal());
			System.out.println("The Employe desigantion is: "+employee.getDesignation());
			System.out.println("The Employe PHno is: "+employee.getPhno());
			System.out.println("************************************************");
		}
		
	}

}
