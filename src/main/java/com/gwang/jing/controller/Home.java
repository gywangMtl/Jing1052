package com.gwang.jing.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gwang.jing.data.model.Ju;
import com.gwang.jing.service.ContextService;
@Controller
public class Home {
    @Autowired
    ContextService contextService;

	@RequestMapping("/welcome")
	public ModelAndView home() {
	      
        String message = "some text";	
        return new ModelAndView("zhounan", "message", message);
	}
	
	@RequestMapping("/save")
	public ModelAndView save() {
		String ju = "关关雎鸠";
		Ju newJu = new Ju();
		newJu.setContext(ju);
		contextService.save(newJu);
		return new ModelAndView("zhounan");
	}
}
