package com.lti.agro.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.agro.model.Farmer;

public class FarmerRegistrationDao {
	
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	

	public FarmerRegistrationDao() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	public void registerAFarmer(Farmer farmer){
		tx.begin();
		em.merge(farmer);
		tx.commit();
		System.out.println("Farmer requested for registration.");
	}
}
