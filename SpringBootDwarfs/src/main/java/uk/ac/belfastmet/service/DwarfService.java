package uk.ac.belfastmet.service;

import java.util.ArrayList;

import uk.ac.belfastmet.dwarf.domain.Dwarf;

public class DwarfService {
	
	public ArrayList<Dwarf> getDisneyDwarfs() {
		String[] dwarfsList = {"Sleepy", "Happy", "Dopey", "Bashful", "Sneezy", "Doc", "Grumpy"};
		ArrayList<Dwarf> dwarfs = new ArrayList<>();
		
		for(String s: dwarfsList) {
			dwarfs.add(new Dwarf(s, "Disney", s+".png"));
		}
		
		return dwarfs;
	}
	
	public ArrayList<Dwarf> getTolkienDwarfs() {
		String[] dwarvesList = {"Thorin", "Balin", "Dwalin", "Fili", "Kili", "Dori", 
				"Nori", "Ori", "Oin", "Gloin", "Bifur", "Bofur", "Bombur"};
		ArrayList<Dwarf> dwarves = new ArrayList<>();
		
		for(String s: dwarvesList) {
			dwarves.add(new Dwarf(s, "Tolkien", s+".png"));
		}
		
		return dwarves; 
	}
}
