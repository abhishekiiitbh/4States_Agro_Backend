package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.agro.model.ContactUsRequest;
import com.lti.agro.repo.ContactUsRequestDao;

public class ContactUsRequestTests{
	
	ContactUsRequestDao dao=new ContactUsRequestDao();
	
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
