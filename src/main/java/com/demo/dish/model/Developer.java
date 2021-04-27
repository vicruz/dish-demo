package com.demo.dish.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entidad de la tabla DEVELOPER
 * @author Victor Cruz
 *
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name="DEVELOPER")
public class Developer implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -1717521527703492468L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEVELOPER_ID")
	private Long developerId;
	
	@Column(name = "DEVELOPER_NAME")
	private String developerName;
	
	@ManyToMany(mappedBy = "developers")
	private List<Project> projects;
	
}
