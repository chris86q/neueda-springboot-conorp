package uk.ac.belfastmet.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.weather.service.WeatherService;

@Controller
@RequestMapping()
public class Router {
	
	@Autowired
	private WeatherService weatherService;
	
	public Router(WeatherService weatherService) {
		super();
		this.weatherService = weatherService;
	}

	@GetMapping("")
	public String home() {
		
		return "index";
	}
	
	@GetMapping("/weather/{location}") 
	public String weather(@PathVariable("location") String location, Model model) {
		model.addAttribute("pageTitle", "Weather");
		model.addAttribute("dailyWeather", weatherService.getWeather(location));
		
		return "weather";
	}
}
