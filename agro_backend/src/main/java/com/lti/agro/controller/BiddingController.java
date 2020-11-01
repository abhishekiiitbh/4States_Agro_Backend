package com.lti.agro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.agro.model.Sales;
import com.lti.agro.services.BiddingService;

@Component
public class BiddingController {
	@Autowired
	BiddingService bidderService;

	
public int addOrUpdateSales(Sales sales) {
		
		return bidderService.addOrUpdateSales(sales);
	}

	public List<Sales> viewAllCropForBidding() {

		return bidderService.viewAllCropForBidding();
	}

	public void placeBid(int sId, double biddingAmount) {
		bidderService.placeBid(sId, biddingAmount);

	}

	public List<Sales> viewAllBidsOfBidder(int bId){

		return bidderService.viewAllBidsOfBidder(bId);
	}
	
	public List<Sales> viewAllSalesHistory() {
		return bidderService.viewAllSalesHistory();
	}

	public List<Sales> viewAllMarketPlace() {
		return bidderService.viewAllSalesHistory();
	}

}

