package net.reserv.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int id_city;
	private String cp;
	private String cityname;

	@ManyToOne
	private Location Location;
	
	public int getId_city() {
		return id_city;
	}

	public void setId_city(int id_city) {
		this.id_city = id_city;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

}
