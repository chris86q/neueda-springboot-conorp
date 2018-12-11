package uk.ac.belfastmet.cereal.service;

import java.util.ArrayList;

import uk.ac.belfastmet.cereal.domain.Cereal;
import uk.ac.belfastmet.cereal.repository.CerealRepository;

public class CerealService {
	private CerealRepository cerealRepository;
	private ArrayList<Cereal> cereals;
	
	public CerealService(CerealRepository cerealRepository) {
		this.cerealRepository = cerealRepository;
	}
	
	public ArrayList<Cereal> getAllCereal() {
		if(cereals == null) {
			cereals = (ArrayList<Cereal>) cerealRepository.findAll();
			System.out.println("CREATED CEREAL CACHE");
		}
		System.out.println("CEREALS SIZE: " + cereals.size());
		return cereals;
	}
}
