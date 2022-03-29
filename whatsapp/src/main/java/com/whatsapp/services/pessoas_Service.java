package com.whatsapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.whatsapp.models.Pessoas;
import com.whatsapp.repository.pessoasRepository;

@Service
public class pessoas_Service {
	
	@Autowired
	private pessoasRepository repositorio;
	
	public List<Pessoas> retornar_todos() {			
		Pageable paginacao = PageRequest.of(0, 30, Sort.by("NOME_PESSOA").ascending());
		return repositorio.retornar_todos(paginacao);
	}

	public List<Pessoas> retornar_todos(int IDPESSOA) {			
		return repositorio.retornar_por_id(IDPESSOA);
	}


	public List<Pessoas> retornar_por_email(String email,String senha) {			
		return repositorio.retornar_por_email(email,senha);
	}

	
}