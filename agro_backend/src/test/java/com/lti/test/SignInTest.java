package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.agro.repo.ContactUsRequestDao;
import com.lti.agro.repo.SignInDao;

public class SignInTest {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
	SignInDao dao = context.getBean(SignInDao.class);

	@Test
	public void signIn() {
		boolean check=dao.signIn("guna@lti.com", "guna@123", "Bidder");
		
		if(check)
			System.out.println("Logged In successully");
		else
			System.out.println("Login failed");
	}

}
