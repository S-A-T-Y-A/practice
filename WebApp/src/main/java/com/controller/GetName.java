package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GetName {
	@RequestMapping("/name")
	public ModelAndView name() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", "satya");
		mv.setViewName("name");
		return mv;
	}

}
