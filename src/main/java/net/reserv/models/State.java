package net.reserv.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class State {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_state;
	private String statename;
	
	@ManyToOne
	private City city;

	public int getId_state() {
		return id_state;
	}

	public void setId_state(int id_state) {
		this.id_state = id_state;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

}
