package uk.ac.belfastmet.building.service;

import java.util.ArrayList;

import uk.ac.belfastmet.building.domain.Building;
import uk.ac.belfastmet.building.domain.BuildingVolume;

public class Top5Buildings {
	public static ArrayList<BuildingVolume> getBuildingByVolume(){
		ArrayList<BuildingVolume> buildings = new ArrayList<>();
		Building building = new Building();
		
		building = new Building(
			"Boeing Everett Factory",
			"Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.",
			"United States",
			"Everett, Washington",
			"https://upload.wikimedia.org/wikipedia/commons/b/b1/Boeing_Everett_Plant.jpg",
			"<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.763882469593!2d-122.29196358435843!3d47.921605979206795!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54900164f9502991%3A0x903b231982d227fd!2sFuture+Of+Flight+Museum!5e0!3m2!1sen!2suk!4v1542988767564\" width=\"100%\" height=\"400px\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>"
		);
		
		buildings.add(new BuildingVolume(building, "398,000", "13,300,000"));
		
		building = new Building(
			"Great Mosque of Mecca",
			"The largest mosque in the world, the most sacred place for the Muslims, and surrounds Islam's holiest place, the Kaaba.",
			"Saudi Arabia",
			"Hijaz-Saudi Arabia",
			"https://upload.wikimedia.org/wikipedia/commons/3/3f/A_packed_house_-_Flickr_-_Al_Jazeera_English.jpg",
			"<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3714.162003910481!2d39.82354601504636!3d21.42287637958231!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204b74d3fb493%3A0x55d1f94f8e094785!2sMasjid+al-Haram!5e0!3m2!1sen!2suk!4v1542989476958\" width=\"100%\" height=\"400px\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>"
		);
		
		buildings.add(new BuildingVolume(building, "356,000", "8,000,000"));
		
		building = new Building(
			"Jean-Luc Lagardère Plant",
			"The assembly hall of the Airbus A380, the world's largest airliner. ",
			"France",
			"Toulouse-Blagnac",
			"https://constructalia.arcelormittal.com/files/styles/carousel_large/public/NE_38_picture_10--8590805eff1f7a4014025fbc30f9a0d7.jpg",
			"Test map"
		);
		
		buildings.add(new BuildingVolume(building, "122,500", "5,600,000"));
		
		building = new Building(
			"Boeing Composite Wing Center",
			"Boeing's assembly site for the production of composite wings for the 777-8 and 777-9 ",
			"United States",
			"Everett, Washington",
			"https://upload.wikimedia.org/wikipedia/commons/b/b1/Boeing_Everett_Plant.jpg",
			"Test map"
		);
		
		buildings.add(new BuildingVolume(building, "111,500", "3,700,000"));
		
		building = new Building(
			"Aerium",
			"A hangar originally intended to house the construction of a giant airship, this building now houses an indoor theme park, called Tropical Islands Resort. ",
			"Germany",
			"Halbe, Brandenburg",
			"https://upload.wikimedia.org/wikipedia/commons/8/8e/S%C3%BCdsee_Tropicel_Islands.JPG",
			"Test map"
		);
		
		buildings.add(new BuildingVolume(building, "70,000", "5,200,000"));		
				
		return buildings;
	}
}
