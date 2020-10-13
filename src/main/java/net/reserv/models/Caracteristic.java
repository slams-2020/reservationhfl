package net.reserv.models;

import javax.persistence.Id;

public class Caracteristic {

	@Id

	private int id_caract;
	private String label;

	public int getId_caract() {
		return id_caract;
	}

	public void setId_caract(int id_caract) {
		this.id_caract = id_caract;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
