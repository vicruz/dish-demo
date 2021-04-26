package com.demo.dish.service;

import java.util.List;

import com.demo.dish.model.Developer;

/**
 * 
 * @author Victor Cruz
 *
 */
public interface DeveloperService {

	public List<Developer> getAll();
	
	public Developer findById(Long id);
}
