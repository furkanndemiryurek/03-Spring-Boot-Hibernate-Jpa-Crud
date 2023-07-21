package com.staj.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.staj.cruddemo.business.concretes.StudentManager;
import com.staj.cruddemo.entity.concrete.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner commandLineRunner(StudentManager manager) {
		return runner -> {
			findStudentWithId(manager);
		};
	}
	
	private void saveStudent(StudentManager manager) {
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("QQQ", "WWW","XXX");
		
		System.out.println(manager.save(tempStudent));

	}
	
	private void findStudentWithId(StudentManager manager) {
		for(int i = 1; i < 6; i++) {
			System.out.println(manager.findWithId(i));
			System.out.println("---------------------");
		}
	}
	
}
