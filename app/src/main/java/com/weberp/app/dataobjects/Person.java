/**
 * 
 */
package com.weberp.app.dataobjects;


import java.util.Arrays;
import java.util.Date;

import com.google.gson.Gson;

/**
 * @author Zvi
 *
 */
public class Person {
	private int id;
	private Contact contactInfo;
	private Date dob;
	private IdCard idCard;
	private Account[] accounts;
	
	public Person(int id, Contact contactInfo, Date dob, IdCard idCard, Account[] accounts) {
		super();
		this.id = id;
		this.contactInfo = contactInfo;
		this.dob = dob;
		this.idCard = idCard;
		this.accounts = accounts;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", contactInfo=" + contactInfo + ", dob=" + dob + ", idCard=" + idCard
				+ ", accounts=" + Arrays.toString(accounts) + "]";
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
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the idCard
	 */
	public IdCard getIdCard() {
		return idCard;
	}
	/**
	 * @param idCard the idCard to set
	 */
	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
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
