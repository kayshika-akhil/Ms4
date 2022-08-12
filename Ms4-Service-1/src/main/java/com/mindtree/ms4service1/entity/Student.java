package com.mindtree.ms4service1.entity;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private String stream;
	private int collageId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getCollageId() {
		return collageId;
	}
	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}
	public Student(int id, String name, int age, String gender, String stream, int collageId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.stream = stream;
		this.collageId = collageId;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
