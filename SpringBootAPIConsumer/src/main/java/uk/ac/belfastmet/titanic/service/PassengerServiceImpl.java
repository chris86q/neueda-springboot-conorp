package uk.ac.belfastmet.titanic.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.titanic.domain.AllPassengers;
import uk.ac.belfastmet.titanic.domain.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService{

	@Value("${api.passenger.url}")
	private String passengerURL;
	private RestTemplate restTemplate;
	
	public PassengerServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@Override
	public ArrayList<Passenger> list() {
		AllPassengers allPassengers = this.restTemplate.getForObject("http://localhost:8090/passengers", AllPassengers.class);
		return allPassengers.getAllPassengers();
	}

	@Override
	public Passenger get(Integer passengerId) {
		Passenger passenger = this.restTemplate.getForObject(passengerURL + "/passengers/" + passengerId, Passenger.class);
		return passenger;
	}

	@Override
	public Passenger add(Passenger passenger) {return null;}

	@Override
	public Passenger update(Passenger passenger) {return null;}

	@Override
	public void delete(Integer passengerId) {
		this.restTemplate.delete(passengerURL + "/passengers/" + passengerId);
	}
}
