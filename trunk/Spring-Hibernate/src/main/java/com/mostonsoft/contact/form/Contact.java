package com.mostonsoft.contact.form;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name="contact")
public class Contact {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
	@Column(name="Fist_Name")
private String firstname;
	@Column(name="Last_Name")
private String lastname;
	@Column(name="Email")
private String email;
	@Column(name="Telephone")
private String telephone;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}

}
