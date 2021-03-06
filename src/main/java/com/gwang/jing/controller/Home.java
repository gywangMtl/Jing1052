package com.gwang.jing.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gwang.jing.data.model.Zi;
import com.gwang.jing.service.ContextService;
import com.gwang.jing.service.TextAnalysisService;

import java.util.List;

@Controller
public class Home {
    @Autowired
    ContextService contextService;

	@Autowired
	TextAnalysisService textAnalysisService;

    @RequestMapping(value="/welcome", produces = "text/html; charset=utf-8")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
	
	@RequestMapping(value = "/save", produces = "text/html; charset=utf-8")
	public ModelAndView save(@RequestParam("intext") String inText) {
	    List<String> wordList = textAnalysisService.tokennize(inText);
		for (String w:wordList) {
		    Zi newZi = new Zi();
		    newZi.setZi(w);
		    contextService.saveZi(newZi);
		}
		return new ModelAndView("saved");
	}
}
