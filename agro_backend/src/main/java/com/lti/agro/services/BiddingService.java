package com.lti.agro.services;

import java.util.List;

import com.lti.agro.model.Sales;

public interface BiddingService {
	public int addOrUpdateSales(Sales sales);
	public List<Sales> viewAllCropForBidding();
	public void placeBid(int sId,double biddingAmount);
	public List<Sales> viewAllBidsOfBidder(int bId); 
	//place sell req::
		public List<Sales> viewAllSalesHistory();
		public List<Sales> viewAllMarketPlace();

}

