package net.reserv.models;

import javax.persistence.Id;

public class State {

	@Id
	private int id_state;
	private String statename;

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
