package com.demo.dish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.dish.model.Technology;

/**
 * Repositorio de la tabla TECHNOLOGY
 * @author Victor Cruz
 *
 */
@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {

}
