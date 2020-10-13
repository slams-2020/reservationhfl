package net.reserv.models;

import javax.persistence.Id;

public class Location {

	@Id
	private int id_location;

	private String gps;
	private String address1;
	private String address2;

	public int getId_location() {
		return id_location;
	}

	public void setId_location(int id_location) {
		this.id_location = id_location;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

}
