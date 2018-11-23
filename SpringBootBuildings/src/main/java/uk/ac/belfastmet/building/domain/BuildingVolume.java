package uk.ac.belfastmet.building.domain;

public class BuildingVolume extends Building{
	private String floorarea;
	private String volume;
	
	public BuildingVolume(Building building, String floorarea, String volume) {
		super(
			building.getName(),
			building.getDescription(), 
			building.getCountry(), 
			building.getPlace(), 
			building.getImage(), 
			building.getMap()
		);
		
		this.floorarea = floorarea;
		this.volume = volume;
	}

	public String getFloorarea() {
		return floorarea;
	}

	public void setFloorarea(String floorarea) {
		this.floorarea = floorarea;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}
}
