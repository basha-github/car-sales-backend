package com.deltax.car.sales.model;

public class SalesDashBoardIndex {
	
	
	private int totalSales;
	private int newSales;
	private int interestedSales;
	private int notSales;
	public SalesDashBoardIndex() {
		super();
	}
	public SalesDashBoardIndex(int totalSales, int newSales, int interestedSales, int notSales) {
		super();
		this.totalSales = totalSales;
		this.newSales = newSales;
		this.interestedSales = interestedSales;
		this.notSales = notSales;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	public int getNewSales() {
		return newSales;
	}
	public void setNewSales(int newSales) {
		this.newSales = newSales;
	}
	public int getInterestedSales() {
		return interestedSales;
	}
	public void setInterestedSales(int interestedSales) {
		this.interestedSales = interestedSales;
	}
	public int getNotSales() {
		return notSales;
	}
	public void setNotSales(int notSales) {
		this.notSales = notSales;
	}
	
	
	

}
