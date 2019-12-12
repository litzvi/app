/**
 * 
 */
package com.weberp.app.dataobjects;

import com.google.gson.Gson;

/**
 * @author Zvi
 *
 */
public class Company {

	private int companyID;	
	private Contact contactInfo;	
	private ContactPerson[] contacts;
	private Gson legelInfo;
	private Account[] accounts;
	/**
	 * @return the companyID
	 */
	public int getCompanyID() {
		return companyID;
	}
	/**
	 * @param companyID the companyID to set
	 */
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	/**
	 * @return the contactInfo
	 */
	public Contact getContactInfo() {
		return contactInfo;
	}
	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(Contact contactInfo) {
		this.contactInfo = contactInfo;
	}
	/**
	 * @return the contacts
	 */
	public ContactPerson[] getContacts() {
		return contacts;
	}
	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(ContactPerson[] contacts) {
		this.contacts = contacts;
	}
	/**
	 * @return the legelInfo
	 */
	public Gson getLegelInfo() {
		return legelInfo;
	}
	/**
	 * @param legelInfo the legelInfo to set
	 */
	public void setLegelInfo(Gson legelInfo) {
		this.legelInfo = legelInfo;
	}
	/**
	 * @return the accounts
	 */
	public Account[] getAccounts() {
		return accounts;
	}
	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	
}
