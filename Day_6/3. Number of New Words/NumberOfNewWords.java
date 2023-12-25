package com.zettamine.NumberOfNewWords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberOfNewWords {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student's Article :");
		String article = scan.nextLine();
		article = article.toLowerCase();
		String [] articleWords = article.split("[,;:.?! ]+");
		List<String> newWords = new ArrayList<>();
		for(String word : articleWords ) {
			if(!newWords.contains(word)) {
				newWords.add(word);
			}
		}
	    Collections.sort(newWords);
	    System.out.println();
		System.out.println("Number of words : "+articleWords.length);
		System.out.println();
		System.out.println("Number of unique words :"+newWords.size());
		System.out.println();
		System.out.println("The Words are :");
		System.out.println();
		Object words[] = newWords.toArray() ;
		for(int i = 0;i<newWords.size();i++) {
			System.out.println((i+1)+". "+words[i]);
		}
		scan.close();
		
	}


}
