package com.gwang.jing.service;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.LinkedList;
@Service
public class TextAnalysisService {
	public List<String> tokennize(String text) {
	    List<String> result = new LinkedList<String> ();
		for (int i = 0;i < text.length();i++) {
		    result.add(String.valueOf(text.charAt(i)));
	    }
		return result;
	}
}
