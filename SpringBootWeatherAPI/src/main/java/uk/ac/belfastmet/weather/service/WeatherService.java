package uk.ac.belfastmet.weather.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.DailyWeather;

@Service
public class WeatherService {
	
	private RestTemplate restTemplate;
	
	public WeatherService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	public DailyWeather getWeather(String location) {
		DailyWeather dailyWeather = new RestTemplate().getForObject(
			"http://codingfury.net/training/weathersample/weather.php?location=" + location, 
			DailyWeather.class
		);
		
		return dailyWeather;
	}
	
}
