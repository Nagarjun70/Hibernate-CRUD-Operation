package com.jsp.employee;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class GetDataBasedOnSalary
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ARJUN");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Query query=entityManager.createQuery("select s from Employee s where s.sal>?1 or s.age>?2");
		query.setParameter(1,30000.0);
		query.setParameter(2, 23);
		List<Employee>employee=query.getResultList();
		for(Employee employee1:employee)
		{
			System.out.println(employee);
			System.out.println("The Employe id is: "+employee1.getId());
			System.out.println("The Employe name is: "+employee1.getName());
			System.out.println("The Employe gender is: "+employee1.getGender());
			System.out.println("The Employe Age is: "+employee1.getAge());
			System.out.println("The Employe Sal is: "+employee1.getSal());
			System.out.println("The Employe desigantion is: "+employee1.getDesignation());
			System.out.println("The Employe PHno is: "+employee1.getPhno());
			System.out.println("************************************************");
			
			
		}
		
	}

}
