package com.lti.agro.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.agro.model.ContactUsRequest;

@Repository
public class ViewMessagesDao {
	
	@PersistenceContext
	EntityManager em;

	@Transactional
	public List<ContactUsRequest> viewAllMessages(){
		Query query=em.createQuery("select c from ContactUsRequest c",ContactUsRequest.class);
		return query.getResultList();
	}
}
