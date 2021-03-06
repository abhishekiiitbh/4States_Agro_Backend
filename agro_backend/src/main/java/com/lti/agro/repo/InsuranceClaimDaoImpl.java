package com.lti.agro.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.agro.model.InsuranceClaim;

@Repository
public class InsuranceClaimDaoImpl {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void placeAClaimRequest(InsuranceClaim claim) {
		InsuranceClaim newClaim =em.merge(claim);
		System.out.println(newClaim.getrId());
		
	}
	
	public void showPreviousClaimByFid(int fid) {
		
		
	}
	
}
