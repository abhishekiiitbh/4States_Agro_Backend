package com.lti.agro.sales.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
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

public class BiddingTest {

	// BidderDao dao=new BidderDao();

	@Test
	public void addSales() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BiddingController controller = (BiddingController) context.getBean(BiddingController.class);
		BidderDaoImpl dao=context.getBean(BidderDaoImpl.class);
		Sales s = new Sales();
		Bidder bidder=dao.findBidderById(1022);
		s.setCropName("Wheat");
		s.setCropType("Rabi");
		s.setQuantity(50);
		s.setSoilPhCertificate(true);
		s.setFertilizer("Potash");
		s.setStatus(false);
		s.setSold(false);
		s.setBasePrice(1000.00);
		s.setBiddingAmount(0.00);
		s.setDate(LocalDate.of(2019, 10, 31));
		List<Sales> sal=Arrays.asList(s);
		bidder.setSales(sal);

		int r = controller.addOrUpdateSales(s);
		System.out.println(r + "Added");

	}

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
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BiddingController controller = (BiddingController) context.getBean(BiddingController.class);
		Sales sales = new Sales();
		controller.placeBid(3004, 8000.00);

	}
	
	 //Since No bidderId,I am getting could not resolve bId property I guess..Will Do later

	/*@Test
	public void viewBidsOfBidder() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BiddingController controller = (BiddingController) context.getBean(BiddingController.class);
		List<Sales> sales = controller.viewAllBidsOfBidder(1022);
		System.out.println(sales);

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
