/**
 * 
 */
package com.weberp.app.dataobjects;

import java.util.Arrays;

/**
 * @author Zvi
 *
 */
public class Company {

	private int companyID;	
	private Contact contactInfo;	
	private ContactPerson[] contacts;
	private LegelInfo legelInfo;
	private Account[] accounts;
	
	
	public Company(int companyID, Contact contactInfo, ContactPerson[] contacts, LegelInfo legelInfo,
			Account[] accounts) {
		super();
		this.companyID = companyID;
		this.contactInfo = contactInfo;
		this.contacts = contacts;
		this.legelInfo = legelInfo;
		this.accounts = accounts;
	}
	
	@Override
	public String toString() {
		return "Company [companyID=" + companyID + ", contactInfo=" + contactInfo + ", contacts="
				+ Arrays.toString(contacts) + ", legelInfo=" + legelInfo + ", accounts=" + Arrays.toString(accounts)
				+ "]";
	}

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
	public LegelInfo getLegelInfo() {
		return legelInfo;
	}
	/**
	 * @param legelInfo the legelInfo to set
	 */
	public void setLegelInfo(LegelInfo legelInfo) {
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
