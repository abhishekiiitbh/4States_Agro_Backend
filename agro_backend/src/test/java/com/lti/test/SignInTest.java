package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.agro.repo.SignInDao;

public class SignInTest {
	
	SignInDao dao=new SignInDao();
	@Test
	public void signIn() {
		boolean check=dao.signIn("human1@lti.com", "manav@178", "Bidder");
		
		if(check)
			System.out.println("Logged In successully");
		else
			System.out.println("Login failed");
	}

}
