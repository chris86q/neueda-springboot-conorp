package uk.ac.belfastmet.spess.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/random")
public class RandomController {

	@GetMapping("")
	public String random(Model model) {
		
//		ArrayList<Dwarf> dwarfs = new ArrayList<>();
//		dwarfs = new DwarfService().getDisneyDwarfs();
//			
//		model.addAttribute("pageTitle", "Disney");
//		model.addAttribute("disneyDwarfs", dwarfs);
		
		return "random.html";
	}
	
}
