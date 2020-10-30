package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.agro_backend.ContactUsRequest;
import com.lti.dao.ContactUsRequestDao;

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
