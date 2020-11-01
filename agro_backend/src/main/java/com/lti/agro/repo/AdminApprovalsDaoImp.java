package com.lti.agro.repo;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.agro.model.Bidder;
import com.lti.agro.model.InsuranceApplications;
import com.lti.agro.model.InsuranceClaim;
import com.lti.agro.model.Sales;

@Repository
public class AdminApprovalsDaoImp {

	
	@PersistenceContext
	EntityManager em;
	
	@Transactional 
	public boolean approveSellRequest(int salesId) {
		String jpql="select s from Sales s where s.salesId=:sal";
		Query query=em.createQuery(jpql,Sales.class);
		query.setParameter("sal", salesId);
		Sales ss=(Sales)query.getResultList().stream().findFirst().orElse(null);
		if(ss!=null){
			ss.setSold(true);
			em.merge(ss);
			return true;
		}
		return false;
	}
	
	
      
	@Transactional 
	public boolean FinalizeBiddingStatus(int salesId) {
		String jpql="select s from Sales s where s.salesId=:sal";
		Query query=em.createQuery(jpql,Sales.class);
		query.setParameter("sal", salesId);
		Sales ss=(Sales)query.getResultList().stream().findFirst().orElse(null);
		if(ss!=null){
			ss.setStatus(true);
			em.merge(ss);
			return true;
		}
		return false;
	  
	}

	@Transactional 
	public boolean insuranceApplicationRequest(int policyNo, String aadhaarCardNumber) {
		String jpql="select na from InsuranceApplications na where na.policyNo=:pn and na.aadhaarCardNumber=:acd";
		Query query=em.createQuery(jpql,InsuranceApplications.class);
		query.setParameter("pn", policyNo);
		query.setParameter("acd", aadhaarCardNumber);
		InsuranceApplications in=(InsuranceApplications)query.getResultList().stream().findFirst().orElse(null);
		if(in!=null){
			in.setStatus(true);
			em.merge(in);
			return true;
		}
		return false;
		
	}

	@Transactional 
	public boolean approveClaimInsurance(int rId) {
		
		String jpql="select cl from InsuranceClaim cl where cl.rId=:r";
		Query query=em.createQuery(jpql,InsuranceClaim.class);
		query.setParameter("r", rId);
		InsuranceClaim inc=(InsuranceClaim)query.getResultList().stream().findFirst().orElse(null);
		if(inc!=null){
			inc.setClaimStatus(true);
			inc.setAmountClaimed(40000);
			inc.setDateOfApproval(LocalDate.of(2020, 11, 01));
			em.merge(inc);
			return true;
		}
		return false;
	}

}
