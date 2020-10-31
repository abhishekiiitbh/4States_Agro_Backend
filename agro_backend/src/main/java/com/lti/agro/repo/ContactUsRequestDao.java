
package com.lti.agro.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.agro.model.ContactUsRequest;

public class ContactUsRequestDao {

	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	

	public ContactUsRequestDao() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	public void addAMessage(ContactUsRequest cntusreq) {
		tx.begin();
		em.merge(cntusreq);
		tx.commit();
		System.out.println("Message added.");

	}
	
	
}

