package com.demo.dish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.dish.model.Developer;

/**
 * Repositorio de la tabla DEVELOPER
 * @author Victor Cruz
 *
 */
@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {

}
