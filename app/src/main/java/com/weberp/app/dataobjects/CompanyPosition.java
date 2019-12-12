/**
 * 
 */
package com.weberp.app.dataobjects;

/**
 * @author Zvi
 *
 */
public class CompanyPosition {
	private int id;
	private String name;
	
	public CompanyPosition() {
		
	}
	
	public CompanyPosition(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "CompanyPosition [id=" + id + ", name=" + name + "]";
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
	
	
}
