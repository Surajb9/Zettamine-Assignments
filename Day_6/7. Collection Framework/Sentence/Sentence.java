package com.zettamine.Sentence;




import java.util.*;

public class Sentence {
    private String sen; 

    public String getSen() {
		return sen;
	}

	public void setSen(String sen) {
		this.sen = sen;
	}

	public Sentence()
    {} 
    Scanner scan = new Scanner(System.in);
    public void accept() {
        System.out.print("Enter a sentence: ");
        sen = scan.nextLine();
       
    }

    public HashMap<String, Integer> freqWords(String s) {
        HashMap<String, Integer> freq = new HashMap<>();
        String[] words = s.split(" ");
        for (String word : words) {
            if (freq.containsKey(word)) {
                int count = freq.get(word) + 1;
                freq.put(word, count);
            } else {
                freq.put(word, 1);
            }
        }
        return freq;
    }

    public TreeMap<String, Integer> freqWordsSR(String s) {
        TreeMap<String, Integer> freq = new TreeMap<>();
        String[] words = s.split(" ");
        for (String word : words) {
            if (freq.containsKey(word)) {
                int count = freq.get(word) + 1;
                freq.put(word, count);
            } else {
                freq.put(word, 1);
            }
        }
        return freq;
    }

    public TreeMap<String, Integer> freqPalinWords(String s) {
        TreeMap<String, Integer> freq = new TreeMap<>();
        String[] words = s.split(" ");
        for (String word : words) {
            if (isPalindrome(word)) {
                if (freq.containsKey(word)) {
                    int count = freq.get(word) + 1;
                    freq.put(word, count);
                } else {
                    freq.put(word, 1);
                }
            }
        }
        if (freq.isEmpty()) {
            freq.put("No Palindrome", 0);
        }
        return freq;
    }

    private boolean isPalindrome(String word) {
        String reverse = new StringBuffer(word).reverse().toString();
        return word.equals(reverse);
    }
   
}



