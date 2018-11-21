package uk.ac.belfastmet.dwarf.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.service.DwarfService;

@Controller
@RequestMapping("/tolkien")
public class TolkienController {

	@GetMapping("")
	public String tolkien(Model model) {
		
		ArrayList<Dwarf> dwarves = new ArrayList<>();
		dwarves = new DwarfService().getTolkienDwarfs();
		
		model.addAttribute("pageTitle", "Tolkien");
		model.addAttribute("tolkienDwarfs", dwarves);
		
		return "tolkien";
	}
}