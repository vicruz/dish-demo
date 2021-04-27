package com.demo.dish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.dish.model.Project;

/**
 * Repositorio de la tabla PROJECT
 * @author Victor Cruz
 *
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
