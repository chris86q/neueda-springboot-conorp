package uk.ac.belfastmet.titanic.domain;

import java.util.ArrayList;

public class AllPassengers {
	
	private ArrayList<Passenger> allPassengers;
	
	public AllPassengers() {
		super();
	}

	public AllPassengers(ArrayList<Passenger> allPassengers) {
		super();
		this.allPassengers = allPassengers;
	}
	
//	public Passenger getPassengerWithId(Integer passengerId) {
//		for(int x = 0; x < allPassengers.size(); x++) {
//			Passenger currentPassenger = allPassengers.get(x);
//			
//			if(currentPassenger.getPassengerId() == passengerId) {
//				return currentPassenger;
//			}
//		}
//		return null;
//	}

	public ArrayList<Passenger> getAllPassengers() {
		return allPassengers;
	}

	public void setAllPassengers(ArrayList<Passenger> allPassengers) {
		this.allPassengers = allPassengers;
	}
}
