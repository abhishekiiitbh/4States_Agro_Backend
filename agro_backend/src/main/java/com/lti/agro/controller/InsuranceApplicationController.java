package com.lti.agro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lti.agro.model.InsuranceApplications;
import com.lti.agro.services.InsuranceApplicationService;

@Controller
public class InsuranceApplicationController {
	
	@Autowired
	InsuranceApplicationService insuranceAppService;
	
	public void  applyForInsurance(InsuranceApplications insurance) {
		
		insuranceAppService.applyForInsurance(insurance);
		
	}
	
	public InsuranceApplications findInsurnceByPolicyNo(int policyNo) {
		
		return insuranceAppService.findInsurnceByPolicyNo(policyNo);
		
	}
	public void viewAllInsuranceApplications() {
		
		insuranceAppService.viewAllInsuranceApplications();
		
	}
	public void findInsuranceByAadharNo(String aadharNo) {
		
		insuranceAppService.findInsuranceByAadharNo(aadharNo);
		
	}
	
}
