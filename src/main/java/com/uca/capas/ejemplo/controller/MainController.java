package com.uca.capas.ejemplo.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/ejemplo")
	public @ResponseBody String ejemplo() {
		String texto = "Hola Mundo desde Spring MVC! La hora actual es: ";
		return texto.concat(Calendar.getInstance().getTime().toString());
	}

}
