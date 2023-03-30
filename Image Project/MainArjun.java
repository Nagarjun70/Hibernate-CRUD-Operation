package com.ty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainArjun 
{
	public static void main(String[] args) throws IOException {

		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Arjun");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Arjun arjun=new Arjun();
		arjun.setName("NAGARJUN");
		arjun.setTodayDate(new Date());
		
		FileInputStream fileInputStream=new FileInputStream("C:/Users/arjun/Desktop/Hibernate/WISHES/src/main/java/IMG_20220613_150902.jpg");
		byte[] data=new byte[fileInputStream.available()];
		fileInputStream.read(data);
		arjun.setImage(data);
		
		entityTransaction.begin();
		entityManager.persist(arjun);
		entityTransaction.commit();
		

	}
}


