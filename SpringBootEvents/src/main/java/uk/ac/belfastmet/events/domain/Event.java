package uk.ac.belfastmet.events.domain;

import lombok.Data;

@Data
public class Event {
	private String identifier;
	private String url;
	private String title;
	private String startDate;
	private String endDate;
	private String time;
	private String venue;
	private String venueUrl;
	private String image;
	private String audience;
	private String theme;
	private String cost;
	private String content;
}
