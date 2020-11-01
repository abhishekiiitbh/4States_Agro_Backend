package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.agro.model.Farmer;
import com.lti.agro.repo.FarmerDaoImpl;
import com.lti.agro.repo.FarmerRegistrationDao;

public class FarmerRegistrationTest {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
	FarmerDaoImpl dao=context.getBean(FarmerDaoImpl.class);
	@Test
	public void registerAFarmer() {
		Farmer farmer=new Farmer();
		farmer.setName("Nitesh");
		farmer.setEmail("nitesh@lti.com");
		farmer.setAadhaarCardNumber("333456789012");
		farmer.setAddress("421 road");
		farmer.setArea(50);
		farmer.setCity("mohali");
		farmer.setBankAccount("1234567890");
		farmer.setBankName("HSBC");
		farmer.setCertificateNumber("Hacb9271");
		farmer.setIfscCode("UTB1731000");
		farmer.setPhoneNo("98234664552");
		farmer.setPanCardNumber("JJKS3419223");
		farmer.setPassword("nitesh@123");
		farmer.setLandAddress("balisahi , kaithakhola , lonavla");
		farmer.setLandstate("maharasta");
		farmer.setLandPincode(756171);
		farmer.setApproval("NO");
		farmer.setInsuranceapplication(null);		
		farmer.setSales(null);		
		dao.addOrUpdate(farmer);
		
	}
	
	@Test 
	public void findFarmer() {
		Farmer farmer=dao.findFarmerById(1003);
		System.out.println(farmer);
	}

	@Test
	public void findFarmerByAadhar() {
		Farmer farmer=dao.findFarmerByAadharNo("123456789012");
		System.out.println(farmer);
	}
}
