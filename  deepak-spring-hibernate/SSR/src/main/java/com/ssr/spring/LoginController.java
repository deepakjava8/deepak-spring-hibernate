package com.ssr.spring;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class LoginController {

	@RequestMapping(value="/login")
	public String showLoginForm(Map map){
		User user=new User();
		map.put("userCommand", user);
		System.out.println("showLoginForm()");
		return "login";
	}
}
