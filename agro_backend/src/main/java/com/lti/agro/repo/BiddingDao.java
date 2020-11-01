package com.lti.agro.repo;
import java.util.List;

import com.lti.agro.model.Sales;

public interface BiddingDao {
	public int addOrUpdateSales(Sales sales);
	public List<Sales> viewAllCropForBidding();
	public void placeBid(int sId,double biddingAmount);
	public List<Sales> viewAllBidsOfBidder(int bId); 
	
	//place sell req::
	public List<Sales> viewAllSalesHistory();
	public List<Sales> viewAllMarketPlace();

}
