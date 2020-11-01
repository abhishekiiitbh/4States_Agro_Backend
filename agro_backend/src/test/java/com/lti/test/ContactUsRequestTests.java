package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.agro.model.ContactUsRequest;
import com.lti.agro.repo.ContactUsRequestDao;
import com.lti.agro.repo.InsuranceClaimDaoImpl;

public class ContactUsRequestTests{
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
	ContactUsRequestDao dao = context.getBean(ContactUsRequestDao.class);
	
	@Test
	public void addAMessage() {
		ContactUsRequest cntusreq=new ContactUsRequest();
		cntusreq.setName("Vikas");
		cntusreq.setEmail("vikas@iiit-bh.ac.in");
		cntusreq.setMessage("Hello gurujanos");
		cntusreq.setStatus(false);
		dao.addAMessage(cntusreq);
		
	}

}
