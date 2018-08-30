package br.com.seniorsolution.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = {"/home","/menu"})
	//@RequestMapping("/")
	public String iniciar() {
		return "home/menu";
	}
}
