package com.lti.agro.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.agro.model.ContactUsRequest;

public class ViewMessagesDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	

	public ViewMessagesDao() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	public List<ContactUsRequest> viewAllMessages(){
		Query query=em.createQuery("select c from ContactUsRequest c",ContactUsRequest.class);
		return query.getResultList();
	}
}
