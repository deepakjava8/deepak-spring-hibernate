package com.mostonsoft.contact.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mostonsoft.contact.form.Contact;
import com.mostonsoft.contact.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	ContactService contactService;
	
	@RequestMapping("/index")
	public String listContact(Map<String, Object> map){
		Contact contact=new  Contact();
		map.put("contactCommand", contact);
		map.put("contactList", contactService.listContact());
		return "contact";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addContact(@ModelAttribute("contactCommand")Contact contact,BindingResult result){
		contactService.addContact(contact);
		
		return "redirect:/index";
	}
	
	@RequestMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId")Integer contactId){
	
		contactService.removeContact(contactId);
		return "redirect:/index";
	}
}
