package com.weberp.app.dataobjects;

import java.io.Serializable;

public class City implements Serializable {

	private String name;
	private int id;
	private int countryID;
	public City() {
		// TODO Auto-generated constructor stub
	}
	public City(String name, int id, int link) {
		super();
		this.name = name;
		this.id = id;
		this.countryID = countryID;
	}
	
	public City[] getAll() {
		City[] temp = new City[2];
		temp[0] = new City("mei", 1, 1);
		temp[1] = new City("zvi", 2, 2);
		return temp;
	}
	
	
	@Override
	public String toString() {
		return "City [name=" + name + ", id=" + id + "]";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the countryID
	 */
	public int getCountryID() {
		return countryID;
	}
	/**
	 * @param countryID the countryID to set
	 */
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	

}
