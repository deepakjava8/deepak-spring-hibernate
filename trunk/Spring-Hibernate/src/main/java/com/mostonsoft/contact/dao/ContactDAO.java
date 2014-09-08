package com.mostonsoft.contact.dao;

import java.util.List;

import com.mostonsoft.contact.form.Contact;

public interface ContactDAO {
public void addContact(Contact contact);
public List<Contact> listContact();
public void removeContact(Integer id);
}
