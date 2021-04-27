package com.demo.dish.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

/**
 * Llave primaria de la tabla PROJECT_TECHNOLOGY
 * @author Victor Cruz
 *
 */
@Embeddable
@Getter
@Setter
public class ProjectTechnologyPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5446777182898527503L;

	@Column(name = "PROJECT_ID")
	private Long projectId;
	
	@Column(name = "TECHNOLOGY_ID")
	private Long technologyId;
}
