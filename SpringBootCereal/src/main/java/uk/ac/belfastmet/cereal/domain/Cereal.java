package uk.ac.belfastmet.cereal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cereal {
	
	@Id
	@GeneratedValue
	private Integer cerealId;
	private String manufacturer;
	private String cereal;
	private int energy_kj;
	private int calories_kcal;
	private double protein_g;
	private double carbohydrate_g;
	private double sugars_g;
	private double fat_g;
	private double saturates_g;
	private double fiber_g;
	private String sodium_g;
	private String salt_g;
	private String iron_mg;
	
	public Cereal() { super(); }

	public Cereal(Integer cerealId, String manufacturer, String cereal, int energy_kj, int calories_kcal,
			double protein_g, double carbohydrate_g, double sugars_g, double fat_g, double saturates_g, double fibre_g,
			String sodium_g, String salt_g, String iron_mg) {
		super();
		this.cerealId = cerealId;
		this.manufacturer = manufacturer;
		this.cereal = cereal;
		this.energy_kj = energy_kj;
		this.calories_kcal = calories_kcal;
		this.protein_g = protein_g;
		this.carbohydrate_g = carbohydrate_g;
		this.sugars_g = sugars_g;
		this.fat_g = fat_g;
		this.saturates_g = saturates_g;
		this.fiber_g = fiber_g;
		this.sodium_g = sodium_g;
		this.salt_g = salt_g;
		this.iron_mg = iron_mg;
	}

	public Integer getCerealId() {
		return cerealId;
	}

	public void setCerealId(Integer cerealId) {
		this.cerealId = cerealId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCereal() {
		return cereal;
	}

	public void setCereal(String cereal) {
		this.cereal = cereal;
	}

	public int getEnergy_kj() {
		return energy_kj;
	}

	public void setEnergy_kj(int energy_kj) {
		this.energy_kj = energy_kj;
	}

	public int getCalories_kcal() {
		return calories_kcal;
	}

	public void setCalories_kcal(int calories_kcal) {
		this.calories_kcal = calories_kcal;
	}

	public double getProtein_g() {
		return protein_g;
	}

	public void setProtein_g(double protein_g) {
		this.protein_g = protein_g;
	}

	public double getCarbohydrate_g() {
		return carbohydrate_g;
	}

	public void setCarbohydrate_g(double carbohydrate_g) {
		this.carbohydrate_g = carbohydrate_g;
	}

	public double getSugars_g() {
		return sugars_g;
	}

	public void setSugars_g(double sugars_g) {
		this.sugars_g = sugars_g;
	}

	public double getFat_g() {
		return fat_g;
	}

	public void setFat_g(double fat_g) {
		this.fat_g = fat_g;
	}

	public double getSaturates_g() {
		return saturates_g;
	}

	public void setSaturates_g(double saturates_g) {
		this.saturates_g = saturates_g;
	}

	public double getFiber_g() {
		return fiber_g;
	}

	public void setFiber_g(double fiber_g) {
		this.fiber_g = fiber_g;
	}

	public String getSodium_g() {
		return sodium_g;
	}

	public void setSodium_g(String sodium_g) {
		this.sodium_g = sodium_g;
	}

	public String getSalt_g() {
		return salt_g;
	}

	public void setSalt_g(String salt_g) {
		this.salt_g = salt_g;
	}

	public String getIron_mg() {
		return iron_mg;
	}

	public void setIron_mg(String iron_mg) {
		this.iron_mg = iron_mg;
	}
}
