/**
 * 
 */
package dataobjects;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author isral
 *
 */
public class Contact implements Serializable {

	private Country country;
	private City city;
	private String street;
	private String[] phones;
	private String[] emails;
	private String[] faxes;
	/**
	 * 
	 */
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(Country country, City city, String street, String[] phones, String[] emails, String[] faxes) {
		super();
		this.country = country;
		this.city = city;
		this.street = street;
		this.phones = phones;
		this.emails = emails;
		this.faxes = faxes;
	}
	@Override
	public String toString() {
		return "Contact [country=" + country + ", city=" + city + ", street=" + street + ", phones="
				+ Arrays.toString(phones) + ", emails=" + Arrays.toString(emails) + ", faxes=" + Arrays.toString(faxes)
				+ "]";
	}
	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the phones
	 */
	public String[] getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setPhones(String[] phones) {
		this.phones = phones;
	}
	/**
	 * @return the emails
	 */
	public String[] getEmails() {
		return emails;
	}
	/**
	 * @param emails the emails to set
	 */
	public void setEmails(String[] emails) {
		this.emails = emails;
	}
	/**
	 * @return the faxes
	 */
	public String[] getFaxes() {
		return faxes;
	}
	/**
	 * @param faxes the faxes to set
	 */
	public void setFaxes(String[] faxes) {
		this.faxes = faxes;
	}
	
	

}
