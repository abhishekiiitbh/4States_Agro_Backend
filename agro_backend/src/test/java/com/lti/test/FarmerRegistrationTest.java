package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.agro_backend.Farmer;
import com.lti.dao.FarmerRegistrationDao;

public class FarmerRegistrationTest {
	
	FarmerRegistrationDao dao=new FarmerRegistrationDao();
	@Test
	public void registerAFarmer() {
		Farmer farmer=new Farmer();
		farmer.setName("Veeru");
		farmer.setEmail("veeru@lti.com");
		farmer.setAadhaarCardNumber("234454234234");
		farmer.setAddress("421 road");
		farmer.setArea(23224);
		farmer.setCity("mohali");
		farmer.setBankAccount("23423093242");
		farmer.setBankName("Axis");
		farmer.setCertificateNumber("nkj234523");
		farmer.setIfscCode("UTB1731000");
		farmer.setPhoneNo("98234234552");
		farmer.setPanCardNumber("JJKS3423223");
		farmer.setPassword("gos@178");
		farmer.setLandAddress("balisahi , kaithakhola , chandigarh");
		farmer.setLandstate("Punjab");
		farmer.setLandPincode(756171);
		dao.registerAFarmer(farmer);
		
	}

}
