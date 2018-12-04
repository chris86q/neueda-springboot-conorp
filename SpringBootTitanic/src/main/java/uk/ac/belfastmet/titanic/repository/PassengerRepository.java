package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	Passenger findByPassengerId(int parseInt);

	Passenger findByName(String search);

	Iterable<Passenger> findByAge(String search);

	Iterable<Passenger> findBySurvived(int parseInt);

	Iterable<Passenger> findByAgeAndSex(String string, String string2);
	
}
