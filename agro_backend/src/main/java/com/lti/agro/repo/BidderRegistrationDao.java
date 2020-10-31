package com.lti.agro.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.agro.model.Bidder;

public class BidderRegistrationDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	

	public BidderRegistrationDao() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	public void registerABidder(Bidder bidder){
		tx.begin();
		em.merge(bidder);
		tx.commit();
		System.out.println("Bidder requested for registration.");
	}
	
	//public void registrationApproval()
}
