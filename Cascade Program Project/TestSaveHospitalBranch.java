package com.jsp.cascade;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ARJUN");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction  entityTransaction= entityManager.getTransaction();

		Hospital hospital=new Hospital();
		hospital.setName("apollo");
		hospital.setWebsite("www.apollo.com");
		hospital.setNoDoctors(10);

		Hospital hospital1=new Hospital();
		hospital1.setName("Narayana");
		hospital1.setWebsite("www.narayana.com");
		hospital1.setNoDoctors(15);

		Branch branch=new Branch();
		branch.setName("Bangalore");
		branch.setLocation("Basavanagudi");
		branch.setPhno(987654321);

		Branch branch1=new Branch();
		branch1.setName("Mangalore");
		branch1.setLocation("Near bus stand");
		branch1.setPhno(987774321);

		Branch branch2=new Branch();
		branch2.setName("Hubli");
		branch2.setLocation("Vidyanagar");
		branch2.setPhno(987884321);

		Branch branch3=new Branch();
		branch3.setName("Udupi");
		branch3.setLocation("kundapura");
		branch3.setPhno(987699321);

		ArrayList<Branch> list=new ArrayList<Branch>();
		list.add(branch);
		list.add(branch1);

		ArrayList<Branch> list1=new ArrayList<Branch>();
		list1.add(branch2);
		list1.add(branch3);

		hospital1.setBranches(list1);
		hospital.setBranches(list);

		branch.setHospital(hospital);
		branch1.setHospital(hospital1);
		branch2.setHospital(hospital);
		branch3.setHospital(hospital1);

		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(hospital1);
		entityTransaction.commit();


	}

}