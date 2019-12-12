/**
 * 
 */
package com.weberp.app.dataobjects;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;



/**
 * @author isral
 *
 */
public class Order implements Serializable {

	private int supplier;
	private String po;
	private Date contractDate;
	
	private OrderCashew[] cashew;
	private OrderGenral[] genral;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Order(int supplier, String po, Date contractDate, OrderCashew[] cashew, OrderGenral[] genral) {
		super();
		this.supplier = supplier;
		this.po = po;
		this.contractDate = contractDate;
		this.cashew = cashew;
		this.genral = genral;
	}

	

	@Override
	public String toString() {
		return "Order [supplier=" + supplier + ", po=" + po + ", contractDate=" + contractDate + ", cashew="
				+ Arrays.toString(cashew) + ", genral=" + Arrays.toString(genral) + "]";
	}


	public int getSupplier() {
		return supplier;
	}
	public void setSupplier(int supplier) {
		this.supplier = supplier;
	}
	public String getPo() {
		return po;
	}
	public void setPo(String po) {
		this.po = po;
	}
	public Date getContractDate() {
		return contractDate;
	}
	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}
	public OrderCashew[] getCashew() {
		return cashew;
	}
	public void setCashew(OrderCashew[] cashew) {
		this.cashew = cashew;
	}
	public OrderGenral[] getGenral() {
		return genral;
	}
	public void setGenral(OrderGenral[] genral) {
		this.genral = genral;
	}

}
