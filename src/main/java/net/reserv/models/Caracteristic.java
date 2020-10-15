package net.reserv.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Caracteristic {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@ManyToMany(mappedBy="Caracteristic")
    private List<Product> caracteristicProduct;

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
