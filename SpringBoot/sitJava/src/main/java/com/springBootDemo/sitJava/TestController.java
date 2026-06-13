package com.springBootDemo.sitJava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

	@RequestMapping("/trail")
	public String firstController() {
		return ("Just for Testing...");
		
	}
}
