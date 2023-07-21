package com.staj.cruddemo.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staj.cruddemo.business.abstracts.StudentService;
import com.staj.cruddemo.dataaccess.abstracts.StudentDAO;
import com.staj.cruddemo.entity.concrete.Student;

@Service
public class StudentManager implements StudentService{
	
	StudentDAO studentDao;
	
	@Autowired
	public StudentManager(StudentDAO studentDao) {
		super();
		this.studentDao = studentDao;
	}


	public String save(Student student) {
		if(!student.getLastName().isEmpty()) {
			studentDao.save(student);
			return "Öğrenci kaydı başarılı. Öğrenci ID -> " + student.getId();
		}else {
			return "Soy isim boş olamaz.";
		}
	}


	@Override
	public Student findWithId(int id) {
		return studentDao.findWithId(id);
	}

}
