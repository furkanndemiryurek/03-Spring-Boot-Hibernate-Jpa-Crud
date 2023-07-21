package com.staj.cruddemo.dataaccess.abstracts;

import java.util.List;

import com.staj.cruddemo.entity.concrete.Student;

public interface StudentDAO {
	void save(Student student);
	
	Student findWithId(int id);
	
}
