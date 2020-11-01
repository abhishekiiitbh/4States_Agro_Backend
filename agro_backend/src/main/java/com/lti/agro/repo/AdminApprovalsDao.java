package com.lti.agro.repo;

import com.lti.agro.model.Bidder;
import com.lti.agro.model.Sales;

public interface AdminApprovalsDao {
	
	public int approveSellRequest(int salesId);
	public int updateOrFinalizeBiddingStatus(int salesId);
	public int insuranceApllicationRequest(int policyNo, String aadhaarCardNumber );
	public int approveClaimInsurance(int rId);

}
