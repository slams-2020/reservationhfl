package net.reserv.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Photo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int id_photo;
	private String link;
	
	@ManyToOne
	private Product product;

	public int getId_photo() {
		return id_photo;
	}

	public void setId_photo(int id_photo) {
		this.id_photo = id_photo;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
