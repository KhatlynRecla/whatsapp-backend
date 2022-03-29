package com.whatsapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.whatsapp.models.Idiomas;
import com.whatsapp.repository.idiomasRepository;

@Service
public class idiomas_Service {
	
	@Autowired
	private idiomasRepository repositorio;
	
	public List<Idiomas> retornar_todos() {			
		Pageable paginacao = PageRequest.of(0, 30, Sort.by("NOME_IDIOMA").ascending());
		return repositorio.retornar_todos(paginacao);
	}
	
}
