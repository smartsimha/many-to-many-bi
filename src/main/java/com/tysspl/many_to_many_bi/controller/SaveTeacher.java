package com.tysspl.many_to_many_bi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.many_to_many_bi.dto.Subject;
import com.tysspl.many_to_many_bi.dto.Teacher;

public class SaveTeacher {
	public static void main(String[] args) {
		Subject subject1=new Subject();
		subject1.setName("Advance Java");
		subject1.setDays(45);
		
		Subject subject2=new Subject();
		subject2.setName("Java");
		subject2.setDays(60);
		
		
		Teacher teacher1=new Teacher();
		teacher1.setName("vikas");
		teacher1.setPhoneNumber(9631245785l);
		teacher1.setAge(34);
		
		Teacher teacher2=new Teacher();
		teacher2.setName("VINOD");
		teacher2.setAge(38);
		teacher2.setPhoneNumber(7891458621l);
		
		List<Teacher> list = new ArrayList<Teacher>();
		list.add(teacher2);
		list.add(teacher1);
		
		subject1.setTeachers(list);
		subject2.setTeachers(list);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityManager.persist(teacher2);
		entityManager.persist(teacher1);
		
	}
}
