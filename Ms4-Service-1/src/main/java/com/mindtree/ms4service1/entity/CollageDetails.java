package com.mindtree.ms4service1.entity;

import java.util.List;


public class CollageDetails {
	
	List<Collage> collage;
	List<Object> student;
	
	
	public List<Collage> getCollage() {
		return collage;
	}
	public void setCollage(List<Collage> collage) {
		this.collage = collage;
	}
	public List<Object> getStudent() {
		return student;
	}
	public void setStudent(List<Object> student) {
		this.student = student;
	}
	public CollageDetails(List<Collage> collage, List<Object> student) {
		super();
		this.collage = collage;
		this.student = student;
	}
	public CollageDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
