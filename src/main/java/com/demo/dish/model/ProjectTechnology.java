package com.demo.dish.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de la tabla PROJECT_TECHNOLOGY
 * @author Victor Cruz
 *
 */
@Entity
@Table(name="PROJECT_TECHNOLOGY")
@Getter
@Setter
public class ProjectTechnology implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3726316034407877169L;
	@EmbeddedId
	private ProjectTechnologyPk id;
}
