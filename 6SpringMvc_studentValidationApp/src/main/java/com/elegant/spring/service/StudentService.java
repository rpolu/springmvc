package com.elegant.spring.service;

import org.springframework.stereotype.Service;

import com.elegant.spring.model.StudentModel;

@Service
public class StudentService {

	public void saveStudent(StudentModel studentModel) {
		System.out.println(" Student deatails saved");

	}

}
