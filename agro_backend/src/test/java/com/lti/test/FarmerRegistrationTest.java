package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.agro.model.Farmer;
import com.lti.agro.repo.FarmerRegistrationDao;

public class FarmerRegistrationTest {
	
	FarmerRegistrationDao dao=new FarmerRegistrationDao();
	@Test
	public void registerAFarmer() {
		Farmer farmer=new Farmer();
		farmer.setName("Rahul");
		farmer.setEmail("rahul@lti.com");
		farmer.setAadhaarCardNumber("234454234234");
		farmer.setAddress("421 road");
		farmer.setArea(23224);
		farmer.setCity("chilika");
		farmer.setBankAccount("23423093242");
		farmer.setBankName("Axis");
		farmer.setCertificateNumber("nkj234523");
		farmer.setIfscCode("UTB1731000");
		farmer.setPhoneNo("98234234552");
		farmer.setPanCardNumber("JJKS3423223");
		farmer.setPassword("gos@178");
		farmer.setLandAddress("balisahi , kaithakhola , chandigarh");
		farmer.setLandstate("Odisha");
		farmer.setLandPincode(756171);
		farmer.setApproval("NO");
		dao.registerAFarmer(farmer);
		
	}

}
