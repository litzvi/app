/**
 * 
 */
package com.weberp.app.dataobjects;

import java.util.List;

/**
 * @author Zvi
 *
 */
public class SupplierEmptyForm {
	private List<Country> countries;
	private List<City> cities;
	private List<SupplyCategory> categories;
	private List<CompanyPosition> positions;
	/**
	 * @return the countries
	 */
	public List<Country> getCountries() {
		return countries;
	}
	/**
	 * @param countries the countries to set
	 */
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	/**
	 * @return the cities
	 */
	public List<City> getCities() {
		return cities;
	}
	/**
	 * @param cities the cities to set
	 */
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	/**
	 * @return the categories
	 */
	public List<SupplyCategory> getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<SupplyCategory> categories) {
		this.categories = categories;
	}
	/**
	 * @return the positions
	 */
	public List<CompanyPosition> getPositions() {
		return positions;
	}
	/**
	 * @param positions the positions to set
	 */
	public void setPositions(List<CompanyPosition> positions) {
		this.positions = positions;
	}
	
	
}
