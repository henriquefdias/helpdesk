package com.henriquefdias.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquefdias.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
