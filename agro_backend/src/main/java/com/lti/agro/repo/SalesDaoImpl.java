package com.lti.agro.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.agro.model.Sales;


@Repository
public class SalesDaoImpl {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void placeASellRequest(Sales sale) {
		Sales newSale = em.merge(sale);
		System.out.println(newSale.getSalesId());
	}
	
	public void findSalesById(int sId) {
		Sales foundSale = em.find(Sales.class, sId);
		System.out.println(foundSale);
	}
	
	public void viewAllSales() {
		String jpql="Select s from Sales s";
		TypedQuery<Sales> query = em.createQuery(jpql,Sales.class);
		List<Sales> sales=query.getResultList();
		for(Sales sale:sales)
		{
			System.out.println(sale);
		}
	}
	
	public void findSalesByFarmerId(int fId) {
		String jpql="Select s from Sales s where s.fid=:farmerId";
		TypedQuery<Sales> query = em.createQuery(jpql, Sales.class);
		query.setParameter("farmerId", fId);
		Sales sale=query.getSingleResult();
		System.out.println(sale);
	}
	
	public void findSalesByBidder(int bId) {
		
		String jpql="Select s from Sales s where s.bid=:bidderId";
		TypedQuery<Sales> query = em.createQuery(jpql, Sales.class);
		query.setParameter("bidderId", bId);
		Sales sale=query.getSingleResult();
		System.out.println(sale);
	}
}
