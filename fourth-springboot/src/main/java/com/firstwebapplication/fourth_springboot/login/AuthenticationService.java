package com.firstwebapplication.fourth_springboot.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username , String password)
	{
		boolean isValidUsername = username.equalsIgnoreCase("Harshad");
		boolean isValidPass = password.equalsIgnoreCase("Harshad@14");
		return (isValidUsername && isValidPass);
	}
}
