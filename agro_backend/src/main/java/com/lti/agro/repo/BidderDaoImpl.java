package com.lti.agro.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.agro.model.Bidder;

@Repository
public class BidderDaoImpl {

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void addOrUpfateBidder(Bidder bidder) {
		
		Bidder newBidder = em.merge(bidder);
		System.out.println(newBidder.getbId());

	}
	
	public Bidder findBidderById(int bId) {
		Bidder foundBidder = em.find(Bidder.class, bId);
		return foundBidder;
	}
	
	public void viewAllBidders() {
		String jpql="Select b from Bidder b";
		TypedQuery<Bidder> query = em.createQuery(jpql, Bidder.class);
		List<Bidder> bidders = query.getResultList();
		for(Bidder bidder:bidders)
		{
			System.out.println(bidder);
		}
	}
	
}
