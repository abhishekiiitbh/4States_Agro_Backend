package com.lti.agro.sales.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.agro.controller.BiddingController;
import com.lti.agro.model.Bidder;
import com.lti.agro.model.Sales;

import com.lti.agro.repo.BidderDaoImpl;
import com.lti.agro.repo.BiddingDao;
import com.lti.agro.repo.SalesDaoImpl;

public class BiddingTest {

	// BidderDao dao=new BidderDao();

	/*@Test
	public void addSales() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BiddingController controller = (BiddingController) context.getBean(BiddingController.class);
		BidderDaoImpl dao=context.getBean(BidderDaoImpl.class);
		Sales s = new Sales();
		Bidder bidder=dao.findBidderById(1022);
		s.setCropName("Barley");
		s.setCropType("Rabi");
		s.setQuantity(50);
		s.setSoilPhCertificate(true);
		s.setFertilizer("NPK");
		s.setStatus(false);
		s.setSold(false);
		s.setBasePrice(9000.00);
		s.setBiddingAmount(0.00);
		s.setDate(LocalDate.of(2019, 05, 31));
		s.setBidder(bidder);

		int r = controller.addOrUpdateSales(s);
		System.out.println(r + "Added");

	}*/

	@Test
	public void viewAllSalesForBidding() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BiddingController controller = (BiddingController) context.getBean(BiddingController.class);
		List<Sales> sales = controller.viewAllCropForBidding();
		System.out.println(sales);
		// return sales;
	}

	@Test
	public void placeBid() {
		Sales s=new Sales();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BiddingController bidcontroller = (BiddingController) context.getBean(BiddingController.class);
		SalesDaoImpl salesdao=context.getBean(SalesDaoImpl.class);
		
		BidderDaoImpl bidderdao=context.getBean(BidderDaoImpl.class);
		Sales sales=salesdao.findSalesById(3008);
		double inputBidAmount=4000.00;
		if(sales.getBiddingAmount()<inputBidAmount) {
			sales.setBiddingAmount(inputBidAmount);
			Bidder bidder=bidderdao.findBidderById(1022);
			sales.setBidder(bidder);
			List list=new ArrayList();
			list.add(sales);
			bidder.setSales(list);
			
			salesdao.placeASellRequest(sales);
		}
		

	}
	
	 
/*
	@Test
	public void viewBidsOfBidder() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BiddingController controller = (BiddingController) context.getBean(BiddingController.class);
		List<Sales> sales = controller.viewAllBidsOfBidder(1022);
		for(Sales sale:sales)
		{
			System.out.println(sale);
		}

	}*/

	@Test
	public void viewAllSoldHistory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BiddingController controller = (BiddingController) context.getBean(BiddingController.class);
		List<Sales> sales = controller.viewAllSalesHistory();
		System.out.println(sales);
		// return sales;
	}

	@Test
	public void viewAllMarkerPlace() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BiddingController controller = (BiddingController) context.getBean(BiddingController.class);
		List<Sales> sales = controller.viewAllMarketPlace();
		System.out.println(sales);
		// return sales;
	}

}
