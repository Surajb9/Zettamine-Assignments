package com.day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LeastOffer {

	public static void main(String[] args) {
		System.out.print("enter the number of items: ");
		Scanner scan = new Scanner(System.in);
		int listSize = scan.nextInt();
		scan.nextLine();
		System.out.println();
		List<LeastOfferItem> list = new ArrayList<>(listSize);
		
		for(int i = 0;i < listSize; i++) {
			String items = scan.nextLine();
			String [] item = items.split(",");
			String name = item[0].trim();
			int cost = Integer.parseInt(item[1].trim());
			int discount = Integer.parseInt(item[2].trim());
			int discountAmount = cost*discount/100;
			list.add(new LeastOfferItem(name,cost,discount,discountAmount));
			System.out.println();
		}
		int minDiscount = Integer.MAX_VALUE;
		String minName = "";
		for(LeastOfferItem offerItem: list) {
			if(offerItem.getDiscountAmount() <= minDiscount) {
				minDiscount = offerItem.getDiscountAmount();
				minName = offerItem.getItemName();
			}
		}
		List<String> minItemNames =  new LinkedList<>();
		minItemNames.add(minName);
		for(LeastOfferItem offerItem: list) {
			if(offerItem.getItemName()!= minName && 
					                     offerItem.getDiscountAmount() == minDiscount ) {
				minItemNames.add(offerItem.getItemName());
			}
		}
		System.out.print("Items with Minimum Discount: ");
		for(String itemName : minItemNames) {
			System.out.print(itemName +"           ");
		}
	}
}


