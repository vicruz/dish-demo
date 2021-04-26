package com.demo.dish.service;

import java.util.List;

import com.demo.dish.model.Project;


/**
 * 
 * @author Victor Cruz
 *
 */
public interface ProjectService {

	public List<Project> getAll();
	
	public Project findById(Long id);
	
	public void deleteById(Long id);
	
	public void update(Project project);
	
	public Project save(Project project);
}
