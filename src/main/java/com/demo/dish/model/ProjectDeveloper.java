package com.demo.dish.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de la tabla PROJECT_DEVELOPER
 * @author Victor Cruz
 *
 */
@Entity
@Table(name="PROJECT_DEVELOPER")
@Getter
@Setter
public class ProjectDeveloper implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3726316034407877159L;
	@EmbeddedId
	private ProjectDeveloperPk id;
}
