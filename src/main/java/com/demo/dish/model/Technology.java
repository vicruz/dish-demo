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
 * 
 * @author Victor Cruz
 *
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name="TECHNOLOGY")
public class Technology implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5703980330786434207L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TECHNOLOGY_ID")
	private Long technologyId;
	
	@Column(name = "TECHNOLOGY_NAME")
	private String technologyName;
	
	@ManyToMany(mappedBy = "technologies")
	private List<Project> projects;
	
}
