package com.lti.agro.insurance.test;

import static org.junit.Assert.*;

import java.util.ResourceBundle.Control;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.lti.agro.controller.InsuranceApplicationController;
import com.lti.agro.model.Farmer;
import com.lti.agro.model.InsuranceApplications;
import com.lti.agro.repo.FarmerDaoImpl;

public class InsuranceApplicationTest {

	ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
	
	@Test
	public void applyInsurance() {
		InsuranceApplicationController controller = context.getBean(InsuranceApplicationController.class);
		FarmerDaoImpl dao=context.getBean(FarmerDaoImpl.class);
		InsuranceApplications application = new InsuranceApplications();
		Farmer farmer = dao.findFarmerById(1002);
		application.setAddress("184 6th cross Herohalli 560091");
		application.setAadhaarCardNumber("434352563286797");
		application.setCropName("Wheat");
		application.setCropType("Khariff");
		application.setFarmer(farmer);
		application.setCultivationArea(30);
		application.setEmail("abcdef@gmail.com");
		application.setYear(2020);
		application.setFarmersPrimium(27000d);
		application.setGovtsPrimium(43000d);
		application.setSumAssured(80000);
		application.setStatus(false);
		farmer.setInsuranceapplication(application);
		controller.applyForInsurance(application);
	
	}
	
	@Test
	public void findInsuranceByPolicyNo() {
		InsuranceApplicationController controller = context.getBean(InsuranceApplicationController.class);
		controller.findInsurnceByPolicyNo(9002);
	}

}
