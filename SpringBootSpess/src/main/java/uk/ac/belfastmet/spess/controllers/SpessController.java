package uk.ac.belfastmet.spess.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SpessController {

	@GetMapping("")
	public String spess(Model model) {
		
//		ArrayList<Dwarf> dwarfs = new ArrayList<>();
//		dwarfs = new DwarfService().getDisneyDwarfs();
//			
//		model.addAttribute("pageTitle", "Disney");
//		model.addAttribute("disneyDwarfs", dwarfs);
		
		return "index.html";
	}
}