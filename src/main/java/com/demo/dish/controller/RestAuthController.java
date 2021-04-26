package com.demo.dish.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dish.dto.ProjectDto;
import com.demo.dish.model.Developer;
import com.demo.dish.model.Project;
import com.demo.dish.model.Technology;
import com.demo.dish.service.ProjectService;

/**
 * 
 * @author Victor Cruz
 *
 */
@RestController
@RequestMapping(path = "/auth")
public class RestAuthController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping(path = "/all")
	public List<ProjectDto> getAll(){
		List<Project> lst = projectService.getAll();
		List<ProjectDto> lstDto = new ArrayList<>();
		for(Project pr : lst) {
			lstDto.add(new ProjectDto(pr.getProjectId(), pr.getProjectName(), pr.getStartDate(),
					pr.getProjectName(), pr.getProjectDescription(),
					pr.getTechnologies().stream().map(Technology::getTechnologyName).collect(Collectors.toList()), 
					pr.getDevelopers().stream().map(Developer::getDeveloperName).collect(Collectors.toList())));
		}
		
		return lstDto;
	}
	
}
