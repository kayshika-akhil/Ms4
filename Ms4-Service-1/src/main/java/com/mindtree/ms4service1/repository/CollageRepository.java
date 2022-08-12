package com.mindtree.ms4service1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.ms4service1.entity.Collage;

public interface CollageRepository  extends JpaRepository<Collage,Integer>{
	
	@Query("Select c from Collage as c order by c.name asc")
	List<Collage> getOrderByNameAsc();

}
