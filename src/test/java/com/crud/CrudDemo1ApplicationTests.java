package com.crud;

import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crud.repository.StudentRepository;

@SpringBootTest
class CrudDemo1ApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveStudentInfo() {
	  System.out.println(studentRepo);
	}

}
