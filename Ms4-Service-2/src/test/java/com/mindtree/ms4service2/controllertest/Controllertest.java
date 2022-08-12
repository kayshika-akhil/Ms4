package com.mindtree.ms4service2.controllertest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mindtree.ms4service2.controller.StudentController;
import com.mindtree.ms4service2.entity.Student;
import com.mindtree.ms4service2.service.StudentService;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class Controllertest {
	
	@MockBean
	private StudentService studentService;
	
	@Autowired
	private MockMvc mockmvc;
	
	
	ObjectMapper mapper  = new ObjectMapper();
	
	@Test
	void saveStudentTest() throws JsonProcessingException, Exception {
		
		Student student = new Student();
		
		student.setId(1);
		student.setName("Akhil");
		student.setAge(23);
		student.setGender("Male");
		student.setStream("Science");
		student.setCollageId(1);
		
		when(studentService.saveStudent(any(Student.class))).thenReturn(student);
		
		mockmvc.perform(post("/student/save").content(mapper.writeValueAsString(student)).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
		
		
		
	}
	
	@Test
	void getOrderStudent() throws JsonProcessingException, Exception {
		
        Student student = new Student();
		
		student.setId(1);
		student.setName("Akhil");
		student.setAge(23);
		student.setGender("Male");
		student.setStream("Science");
		student.setCollageId(1);
		
        Student student1 = new Student();
		
		student.setId(2);
		student.setName("Nikhil");
		student.setAge(23);
		student.setGender("Male");
		student.setStream("Science");
		student.setCollageId(1);
		
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(student1);
		studentList.add(student);
		
		Mockito.when(studentService.orderNameAsc()).thenReturn(studentList);
		
		mockmvc.perform(get("/student/orderbyname").content(mapper.writeValueAsString(studentList)).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	
	@Test
	public void getBystudentStream() throws JsonProcessingException, Exception {
		
        Student student = new Student();
		
		student.setId(1);
		student.setName("Akhil");
		student.setAge(23);
		student.setGender("Male");
		student.setStream("Science");
		student.setCollageId(1);
		
        Student student1 = new Student();
		
		student.setId(2);
		student.setName("Nikhil");
		student.setAge(23);
		student.setGender("Male");
		student.setStream("Science");
		student.setCollageId(1);
		
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(student1);
		studentList.add(student);
		
		Mockito.when(studentService.orderNameAsc()).thenReturn(studentList);
		
		mockmvc.perform(get("/student/orderbyname").content(mapper.writeValueAsString(studentList)).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
		
	}

}
