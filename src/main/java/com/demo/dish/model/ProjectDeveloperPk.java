package com.demo.dish.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

/**
 * Llave primaria de la tabla PROJECT_DEVELOPER
 * @author Victor Cruz
 *
 */
@Embeddable
@Getter
@Setter
public class ProjectDeveloperPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2544776710096034872L;

	@Column(name = "PROJECT_ID")
	private Long projectId;
	
	@Column(name = "DEVELOPER_ID")
	private Long developerId;
}
