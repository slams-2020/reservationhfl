package net.reserv.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_product;
	private String type;
	private String title;
	private String description;
	private String priceProduct;

	@ManyToMany
    @JoinTable(name = "Carateristic")
    private List<Caracteristic> caracteristicProduct;
	
	@ManyToOne
	private Reservation Reservation;
	
	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(String priceProduct) {
		this.priceProduct = priceProduct;
	}

}
