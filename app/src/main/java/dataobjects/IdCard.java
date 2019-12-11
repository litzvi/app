/**
 * 
 */
package dataobjects;

import java.sql.Date;

/**
 * @author Zvi
 *
 */
public class IdCard {
	private String idNumber;
	private String nationality;
	private Date dateOfIssue;
	private String placeOfIssue;
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
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
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
