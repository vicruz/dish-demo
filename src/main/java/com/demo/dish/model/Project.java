package com.demo.dish.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Entidad de la tabla PROJECT
 * @author Victor Cruz
 *
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="PROJECT")
public class Project implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4113738896193458266L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROJECT_ID")
	private Long projectId;
	
	@Column(name = "PROJECT_NAME")
	private String projectName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "START_DATE")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name = "PROJECT_MANAGER")
	private String projectManager;
	
	@Column(name = "PROJECT_DESCRIPTION")
	private String projectDescription;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "PROJECT_TECHNOLOGY", joinColumns = { @JoinColumn(name = "PROJECT_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "TECHNOLOGY_ID") })
	private List<Technology> technologies;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "PROJECT_DEVELOPER", joinColumns = { @JoinColumn(name = "PROJECT_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "DEVELOPER_ID") })
	private List<Developer> developers;

}
