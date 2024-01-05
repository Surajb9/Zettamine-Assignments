package com.zettamine.Sentence;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SentenceMain {

	 public static void main(String[] args) {
	        Sentence sentence = new Sentence();
	        sentence.accept();
	        HashMap<String, Integer> freq = sentence.freqWords(sentence.getSen());
	        Set<Map.Entry<String, Integer>> entrySet = freq.entrySet();
	        Iterator<Entry<String,Integer>> entrySetItr = entrySet.iterator();
	        while(entrySetItr.hasNext()) {
	        Entry<String, Integer> entry = entrySetItr.next();
	        System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	        System.out.println();

	        TreeMap<String, Integer> freqSR = sentence.freqWordsSR(sentence.getSen());
	        Set<Map.Entry<String, Integer>> treeEntrySet = freqSR.entrySet();
	        Iterator<Entry<String,Integer>> entrySetItrTree = treeEntrySet .iterator();
	        while(entrySetItrTree.hasNext()) {
	        Entry<String, Integer> entry = entrySetItrTree.next();
	        System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	        
	        System.out.println();
	        


	        TreeMap<String, Integer> freqPalin = sentence.freqPalinWords(sentence.getSen());
	        Set<Map.Entry<String, Integer>> EntrySetPalin = freqPalin.entrySet();
	        Iterator<Entry<String,Integer>> entrySetItrPalin = EntrySetPalin.iterator();
	        while(entrySetItrPalin .hasNext()) {
	        Entry<String, Integer> entry = entrySetItrPalin .next();
	        System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

}
