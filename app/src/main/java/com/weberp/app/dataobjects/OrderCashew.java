package com.weberp.app.dataobjects;

import java.io.Serializable;
import java.util.Date;

public class OrderCashew implements Serializable {

	/**
	 * 
	 */
	private int item;
	private double weight;
	private int weightType;
	private double price;
	private int priceType;
	private Date deliveryDate;
	
	public OrderCashew() {
		// TODO Auto-generated constructor stub
	}

	
	public OrderCashew(int item, double weight, int weightType, double price, int priceType, Date deliveryDate) {
		super();
		this.item = item;
		this.weight = weight;
		this.weightType = weightType;
		this.price = price;
		this.priceType = priceType;
		this.deliveryDate = deliveryDate;
	}

	

	@Override
	public String toString() {
		return "cashewOrder [item=" + item + ", weight=" + weight + ", weightType=" + weightType + ", price=" + price
				+ ", priceType=" + priceType + ", deliveryDate=" + deliveryDate + "]";
	}


	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getWeightType() {
		return weightType;
	}

	public void setWeightType(int weightType) {
		this.weightType = weightType;
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
	
}
