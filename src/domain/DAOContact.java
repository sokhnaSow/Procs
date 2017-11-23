package domain;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import domain.Adress;
import domain.Contact;
import domain.PhoneNumber;

import util.HibernateUtil;

public class DAOContact {
	
	

	/*****	Contact	*****/
	
	public String addContact(Contact c){

		/*
		session.beginTransaction();
		Query query = session.createQuery("from Contact");
		List result = query.list();
		result.add(c);
		session.persist(c);
		session.getTransaction().commit();
		*/
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(c);
		session.getTransaction().commit();
		session.close();

		return null;	
	}
	
	public List<Contact> getListContact() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.getTransaction().begin();
		Query query = session.createQuery("from Contact");
		List<Contact> contacts = query.list();
		session.getTransaction().commit();
		session.close();
		
		return contacts;
		
	}
	/*
	 
	
	 */
	
	public List<Contact> viewContact(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("from Contact");
		List<Contact> contacts = query.list();
		session.getTransaction().commit();
		session.close();
		return contacts;
		
		
	}
	
	public List researchContact(String lastName){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		List contacts = session.createCriteria(Contact.class).add(Restrictions.like("nom", lastName)).list();
		session.getTransaction().commit();
		session.close();
		return contacts;
	}
	
	public void updateContact (long idContact, Contact contact, PhoneNumber phone){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Contact c = (Contact) session.get(Contact.class, idContact);
		c.setFirstName(contact.getFirstName());
		c.setLastName(contact.getLastName());
		c.setEmail(contact.getEmail());
		
		Adress a = (Adress) session.get(Adress.class, c.getAdress().getIdAdress());
		a.setStreet(contact.getAdress().getStreet());
		a.setCity(contact.getAdress().getCity());
		a.setZip(contact.getAdress().getZip());
		a.setCountry(contact.getAdress().getCountry());
		
		PhoneNumber p = (PhoneNumber) session.get(PhoneNumber.class, idContact);
		p.setPhoneKind(phone.getPhoneKind());
		p.setPhoneNumber(phone.getPhoneNumber());
		
		session.update(p);
		session.update(a);
		session.update(c);
		
		session.getTransaction().commit();
		session.close();
	}
		
	public void deleteContact (long idContact){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Contact c = (Contact) session.get(Contact.class, idContact);
		session.delete(c);
		session.getTransaction().commit();
		session.close();
	}
	
	
	/*****	PhoneNumer	*****/
	
	public String addPhoneNumber(PhoneNumber pn){
		
		long idPC;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		idPC = (long) session.save(pn);
		pn.setIdPhoneNumber(idPC);
		session.getTransaction().commit();
		session.close();
		
		return null;
	}
	
	public void updatePhoneNumber (long idPhoneNumber, PhoneNumber phone){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		PhoneNumber p = (PhoneNumber) session.get(PhoneNumber.class, idPhoneNumber);	
		session.saveOrUpdate(p); // à revoir
		session.getTransaction().commit();
	}
	
	public List listPhoneNumber(long idContact){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		String query = "from Telephone as t where t.contact.num = :idContact"; //modif 
		List phones =session.createQuery(query).setParameter("idContact",idContact).list();
      
       session.getTransaction().commit();
       session.close();
       
       return phones;
      
	}
	
	
	
	/*****	Adress	*****/
	
	public String addAdress(Adress ad){
		
		
		long idA;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		idA = (long) session.save(ad);
		ad.setIdAdress(idA);
		session.getTransaction().commit();
		session.close();
		
		return null;
	}
	
	public void updateAdress (long idAdress, Adress adress){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Adress a = (Adress) session.get(Adress.class, idAdress);
		a.setStreet(adress.getStreet());
		a.setCity(adress.getCity());
		a.setZip(adress.getZip());
		a.setCountry(adress.getCountry());
		
		session.update(a);
		session.getTransaction().commit();
		session.close();
	}
	
	/*                Group			*/
	
	public String addGroup(ContactGroup cg){
		
		long idCg;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		idCg = (long) session.save(cg);
		cg.setIdContactGroup(idCg);
		session.getTransaction().commit();
		session.close();
		
		return null;
	}
	
	/*           Entreprise     */
	public String addEntreprise(Entreprise en){
		
		long idE;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		idE = (long) session.save(en);
		en.setNumSiret(idE);
		
		session.getTransaction().commit();
		session.close();
		
		return null;
	}	
	
}
