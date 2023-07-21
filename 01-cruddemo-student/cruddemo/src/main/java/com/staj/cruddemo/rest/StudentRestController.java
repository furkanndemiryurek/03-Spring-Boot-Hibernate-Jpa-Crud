package com.staj.cruddemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.staj.cruddemo.business.concretes.StudentManager;
import com.staj.cruddemo.dataaccess.concretes.StudentDAOImp;
import com.staj.cruddemo.entity.concrete.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	StudentManager manager;
	
	@PostConstruct
	public void loadData(StudentManager manager) {
		this.manager = manager;
	}
	
	@RequestMapping("/datas")
	public Student getDatas() {
		Student student1 = manager.findWithId(1);
		return student1;
	}
}
