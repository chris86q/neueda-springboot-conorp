package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("")
public class Routing {
	PassengerRepository passengerRepository;
	
	Routing(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Titanic");
		
		return "index.html";
	}
	
	@GetMapping("/passengers")
	public String passengers(Model model) {
		model.addAttribute("pageTitle", "Passenegrs");
		model.addAttribute("passengers", passengerRepository.findAll());
		
		return "passengers";
	}
	
	public String passengers(@RequestParam("search") String search, @RequestParam("category") String category, Model model) {
		model.addAttribute("pageTitle", "Passenegrs");
		if(search.equals(null) || category.equals(null))
			model.addAttribute("passengers", passengerRepository.findAll());
		
		switch(category) {
			case "ID": model.addAttribute("passengers", passengerRepository.findByPassengerId(Integer.parseInt(search))); break;
			case "Name": model.addAttribute("passengers", passengerRepository.findByName(search)); break;
			case "Age": model.addAttribute("passengers", passengerRepository.findByAge(search)); break;
			case "Survived": model.addAttribute("passengers", passengerRepository.findBySurvived(Integer.parseInt(search))); break;
		}
		
		return "passengers";
	}

}
