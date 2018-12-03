package uk.ac.belfastmet.dwarf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.repository.DwarfRepository;

@Controller
@RequestMapping("")
public class Routing {
	DwarfRepository dwarfRepo;
	
	Routing(DwarfRepository dwarfRepo) {
		super();
		this.dwarfRepo = dwarfRepo;
	}

	@GetMapping("")
	public String home(Model model) {
		return "index.html";
	}
	
	@GetMapping("/disney")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Disney");
		model.addAttribute("dwarfs", dwarfRepo.findByAuthor("Disney"));
		
		return "dwarf_page_card";
	}
	
	@GetMapping("/tolkien")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Tolkien");
		model.addAttribute("dwarfs", dwarfRepo.findByAuthor("Tolkien"));
		
		return "dwarf_page_card";
	}
	
	@PostMapping("/result")
	public String result(Model model, @RequestBody String s) {
		System.out.println(s);
		model.addAttribute("pageTitle", "Search Result");
		
		return "dwarf_page_card";
	}
}
