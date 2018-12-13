package uk.ac.belfastmet.titanic.service;

import java.util.ArrayList;

import uk.ac.belfastmet.titanic.domain.Passenger;

public interface PassengerService {

	public ArrayList<Passenger> list();
	public Passenger get(Integer passengerId);
	public Passenger add(Passenger passenger);
	public Passenger update(Passenger passenger);
	public void delete(Integer passenegrId);
}
