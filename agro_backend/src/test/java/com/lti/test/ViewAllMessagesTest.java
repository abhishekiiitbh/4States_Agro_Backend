package com.lti.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.lti.agro.model.ContactUsRequest;
import com.lti.agro.repo.ViewMessagesDao;

public class ViewAllMessagesTest {
	
	ViewMessagesDao dao=new ViewMessagesDao();
	
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
