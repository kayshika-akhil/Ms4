package com.mindtree.ms4service1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mindtree.ms4service1.entity.Collage;
import com.mindtree.ms4service1.entity.CollageDetails;
import com.mindtree.ms4service1.service.CollageService;

@RestController
@RequestMapping("/collage")
public class CollageController {
	
	@Autowired
	private CollageService collageService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@PostMapping("/save")
	public Collage saveCol(@RequestBody Collage collage) {
		return collageService.saveCollage(collage);
		
	}
	
	
	@GetMapping("/orderbyname")
	public List<Collage> getOrderNameAsc(){
		return collageService.getOrderName();
	}
	
	@GetMapping("/getall")
	public CollageDetails getStudentDetails() {
		
		CollageDetails col = new CollageDetails();
		
		//get list of collage order by name ascending order
		
		List<Collage> collage = collageService.getOrderName();
		
		col.setCollage(collage);
		
		//get list of student order by name ascending order
		
		Object[] object = restTemplate.getForObject("http://localhost:8082/student/orderbyname",Object[].class);
		List<Object> student = Arrays.asList(object);
		
		col.setStudent(student);
		
		return col;
	}

}
