package com.lti.agro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.agro.model.Sales;
import com.lti.agro.repo.BiddingDao;

@Component
public class BidderServiceImpl implements BiddingService {
    
	@Autowired
	BiddingDao biddingDao;
	
	public List<Sales> viewAllCropForBidding() {
		
		return biddingDao.viewAllCropForBidding();
	}

	public void placeBid(int sId, double biddingAmount) {
        	biddingDao.placeBid(sId, biddingAmount);	

	}

	public List<Sales> viewAllBidsOfBidder(int bId) {
		
		return biddingDao.viewAllBidsOfBidder(bId);
	}

	public int addOrUpdateSales(Sales sales) {
		
		return biddingDao.addOrUpdateSales(sales);
	}

	public List<Sales> viewAllSalesHistory() {
		return biddingDao.viewAllSalesHistory();
	}

	public List<Sales> viewAllMarketPlace() {
		return biddingDao.viewAllSalesHistory();
	}

}

