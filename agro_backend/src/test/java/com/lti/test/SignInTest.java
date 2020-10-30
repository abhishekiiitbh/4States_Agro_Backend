package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.dao.SignInDao;

public class SignInTest {
	
	SignInDao dao=new SignInDao();
	@Test
	public void signIn() {
		boolean check=dao.signIn("human@lti.com", "manav@1789", "Bidder");
		
		if(check)
			System.out.println("Logged In successully");
		else
			System.out.println("Login failed");
	}

}
