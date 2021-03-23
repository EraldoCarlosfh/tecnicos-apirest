package com.tecnicos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnicos.demo.models.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
	
	Tecnico findById(long id);

}
