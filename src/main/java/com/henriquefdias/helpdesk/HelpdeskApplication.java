package com.henriquefdias.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.henriquefdias.helpdesk.domain.Chamado;
import com.henriquefdias.helpdesk.domain.Cliente;
import com.henriquefdias.helpdesk.domain.Tecnico;
import com.henriquefdias.helpdesk.domain.enums.Perfil;
import com.henriquefdias.helpdesk.domain.enums.Prioridade;
import com.henriquefdias.helpdesk.domain.enums.Status;
import com.henriquefdias.helpdesk.repositories.ChamadoRepository;
import com.henriquefdias.helpdesk.repositories.ClienteRepository;
import com.henriquefdias.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Tecnico tec1 = new Tecnico(null, "Kasino Pereira", "90187902062", "kasino@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Ednaldo Pereira", "77838911010", "ednaldo@pereira.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
