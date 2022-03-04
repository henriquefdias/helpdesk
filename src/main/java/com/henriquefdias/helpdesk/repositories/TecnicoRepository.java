package com.henriquefdias.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquefdias.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
