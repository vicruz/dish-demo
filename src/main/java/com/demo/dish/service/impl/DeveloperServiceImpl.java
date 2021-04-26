package com.demo.dish.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dish.model.Developer;
import com.demo.dish.repository.DeveloperRepository;
import com.demo.dish.service.DeveloperService;

/**
 * 
 * @author Victor Cruz
 *
 */
@Service
public class DeveloperServiceImpl implements DeveloperService {

	@Autowired
	private DeveloperRepository developerRepository;
	
	@Override
	public List<Developer> getAll() {
		return developerRepository.findAll();
	}

	@Override
	public Developer findById(Long id) {
		return developerRepository.getOne(id);
	}

}
