package com.staj.cruddemo.business.abstracts;

import com.staj.cruddemo.entity.concrete.Student;

public interface StudentService {
	String save(Student student);
	Student findWithId(int id);
}
