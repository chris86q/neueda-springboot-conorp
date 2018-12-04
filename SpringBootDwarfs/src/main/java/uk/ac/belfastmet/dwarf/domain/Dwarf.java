package uk.ac.belfastmet.dwarf.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dwarf {
	
	@Id
	@GeneratedValue
	private Integer dwarfId;
	private String name, author, image;

	public Dwarf() {
		super();
	}

	public Dwarf(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	}

	public Integer getId() {
		return dwarfId;
	}

	public void setId(Integer id) {
		this.dwarfId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
