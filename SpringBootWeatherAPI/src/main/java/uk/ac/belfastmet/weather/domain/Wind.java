package uk.ac.belfastmet.weather.domain;
import lombok.Data;

@Data
public class Wind {
	private Integer speed;
	private String direction;
	
	@Override
	public String toString() {
		return "\n" + getSpeed() + ", "
				+ getDirection();
	}
}
