package com.staj.cruddemo.dataaccess.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.staj.cruddemo.dataaccess.abstracts.StudentDAO;
import com.staj.cruddemo.entity.concrete.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDAOImp implements StudentDAO{

	EntityManager entityManager;
	
	@Autowired
	public StudentDAOImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public void save(Student student) {
		entityManager.persist(student);
	}

	@Override
	public Student findWithId(int id) {
		return entityManager.find(Student.class, id);
	}

}
