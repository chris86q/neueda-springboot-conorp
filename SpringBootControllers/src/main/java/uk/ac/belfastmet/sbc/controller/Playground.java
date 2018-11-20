package uk.ac.belfastmet.sbc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping

public class Playground {
	
	@GetMapping("/")
	public String greeting(Model model) {
		return "<img src='https://avatars1.githubusercontent.com/u/10810594?s=400&u=e08939529fd8f91154d2d816a4d9b21df63b754f&v=4'>";
	}
	
	@GetMapping("/bingo")
	public String bingo(Model model) {
		return "Was his name-o";
	}
	
	@GetMapping("/belfast")
	public String belfast(Model model) {
		return "Leading the city to work";
	}
}
