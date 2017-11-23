package services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import domain.Adress;
import domain.Contact;
import domain.DAOContact;
import domain.PhoneNumber;

public class ServiceContact {
	
	DAOContact daoC = new DAOContact();
	
	public ServiceContact(){
		
	}
	
				
	public String addContact(Contact c){
		return daoC.addContact(c);
	}
	
	public List viewContact(){
		return daoC.viewContact(); //daoC.researchContact(num);
	}
	
	public List researchContact(String lastName){
		return daoC.researchContact(lastName);
	}
	
	public void updateContact (long idContact, Contact contact, PhoneNumber phone){
		daoC.updateContact(idContact, contact, phone);
	}
	
	public void deleteContact (long idContact){
		daoC.deleteContact(idContact);
	}
	
	public String addPhoneNumber(PhoneNumber pn){
		return daoC.addPhoneNumber(pn);
	}
	
	public List listPhoneNumber(long idContact){
		return daoC.listPhoneNumber(idContact);
	}
	
	
	public String addAdress(Adress ad){
		return daoC.addAdress(ad);
	}


	public List<Contact> getListContact() {
		return daoC.getListContact();
	}
	

}
