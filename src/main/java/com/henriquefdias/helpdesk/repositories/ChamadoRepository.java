package com.henriquefdias.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquefdias.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
