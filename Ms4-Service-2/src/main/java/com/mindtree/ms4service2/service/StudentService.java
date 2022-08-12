package com.mindtree.ms4service2.service;

import java.util.List;

import com.mindtree.ms4service2.entity.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	
	List<Student> getByStreamOrderByAgeDesc(String streamName);
	
	List<Student> orderNameAsc();

}
