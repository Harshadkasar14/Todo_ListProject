package com.firstwebapplication.fourth_springboot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // below class will be managed by spring for handling requests
public class SayHelloController {
	
	// say-hello => "Hello , What are you learning today?"
	
	//http://localhost:8080/say-hello
	
	@RequestMapping("say-hello")  // to map a user request to a particular method
	@ResponseBody // to return the value of method as it is (without any view)
	public String sayHello()
	{
		return "Hello , What are you learning today?";
	}
	
	
	// Redering a html page for below request
	@RequestMapping("say-hello-html")  
	@ResponseBody 
	public String sayHelloHtml()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>First Web Application Page</title>");
		sb.append("</head>");
		sb.append("<h1>First Web Page Using Spring MVC</h1>");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	//JSP
	// sayHello.jsp
	// "say-hello-jsp" => sayHello.jsp
	@RequestMapping("say-hello-jsp")  
	public String sayHelloJsp()
	{
		return "sayHello";
	}
}
