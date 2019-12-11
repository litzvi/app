/**
 * 
 */
package dataobjects;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

/**
 * @author Zvi
 *
 */
public class Supplier implements Serializable{	
	
	private String name;
	private Company company;
	private boolean isActive;
	private SupplyCategory[] categories;
	
	
	public Supplier() {
		super();
	}


	public Supplier(String name, Company company, boolean isActive, SupplyCategory[] categories) {
		super();
		this.name = name;
		this.company = company;
		this.isActive = isActive;
		this.categories = categories;
	}
	
	
	@Override
	public String toString() {
		return "Supplier [name=" + name + ", company=" + company + ", isActive=" + isActive + ", categories="
				+ Arrays.toString(categories) + "]";
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
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}
	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the categories
	 */
	public SupplyCategory[] getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(SupplyCategory[] categories) {
		this.categories = categories;
	}	
	
	
}
