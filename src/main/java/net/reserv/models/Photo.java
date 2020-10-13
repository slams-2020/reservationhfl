package net.reserv.models;

import javax.persistence.Id;

public class Photo {

	@Id

	private int id_photo;
	private String link;

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
