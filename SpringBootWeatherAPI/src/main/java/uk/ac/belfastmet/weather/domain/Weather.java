package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data
public class Weather {
	
	private String description;
	private String precipitaton;
	private Integer temperature;
	private String humidity;
	private Integer pressure;
	private Integer cloudcover;
	private Wind wind;
	private String image;
	
	@Override
	public String toString() {
		return "\n" + getDescription() + ", "
				+ getPrecipitaton() + ", "
				+ getTemperature() + ", "
				+ getHumidity() + ", "
				+ getPressure() + ", "
				+ getCloudcover() + ", "
				+ wind.toString() + ", "
				+ getImage();
	}

}
