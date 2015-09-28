package com.gwang.jing.service;
import org.springframework.stereotype.Service;

import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;
import java.util.LinkedList;
@Service
public class TextAnalysisService {
	private static Set<Character> punctuationSet = Sets.newHashSet(',');
	
    public List<String> tokennize(String text) {
	    List<String> result = new LinkedList<String> ();
		for (int i = 0;i < text.length();i++) {
			Character c = text.charAt(i);
			if (!isPunctuation(c)) {
		        result.add(String.valueOf(c));
			}
	    }
		return result;
	}
	
	public boolean isPunctuation(Character c) {
		if (Character.isSpaceChar(c)) {
			return true;
		} else if (punctuationSet.contains(c)){
			return true;
		}
		
		return false;
	}
}
