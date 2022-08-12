package com.mindtree.ms4service2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.ms4service2.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	@Query("select s from Student s where stream = ?1 order by s.age desc")
	List<Student> getByStream(String streamName);
	
	@Query("select s from Student s order by s.name asc")
	List<Student> getOrderByNameAsc();

}
