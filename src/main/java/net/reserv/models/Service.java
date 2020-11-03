package net.reserv.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Service {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int id_service;
	private String servicename;

	@ManyToMany(mappedBy="Service")
    private List<Reservation> serviceReservation;
	
	public int getId_service() {
		return id_service;
	}

	public void setId_service(int id_service) {
		this.id_service = id_service;
	}

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

}
