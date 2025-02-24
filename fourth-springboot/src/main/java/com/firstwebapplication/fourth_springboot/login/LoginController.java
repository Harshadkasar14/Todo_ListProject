package com.firstwebapplication.fourth_springboot.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	
	@RequestMapping("login-params")
	public String loginPage(@RequestParam String name , ModelMap model)
	{
		model.put("fname", name);
		System.out.println("Rquest Parameter: " + name); // Not recommended for production code
		return "login";
	}
}
