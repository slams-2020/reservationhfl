package net.reserv.models;

import javax.persistence.Id;

public class Reservation {

	@Id
	private int id_resev;
	private String price;
	private String startDate;
	private String endDate;

	public int getId_resev() {
		return id_resev;
	}

	public void setId_resev(int id_resev) {
		this.id_resev = id_resev;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
