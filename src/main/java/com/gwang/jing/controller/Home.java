package com.gwang.jing.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gwang.jing.data.model.Ju;
import com.gwang.jing.service.ContextService;
@Controller
public class Home {
    @Autowired
    ContextService contextService;

    @RequestMapping(value="/welcome", produces = "text/html; charset=utf-8")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
	
	@RequestMapping(value = "/save", produces = "text/html; charset=utf-8")
	public ModelAndView save(@RequestParam("intext") String inText) {
		Ju newJu = new Ju();
		newJu.setContent(inText);
		contextService.save(newJu);
		return new ModelAndView("saved");
	}
}
