package uk.ac.belfastmet.titanic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@RestController
@RequestMapping("")
public class Routing {
	private PassengerRepository passengerRepository;
	
	Routing(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("passengers")
	public ArrayList<Passenger> getAllPassengers() {
//		Map<String, Object> passengers = new HashMap<>();
//		passengers.put("allPassengers", value)
		ArrayList<Passenger> passengers = (ArrayList<Passenger>) this.passengerRepository.findAll();
		return passengers;
	}
	
	@GetMapping("passengers/{passengerId}")
	public Passenger getPassengerById(@PathVariable("passengerId") Integer passengerId) {
		
		return this.passengerRepository.findByPassengerId(passengerId);
	}
	
	@DeleteMapping("passengers/{passengerId}")
	public String deletePassengerById(@PathVariable("passengerId") Integer passengerId) {
		this.passengerRepository.deleteById(passengerId);
		return "{'Removed Passenger with ID': " + "passengerId}";
	}
	
	@PostMapping("passengers")
	public Passenger addPassenger(@RequestBody Passenger passenger) {
		
		return this.passengerRepository.save(passenger);
	}

}
