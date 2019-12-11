/**
 * 
 */
package dataobjects;

import java.util.Date;

/**
 * @author isral
 *
 */
public class OrderGenral {


	private int item;
	private double quantity;
	private int unitType;
	private double price;
	private int priceType;
	private Date deliveryDate;
	private String remarks;
	
	public OrderGenral() {
		// TODO Auto-generated constructor stub
	}

	
	public OrderGenral(int item, double quantity, int unitType, double price, int priceType, Date deliveryDate,
			String remarks) {
		super();
		this.item = item;
		this.quantity = quantity;
		this.unitType = unitType;
		this.price = price;
		this.priceType = priceType;
		this.deliveryDate = deliveryDate;
		this.remarks = remarks;
	}

	

	@Override
	public String toString() {
		return "genralOrder [item=" + item + ", quantity=" + quantity + ", unitType=" + unitType + ", price=" + price
				+ ", priceType=" + priceType + ", deliveryDate=" + deliveryDate + ", remarks=" + remarks + "]";
	}


	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getUnitType() {
		return unitType;
	}

	public void setUnitType(int unitType) {
		this.unitType = unitType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPriceType() {
		return priceType;
	}

	public void setPriceType(int priceType) {
		this.priceType = priceType;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	

}
