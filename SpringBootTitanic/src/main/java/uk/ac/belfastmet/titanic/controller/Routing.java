package uk.ac.belfastmet.titanic.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Routing {
	
	Routing() {
		super();
	}
	
	@GetMapping("")
	public String home(Model model) {
		return "index";
	}

}
