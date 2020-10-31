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
		bidder.setName("Sanya");
		bidder.setEmail("human@lti.com");
		bidder.setAadhaarCardNumber("234234234234");
		bidder.setAddress("420 road");
		bidder.setCity("mumbai");
		bidder.setBankAccount("234212393242");
		bidder.setBankName("HDFC");
		bidder.setTraderLicenseNumber("trd234231");
		bidder.setIfscCode("UTB1731000");
		bidder.setPhoneNo("9663439275");
		bidder.setPanCardNumber("ABCD423223");
		bidder.setPassword("Sanya@123");
		bidder.setPincode("234523");
		bidder.setState("Maharastra");
		bidder.setApproval("YES");
		bidder.setSales(null);
		dao.addOrUpfateBidder(bidder);
	}

}
