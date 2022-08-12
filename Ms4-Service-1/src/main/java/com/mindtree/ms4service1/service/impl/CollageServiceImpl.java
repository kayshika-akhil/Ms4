package com.mindtree.ms4service1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ms4service1.entity.Collage;
import com.mindtree.ms4service1.repository.CollageRepository;
import com.mindtree.ms4service1.service.CollageService;

@Service
public class CollageServiceImpl implements CollageService{
	
	@Autowired
	private CollageRepository collageRepository;

	@Override
	public Collage saveCollage(Collage collage) {
		return collageRepository.save(collage);
	}

	@Override
	public List<Collage> getOrderName() {
		return collageRepository.getOrderByNameAsc();
	}

}
