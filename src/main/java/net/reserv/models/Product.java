package net.reserv.models;

import javax.persistence.Id;

public class Product {

	@Id
	private int id_product;
	private String type;
	private String title;
	private String description;
	private String priceProduct;

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
