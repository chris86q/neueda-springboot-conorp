package uk.ac.belfastmet.dwarf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.dwarf.repository.DwarfRepository;

@Controller
@RequestMapping("")
public class Routing {
	DwarfRepository dwarfRepository;
	
	Routing(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("")
	public String home(Model model) {
		return "index.html";
	}
	
	@GetMapping("/disney")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Disney");
		model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Disney"));
		
		return "dwarf_page_card";
	}
	
	@GetMapping("/tolkien")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Tolkien");
		model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Tolkien"));
		
		return "dwarf_page_card";
	}
	
	@GetMapping("/result")
	public String result(@RequestParam("search") String search, @RequestParam("category") String category, Model model) {
		model.addAttribute("pageTitle", "Search Result");
		
		switch(category) {
			case "ID": model.addAttribute("dwarfs", dwarfRepository.findByDwarfId(Integer.parseInt(search))); break;
			case "Name": model.addAttribute("dwarfs", dwarfRepository.findByName(search)); break;
			case "Author": model.addAttribute("dwarfs", dwarfRepository.findByAuthor(search)); break;
		}
		
		return "dwarf_page_card";
	}
}
