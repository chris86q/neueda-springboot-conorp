package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data
public class DailyWeather {
	private Location location;
	private Weather weather;
	
	@Override
	public String toString() {
		return "\n" + location.toString() + ", "
					+ weather.toString();
	}
}
