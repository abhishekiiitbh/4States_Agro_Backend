package com.lti.agro.services;

import com.lti.agro.model.InsuranceApplications;

public interface InsuranceApplicationService {
	public void  applyForInsurance(InsuranceApplications insuranec);
	public InsuranceApplications findInsurnceByPolicyNo(int policyNo);
	public void viewAllInsuranceApplications();
	public void findInsuranceByAadharNo(String aadharNo);
}
