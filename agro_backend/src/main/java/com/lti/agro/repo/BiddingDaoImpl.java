package com.lti.agro.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;


import org.springframework.stereotype.Component;

import com.lti.agro.model.Sales;
@Component
public class BiddingDaoImpl implements BiddingDao {
     
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public int addOrUpdateSales(Sales sales) {
		Sales persistedSales=em.merge(sales);
		return persistedSales.getSalesId();
	}
	
	@Transactional
	public List<Sales> viewAllSalesHistory() {
		String jpql="select  s from Sales s where s.sold=1";
		TypedQuery<Sales> query=em.createQuery(jpql, Sales.class);
		return query.getResultList();
	}
	//marketplace: status:true
	@Transactional
	public List<Sales> viewAllMarketPlace() {
		String jpql="select  s from Sales s where s.status=1";
		TypedQuery<Sales> query=em.createQuery(jpql, Sales.class);
		return query.getResultList();
	}
	
	
	@Transactional
	public List<Sales> viewAllCropForBidding() { //This function helps Bidders  to View crops Available..If not needed will remove
		String jpql="select  s from Sales s";
		TypedQuery<Sales> query=em.createQuery(jpql, Sales.class);
		return query.getResultList();
	}

	@Transactional
	public void placeBid(int salesId, double biddingAmount) {
		Sales sales=em.find(Sales.class, salesId);
        if(!sales.getSold() && biddingAmount>sales.getBiddingAmount()) {
        	
			Query query= em.createQuery("update Sales s set s.biddingAmount = :bidAmt" + " where s.salesId = :sId");
			query.setParameter("bidAmt", biddingAmount);
			query.setParameter("sId", salesId);
		       query.executeUpdate();
			int result = query.executeUpdate();
			System.out.println("You made the bid Sucessfully!!Please wait for Approval!!");
        }
        else {
        	System.out.println("You are not allowed to Bid!!Your bid value is less than BasePrice");
        }
	}
	
	
	@Transactional
	public List<Sales> viewAllBidsOfBidder(int bId) {
		String jpql="Select s from Sales s where s.bId=:bidderId";
		TypedQuery<Sales> query = em.createQuery(jpql, Sales.class);
		query.setParameter("bidderId", bId);
		int result=query.executeUpdate();
		return query.getResultList();
		

	}

	
	

}
