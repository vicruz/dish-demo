package com.demo.dish.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dish.model.Project;
import com.demo.dish.repository.ProjectRepository;
import com.demo.dish.service.ProjectService;

/**
 * 
 * @author Victor Cruz
 *
 */
@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public List<Project> getAll() {		
		return projectRepository.findAll();
	}

	@Override
	public Project findById(Long id) {
		return projectRepository.getOne(id);
	}

	@Override
	public void deleteById(Long id) {
		projectRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void update(Project project) {
		Project db = projectRepository.getOne(project.getProjectId());
		db.setProjectName(project.getProjectName());
		db.setProjectManager(project.getProjectManager());
		db.setStartDate(project.getStartDate());
		db.setDevelopers(project.getDevelopers());
		db.setTechnologies(project.getTechnologies());
	}

	@Transactional
	@Override
	public Project save(Project project) {
		return projectRepository.save(project); 
	}

}
