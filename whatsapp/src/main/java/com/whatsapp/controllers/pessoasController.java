package com.whatsapp.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.whatsapp.services.pessoas_Service;
import com.whatsapp.models.Pessoas;

@RestController
public class pessoasController {

	@Autowired
	private pessoas_Service servico01;

	@RequestMapping(value="listarpessoas", method = RequestMethod.GET)
	@ResponseBody
	public List<Pessoas> listarpessoas(){
		List<Pessoas> pessoas;
		pessoas=servico01.retornar_todos();
		return pessoas;
	}


	@RequestMapping(value="listarpessoasemail", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Pessoas> listarpessoasemail(@RequestBody Pessoas pessoa){
		List<Pessoas> pessoas;
		System.out.println(pessoa.getEMAIL());
		System.out.println(pessoa.getSENHA());
		pessoas=servico01.retornar_por_email(pessoa.getEMAIL(),pessoa.getSENHA());
		return pessoas;
	}

}