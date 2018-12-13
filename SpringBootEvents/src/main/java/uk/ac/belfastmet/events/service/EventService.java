package uk.ac.belfastmet.events.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.events.domain.AllEvents;

@Service
public class EventService {
	
	private RestTemplate restTemplate;
	
	public EventService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	public AllEvents getEvents() {
		AllEvents events = restTemplate.getForObject("https://neueda-flask-bndouglas.c9users.io/belfast-events/api/", AllEvents.class);
		return events;
	}
	
}
