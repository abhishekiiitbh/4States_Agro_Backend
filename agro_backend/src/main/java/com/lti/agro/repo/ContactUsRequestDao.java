
package com.lti.agro.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.agro.model.ContactUsRequest;

@Repository
public class ContactUsRequestDao {

	@PersistenceContext
	EntityManager em;
	
	
	@Transactional
	public void addAMessage(ContactUsRequest cntusreq) {
		
		em.merge(cntusreq);
		System.out.println("Message added.");

	}
	
	
}

