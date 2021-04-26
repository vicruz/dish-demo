package com.demo.dish.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dish.model.Technology;
import com.demo.dish.repository.TechnologyRepository;
import com.demo.dish.service.TechnologyService;

/**
 * 
 * @author Victor Cruz
 *
 */
@Service
public class TechnologyServiceImpl implements TechnologyService {

	@Autowired
	private TechnologyRepository technologyRepository;
	
	@Override
	public List<Technology> getAll() {
		return technologyRepository.findAll();
	}

	@Override
	public Technology findById(Long id) {
		return technologyRepository.getOne(id);
	}

}
