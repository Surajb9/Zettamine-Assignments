package com.zettamine.Insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class InsuranceBazaar {
	static Map<Integer,String> policy = new TreeMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of Policy names you want to store: ");
		int policyNo = scan.nextInt();
		System.out.println();
		while(policyNo!=0) {
			System.out.print("Enter the Policy ID : ");
			int policyId = scan.nextInt();
			System.out.println();
			System.out.print("Enter the Policy Name : ");
			scan.nextLine();
			String policyName = scan.nextLine();
			System.out.println();
			addPolicyDetails(policyId, policyName);
			policyNo--;
		}
		for(Map.Entry<Integer, String> entry : policy.entrySet()){
	    	 System.out.println(entry.getKey() + " : "+entry.getValue());
	     }
		System.out.println();
		System.out.print("Enter the policy type to be searched: ");
		String pType = scan.nextLine();
		System.out.println();
		if(pType.equalsIgnoreCase("Two Wheeler") || pType.equalsIgnoreCase("Health") ) {
			List<Integer> list = searchBasedOnPolicyType(pType);
			for(Integer intg : list) {
				System.out.println(intg);
				System.out.println();
			}
		}
		else {
			System.err.println("Invalid Input");
		}
		
		
		scan.close();

	}
	
	public static  void addPolicyDetails(Integer pId,String pName) {
		policy.put(pId, pName);
	}
    
	public static List<Integer> searchBasedOnPolicyType(String input){
	     List<Integer> idList = new ArrayList<>();
	     for(Map.Entry<Integer, String> entry : policy.entrySet()){
	    	 if(entry.getValue().contains(input)){
	    		 idList.add(entry.getKey());
	    	 }
	     }
	     return idList;
	     
	     
	}
}
