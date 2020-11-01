package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.agro.model.Farmer;
import com.lti.agro.model.Sales;
import com.lti.agro.repo.FarmerDaoImpl;
import com.lti.agro.repo.SalesDaoImpl;

public class SalesRegister {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
	SalesDaoImpl dao=context.getBean(SalesDaoImpl.class);
	@Test
	public void sales() {
		FarmerDaoImpl dao1 = context.getBean(FarmerDaoImpl.class);
		//Farmer farmer=dao1.findFarmerByAadharNo("123456789012");
		Sales sale = new Sales();
		sale.setBasePrice(500d);
		sale.setBidder(null);
		sale.setBiddingAmount(1000.00);
		sale.setCropName("Paddy");	
		sale.setCropType("Khariff");
		sale.setDate(LocalDate.of(2020, 30, 10));
		sale.setFarmer(null);
		sale.setFertilizer("ABC");
		sale.setQuantity(70);
		sale.setSoilPhCertificate(false);
		sale.setSold(false);
		sale.setStatus(false);
		sale.setSalesId(3007);
		List<Sales> sales =new ArrayList<Sales>();
		sales.add(sale);
		//farmer.setSales(sales);
		dao.placeASellRequest(sale);
	}

}
