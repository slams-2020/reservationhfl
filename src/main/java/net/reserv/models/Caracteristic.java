package net.reserv.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Caracteristic {

	@Id
	
	@ManyToMany
	Set<Type>Posseder;

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
