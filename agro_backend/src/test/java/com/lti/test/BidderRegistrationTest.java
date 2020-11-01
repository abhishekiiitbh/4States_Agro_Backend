package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.agro.model.Bidder;
import com.lti.agro.repo.BidderDaoImpl;
import com.lti.agro.repo.BidderRegistrationDao;

public class BidderRegistrationTest {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
	BidderDaoImpl dao=context.getBean(BidderDaoImpl.class);
	
	@Test
	public void registerABidder() {
		Bidder bidder=new Bidder();
		bidder.setName("Shweta");
		bidder.setEmail("shweta@lti.com");
		bidder.setAadhaarCardNumber("555234234234");
		bidder.setAddress("420 road");
		bidder.setCity("TAMBARAM");
		bidder.setBankAccount("234212393242");
		bidder.setBankName("HDFC");
		bidder.setTraderLicenseNumber("trd266231");
		bidder.setIfscCode("UTB1731000");
		bidder.setPhoneNo("9663439275");
		bidder.setPanCardNumber("ABCD477223");
		bidder.setPassword("shwe@123");
		bidder.setPincode("234523");
		bidder.setState("Pune");
		bidder.setApproval("YES");
		bidder.setSales(null);
		dao.addOrUpfateBidder(bidder);
	}

}
