package com.lti.agro.repo;

import java.util.List;

import com.lti.agro.model.InsuranceApplications;

public interface InsuranceApplicationDao {
	
	public int ApplyForInsurance(InsuranceApplications insurance);
	public InsuranceApplications findInsurnaceByPolicyNo(int insuranceId);
	public InsuranceApplications findInsuranceByAadhar(String aadharNo);
	public List<InsuranceApplications> viewAllInsuranceApplications();
	
}
