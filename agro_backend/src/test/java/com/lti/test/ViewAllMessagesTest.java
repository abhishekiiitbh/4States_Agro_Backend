package com.lti.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.agro.model.ContactUsRequest;
import com.lti.agro.repo.ContactUsRequestDao;
import com.lti.agro.repo.ViewMessagesDao;

public class ViewAllMessagesTest {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
	ViewMessagesDao dao = context.getBean(ViewMessagesDao.class);

	
	@Test
	public void viewAllMessages(){
		List<ContactUsRequest> messages=dao.viewAllMessages();
		Iterator<ContactUsRequest> items=messages.iterator();
		while(items.hasNext()){
			ContactUsRequest c=items.next();
			System.out.println(c.getName()+" "+c.getEmail()+" "+c.getMessage());
			
		}
	}

}
