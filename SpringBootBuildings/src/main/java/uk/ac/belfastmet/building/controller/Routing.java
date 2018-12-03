package uk.ac.belfastmet.building.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.building.domain.Building;
import uk.ac.belfastmet.building.domain.BuildingVolume;
import uk.ac.belfastmet.building.service.Top5Buildings;

@Controller
@RequestMapping
public class Routing {
	
	@GetMapping("/")
	String root(Model model) {
		model.addAttribute("jumbotronHeader", "Worlds Largest Building");
		model.addAttribute("domTitle", "Home");
		
		return "index.html";
	}
	
	@GetMapping("/volume")
	String volume(Model model) {
		model.addAttribute("buildings", Top5Buildings.getBuildingByVolume());
		model.addAttribute("jumbotronHeader", "Worlds Most Volumous Building");
		model.addAttribute("domTitle", "Volume");
		
		return "volume.html";
	}
	
	@GetMapping("/footprint")
	String footprint(Model model) {
		model.addAttribute("jumbotronHeader", "Worlds Most Footy Building");
		model.addAttribute("domTitle", "Footprint");
		
		return "footprint.html";
	}
	
	@GetMapping("/floorarea")
	String floorarea(Model model) {
		model.addAttribute("jumbotronHeader", "Worlds Most Floory Building");
		model.addAttribute("domTitle", "Floorarea");
		
		return "floorarea.html";
	}
	
}
