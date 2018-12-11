package uk.ac.belfastmet.titanic.service;

import java.util.ArrayList;
import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;

public class PassengerService {
	private PassengerRepository passengerRepository;
	private ArrayList<Passenger> passengers;
	
	public PassengerService(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}
	
	public ArrayList<Passenger> getPassengers() {
		if(passengers == null) {
			passengers = (ArrayList<Passenger>) passengerRepository.findAll();
			System.out.println("CREATED PASSENGER CACHE");
		}

		return passengers;
	}
	
	public ArrayList<Passenger> getPassengers(boolean flag) {
		if(passengers == null || flag) {
			passengers = (ArrayList<Passenger>) passengerRepository.findAll();
			System.out.println("CREATED PASSENGER CACHE");
		}

		return passengers;
	}
	
	public Passenger getPassengerById(Integer id) {
		Passenger p = null;
		
		for(Passenger passenger : passengers) {
			if(passenger.getPassengerId() == id) {
				p = passenger;
				break;
			}
		}
		
		return p;
	}
	
	public Passenger getPassengerByName(String name) {
		Passenger p = null;
		
		for(Passenger passenger : passengers) {
			if(passenger.getName().equals(name)) {
				p = passenger;
				break;
			}
		}
		
		return p;
	}
	
	public ArrayList<Passenger> getPassengerByAge(String age) {
		ArrayList<Passenger> arr = new ArrayList<>();
		
		for(Passenger passenger : passengers) {
			if(passenger.getAge().equals(age)) {
				arr.add(passenger);
			}
		}
		
		return arr;
	}
	
	public ArrayList<Passenger> getPassengerBySex(String sex) {
		ArrayList<Passenger> arr = new ArrayList<>();
		
		for(Passenger passenger : passengers) {
			if(passenger.getSex().equals(sex)) {
				arr.add(passenger);
			}
		}
		
		return arr;
	}
	
	public ArrayList<Passenger> getPassengerBySurvived(String survived) {
		ArrayList<Passenger> arr = new ArrayList<>();
		int s = (survived.toUpperCase().equals("YES")) ? 1 : 0;
		
		for(Passenger passenger : passengers) {
			if(passenger.getSurvived() == s) {
				arr.add(passenger);
			}
		}
		
		return arr;
	}
	
	public ArrayList<Passenger> getPassengerByTags(String tags) {
		ArrayList<Passenger> pass = (ArrayList<Passenger>) passengers;
		ArrayList<Passenger> arr = new ArrayList<>(pass);
		ArrayList<Passenger> temp = new ArrayList<>();
		String[] tagsArr = tags.split(", ");
		String[] keys = new String[tagsArr.length];
		String[] values = new String[tagsArr.length];
		
		for(int x = 0; x < tagsArr.length; x++) {
			keys[x] = tagsArr[x].substring(0, tagsArr[x].indexOf(":"));
			values[x] = tagsArr[x].substring(tagsArr[x].indexOf(":") + 1);
		}
		
		for(int x = 0; x < tagsArr.length; x++) {
			switch(keys[x]) {
			case "age":
				for(Passenger p: arr) {
					if(p.getAge().equals(values[x])) {
						temp.add(p);
					}
				}
				
				arr.clear();
				arr = new ArrayList<>(temp);
				temp.clear();
				break;
			case "sex":
				for(Passenger p: arr) {
					if(p.getSex().equals(values[x])) {
						temp.add(p);
					}
				}
				
				arr.clear();
				arr = new ArrayList<>(temp);
				temp.clear();
				break;
			case "survived":
				for(Passenger p: arr) {
					if(p.getSurvived() == Integer.parseInt(values[x])) {
						temp.add(p);
					}
				}
				
				arr.clear();
				arr = new ArrayList<>(temp);
				temp.clear();
				break;
			default:
				break;
			}
		}
		
		return arr;
	}
	
	public void savePassenger(Passenger passenger) {
		passengerRepository.save(passenger);
		this.getPassengers(true);
		System.out.println("RECACHED PASSENGERS");
	}
	
	public void deletePassengerById(int id) {
		passengerRepository.deleteById(id);
		this.getPassengers(true);
		System.out.println("RECACHED PASSENGERS");
	}
	
}
