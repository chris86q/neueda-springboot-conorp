package uk.ac.belfastmet.titanic.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.service.PassengerServiceImpl;

@Controller
@RequestMapping("")
public class Routing {
	
	@Autowired
	private PassengerServiceImpl passengerService;
	
	Routing() {
		super();
	}
	
	Routing(PassengerServiceImpl passengerService) {
		super();
		this.passengerService = passengerService;
	}
	
	@GetMapping("")
	public String getIndex() {
		
		return "index";
	}
	
	@GetMapping("/passengers")
	public String getAllPassengers(Model model) {
		model.addAttribute("pageTitle", "Home");
		Passenger passenger = this.passengerService.list().get(0);
		System.out.println(passenger.getName());
		return "index";
	}
	
	@GetMapping("/passengers/{passengerId}")
	public String getPassengerById(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", this.passengerService.get(passengerId));
		return "passengers";
	}
	
	@GetMapping("/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Home");
		this.passengerService.delete(passengerId);
		return "redirect:/";
	}
	
	@GetMapping("/save/{passengerId}")
	public String updatePassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", this.passengerService.get(passengerId));
		return "index";
	}
	
	@GetMapping("/save")
	public String addPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", this.passengerService.get(passengerId));
		return "index";
	}
	
	@GetMapping("/profile/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", this.passengerService.get(passengerId));
		return "index";
	}
}
