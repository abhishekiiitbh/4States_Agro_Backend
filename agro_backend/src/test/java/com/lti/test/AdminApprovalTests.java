package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.agro.repo.AdminApprovalsDaoImp;
import com.lti.agro.repo.SignInDao;

public class AdminApprovalTests {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
	AdminApprovalsDaoImp dao = context.getBean(AdminApprovalsDaoImp.class);

	@Test
	public void insuranceApplicationRequest() {
		
      boolean check=dao.insuranceApplicationRequest(9002, "434352563286797");
		
		if(check)
			System.out.println("Insurance application request approved");
		else
			System.out.println("Insurance application request not approved");
	}



@Test
public void approveClaimInsurance() {
	
	
  boolean check=dao.approveClaimInsurance(8001);
	
	if(check)
		System.out.println("Insurance claim approved");
	else
		System.out.println("Insurance claim not approved");
}



@Test
public void approveSellRequest() {
	
	
	
  boolean check=dao.approveSellRequest(3001);
	
	if(check)
		System.out.println("Sell requested approved");
	else
		System.out.println("Sell requested not approved");
}

@Test
public void FinalizeBiddingStatus() {
boolean check=dao.FinalizeBiddingStatus(3001);
	
	if(check)
		System.out.println("Auction finalised");
	else
		System.out.println("Auction not finalised");
}
}



