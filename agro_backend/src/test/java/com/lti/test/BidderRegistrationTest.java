package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.agro.model.Bidder;
import com.lti.agro.repo.BidderRegistrationDao;

public class BidderRegistrationTest {
	
	BidderRegistrationDao dao=new BidderRegistrationDao();
	
	@Test
	public void registerABidder() {
		Bidder bidder=new Bidder();
		bidder.setName("SHWETA");
		bidder.setEmail("human1@lti.com");
		bidder.setAadhaarCardNumber("234234234234");
		bidder.setAddress("420 road");
		bidder.setCity("mumbai");
		bidder.setBankAccount("23423093242");
		bidder.setBankName("HDFC");
		bidder.setTraderLicenseNumber("trd234231");
		bidder.setIfscCode("UTB1731000");
		bidder.setPhoneNo("98234234552");
		bidder.setPanCardNumber("JJKS3423223");
		bidder.setPassword("manav@178");
		bidder.setPincode("234523");
		bidder.setState("Maharastra");
		bidder.setApproval("YES");
		dao.registerABidder(bidder);
	}

}
