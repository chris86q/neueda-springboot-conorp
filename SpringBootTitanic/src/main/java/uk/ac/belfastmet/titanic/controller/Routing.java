package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;
import uk.ac.belfastmet.titanic.service.PassengerService;

@Controller
@RequestMapping("")
public class Routing {
	private PassengerService passengerService;
	
	Routing(PassengerRepository passengerRepository) {
		super();
		passengerService = new PassengerService(passengerRepository);
	}
	
	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Titanic");
		
		return "index.html";
	}
	
	@GetMapping("/passengers")
	public String passengers(@RequestParam("search") String search, @RequestParam("category") String category, Model model) {
		model.addAttribute("pageTitle", "Passengers");
		
		switch(category) {
			case "All": model.addAttribute("passengers", passengerService.getPassengers()); break;
			case "ID": model.addAttribute("passengers", passengerService.getPassengerById(Integer.parseInt(search))); break;
			case "Name": model.addAttribute("passengers", passengerService.getPassengerByName(search)); break;
			case "Age": model.addAttribute("passengers", passengerService.getPassengerByAge(search)); break;
			case "Survived": model.addAttribute("passengers", passengerService.getPassengerBySurvived(search)); break;
			case "Tags": model.addAttribute("passengers", passengerService.getPassengerByTags(search)); break;
		}
		
		return "passengers";
	}
	
	@GetMapping("/profile/{passengerId}")
	public String profile(@PathVariable("passengerId") String id, Model model) {
		model.addAttribute("pageTitle", "Profile");
		model.addAttribute("passenger", passengerService.getPassengerById(Integer.parseInt(id)));
		
		return "profile";
	}
	
	@GetMapping("/delete/{passengerId}")
	public String delete(@PathVariable("passengerId") int id, Model model, RedirectAttributes redirectAttributes) {
		passengerService.deletePassengerById(id);
		redirectAttributes.addFlashAttribute("Flash", "Passenger Deleted");
		
		return "redirect:/passengers?category=All&search=";
	}

}
