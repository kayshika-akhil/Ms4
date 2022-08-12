package com.mindtree.ms4service2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ms4service2.entity.Student;
import com.mindtree.ms4service2.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/save")
	public Student saveStud(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	
	@GetMapping("/getbystream/{streamName}")
	public List<Student> getByStream(@PathVariable String streamName){
		return studentService.getByStreamOrderByAgeDesc(streamName);
	}
	
	@GetMapping("/orderbyname")
	public List<Student> getByNameAsc(){
		return studentService.orderNameAsc();
	}

}
