package com.henriquefdias.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquefdias.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
