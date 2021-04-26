package com.demo.dish.service;

import java.util.List;

import com.demo.dish.model.Technology;


/**
 * 
 * @author Victor Cruz
 *
 */
public interface TechnologyService {

	public List<Technology> getAll();
	
	public Technology findById(Long id);
}
