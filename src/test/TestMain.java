package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import domain.Adress;
import domain.Contact;
import domain.ContactGroup;
import domain.DAOContact;
import domain.Entreprise;
import domain.PhoneNumber;
import util.HibernateUtil;

public class TestMain {

	//private static Set<Contact> c3= new HashSet<>();

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession(); 
		
		DAOContact daoC = new DAOContact();
		
		Adress ad = new Adress ("9", "cergy", "95308", "France");
		
		Set<ContactGroup> groups = new HashSet<ContactGroup>();
		ContactGroup g1 = new ContactGroup("potes");
		ContactGroup g2 = new ContactGroup("familles");
		Contact c = new Contact();  //"Harry", "Potter", "mouna@gmail.com", ad,groups
		
		groups.add(g1);
		groups.add(g2);
		
		
		daoC.addContact(c);
		c.setGroupes(groups);
		PhoneNumber pn = new PhoneNumber("45", "0976543278", c);
		daoC.addPhoneNumber(pn);
		
		/*
		Entreprise en = new Entreprise(378587);
		daoC.addEntreprise(en);
		*/
		
		//on ferme la session
		HibernateUtil.getSessionFactory().close(); 
	}

}
