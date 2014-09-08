package com.mostonsoft.contact.service;

import java.util.List;

import com.mostonsoft.contact.form.Contact;

public interface ContactService {
public void addContact(Contact contact);
public List<Contact> listContact();
public void removeContact(Integer id);
}
