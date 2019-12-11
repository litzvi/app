package dataobjects;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class Country implements Serializable{

	private String name;
	private int id;
	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Country(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public Country[] getAll() {
		Country[] temp = new Country[2];
		temp[0] = new Country("Vietnam", 1);
		temp[1] = new Country("israel", 2);
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


	

}
