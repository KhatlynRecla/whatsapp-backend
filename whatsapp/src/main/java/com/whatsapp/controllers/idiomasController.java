package com.whatsapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.whatsapp.services.idiomas_Service;
import com.whatsapp.models.Idiomas;

@Controller
public class idiomasController {

	@Autowired
	private idiomas_Service servico01;

	@RequestMapping(value={"listaridiomas"}, method = RequestMethod.GET)
	@ResponseBody
	public List<Idiomas> listaridiomas(){
		List<Idiomas> idiomas;
		idiomas=servico01.retornar_todos();
		return idiomas;
	}
}