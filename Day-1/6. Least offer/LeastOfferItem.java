package com.day1;

public class LeastOfferItem {
	
	private String itemName;
	private int itemCost;
	private int discountPercent;
	private int discountAmount;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCost() {
		return itemCost;
	}
	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	public int getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	public LeastOfferItem(String itemName, int itemCost, int discountPercent, int discountAmount) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.discountPercent = discountPercent;
		this.discountAmount = discountAmount;
	}
	

	
	

}
