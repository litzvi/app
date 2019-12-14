/**
 * 
 */
package com.weberp.app.dataobjects;

import java.util.Date;

/**
 * @author Zvi
 *
 */
public class IdCard {
	private String idNumber;
	private Country nationality;
	private Date dateOfIssue;
	private String placeOfIssue;
	
	
	public IdCard(String idNumber, Country nationality, Date dateOfIssue, String placeOfIssue) {
		super();
		this.idNumber = idNumber;
		this.nationality = nationality;
		this.dateOfIssue = dateOfIssue;
		this.placeOfIssue = placeOfIssue;
	}
	
	


	@Override
	public String toString() {
		return "IdCard [idNumber=" + idNumber + ", nationality=" + nationality + ", dateOfIssue=" + dateOfIssue
				+ ", placeOfIssue=" + placeOfIssue + "]";
	}




	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * @return the nationality
	 */
	public Country getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(Country nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the dateOfIssue
	 */
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	/**
	 * @param dateOfIssue the dateOfIssue to set
	 */
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	/**
	 * @return the placeOfIssue
	 */
	public String getPlaceOfIssue() {
		return placeOfIssue;
	}
	/**
	 * @param placeOfIssue the placeOfIssue to set
	 */
	public void setPlaceOfIssue(String placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}
	
	
}
