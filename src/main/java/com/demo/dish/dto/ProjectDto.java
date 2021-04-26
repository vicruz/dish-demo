package com.demo.dish.dto;


import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author Victor Cruz
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProjectDto {

	private Long id;
	private String name;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date startDate;
	
	private String projectManager;
	private String description;
	private List<String> lstTechnologies;
	private List<String> lstDevelopers;
}
