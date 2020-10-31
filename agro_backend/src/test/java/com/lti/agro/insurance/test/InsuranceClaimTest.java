package com.lti.agro.insurance.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.agro.controller.InsuranceApplicationController;
import com.lti.agro.model.InsuranceApplications;
import com.lti.agro.model.InsuranceClaim;
import com.lti.agro.repo.InsuranceClaimDaoImpl;

public class InsuranceClaimTest {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
	InsuranceClaimDaoImpl dao = context.getBean(InsuranceClaimDaoImpl.class);
	
	@Test
	public void addnewClaim() {
		InsuranceApplicationController controller 
		= context.getBean(InsuranceApplicationController.class);
		InsuranceApplications aaplication = controller.findInsurnceByPolicyNo(9002);
		InsuranceClaim claim=new InsuranceClaim();
		claim.setAmountClaimed(0d);
		claim.setCauseOfClaim("Flood");
		claim.setDateOfApproval(LocalDate.of(1, 1, 1));
		claim.setDateOfClaim(LocalDate.of(2020, 10, 10));
		claim.setDateOfLoss(LocalDate.of(2020, 10, 2));
		claim.setInsuranceapplications(aaplication);
		dao.placeAClaimRequest(claim);
	}

}
