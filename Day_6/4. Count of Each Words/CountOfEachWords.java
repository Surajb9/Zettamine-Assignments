package com.zettamine.uniquewords;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountOfEachWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student's Article :");
		String article = scan.nextLine();
		article = article.toLowerCase();
		String [] articleWords = article.split("[,;:.?! ]+");
		System.out.println("Number of words : "+articleWords.length);
		System.out.println();
		System.out.println("Words with the count ");
		System.out.println();
		Map<String,Integer> wordMap = new HashMap<>(); 
		for(int i = 0;i<articleWords.length;i++) {
			int count = 0;
			for(int j = 0;j < articleWords.length;j++) {
				if(articleWords[i].matches(articleWords[j])) {
					count++;
				}
			}
			wordMap.put(articleWords[i],count);
		}
		Set<String> keys = wordMap.keySet();
		for(String s : keys) {
			System.out.println(s+" :"+wordMap.get(s));
		}
     scan.close();
	}

}
