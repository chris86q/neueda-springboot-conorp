package uk.ac.belfastmet.events.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.events.domain.AllEvents;
import uk.ac.belfastmet.events.domain.Event;
import uk.ac.belfastmet.events.service.EventService;

@Controller
@RequestMapping()
public class Router {
	
	@Autowired
	private EventService eventService;
	
	public Router(EventService eventService) {
		super();
		this.eventService = eventService;
	}


	@GetMapping("") 
	public String events(Model model) {
		ArrayList<Event> events = eventService.getEvents().getAllEvents();
		
		model.addAttribute("pageTitle", "Events");
		model.addAttribute("events", events);
		
		return "index";
	}
}
