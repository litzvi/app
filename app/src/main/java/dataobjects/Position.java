package dataobjects;

import java.io.Serializable;

public class Position implements Serializable {

	
	private String name;
	private int id;
	
	public Position() {
		// TODO Auto-generated constructor stub
	}
	
	public Position(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public Position[] getAll() {
		Position[] temp = new Position[2];
		temp[0] = new Position("mei", 1);
		temp[1] = new Position("zvi", 2);
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
