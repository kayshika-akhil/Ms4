package com.mindtree.ms4service1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Collage {
	
	@Id
	private int id;
	private String name;
	private int totalNoStudent;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalNoStudent() {
		return totalNoStudent;
	}
	public void setTotalNoStudent(int totalNoStudent) {
		this.totalNoStudent = totalNoStudent;
	}
	public Collage(int id, String name, int totalNoStudent) {
		super();
		this.id = id;
		this.name = name;
		this.totalNoStudent = totalNoStudent;
	}
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
