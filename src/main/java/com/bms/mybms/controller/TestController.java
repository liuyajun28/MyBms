package com.bms.mybms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/test")
	//@ResponseBody
	public String test() {
		return "page/login/login";
	}
}
