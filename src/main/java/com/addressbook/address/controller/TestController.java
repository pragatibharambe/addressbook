package com.addressbook.address.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class TestController {

	@RequestMapping("/index")
	public ModelAndView firstPage() {
		return new ModelAndView("index");
}
}