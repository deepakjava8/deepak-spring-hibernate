package com.mostonsoft.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mostonsoft.contact.dao.ContactDAO;
import com.mostonsoft.contact.form.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	ContactDAO contactDAO;
	
	@Transactional
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
		
	}
	
	@Transactional
	public List<Contact> listContact() {
		
		return contactDAO.listContact();
	}

	@Transactional
	public void removeContact(Integer id) {
		contactDAO.removeContact(id);
		
	}

}
