package com.mindtree.ms4service2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ms4service2.entity.Student;
import com.mindtree.ms4service2.repository.StudentRepository;
import com.mindtree.ms4service2.service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	private StudentRepository studentRepositroy;

	@Override
	public Student saveStudent(Student student) {
		return studentRepositroy.save(student);
	}

	@Override
	public List<Student> getByStreamOrderByAgeDesc(String streamName) {
		return studentRepositroy.getByStream(streamName);
	}

	@Override
	public List<Student> orderNameAsc() {
		return studentRepositroy.getOrderByNameAsc();
	}

}
