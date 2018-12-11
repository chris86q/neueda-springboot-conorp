package uk.ac.belfastmet.cereal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.cereal.repository.CerealRepository;
import uk.ac.belfastmet.cereal.service.CerealService;

@Controller
@RequestMapping("")
public class Routing {
	private CerealService cerealService;
	
	Routing(CerealRepository cerealRepository) {
		super();
		cerealService = new CerealService(cerealRepository);
	}
	
	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Cereal");
		model.addAttribute("cereals", cerealService.getAllCereal());
		
		return "index.html";
	}
}
