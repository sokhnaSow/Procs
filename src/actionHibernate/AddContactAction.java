package actionHibernate;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;

import actionValidationForm.AddContactValidationForm;
import domain.Adress;
import domain.Contact;
import domain.PhoneNumber;
//import domain.DAOContact;
import services.ServiceContact;
import util.HibernateUtil;


public class AddContactAction extends Action {

	//Session session = HibernateUtil.getSessionFactory().getCurrentSession(); 

	public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest, final HttpServletResponse pResponse) throws NamingException, SQLException {


		final AddContactValidationForm lForm=(AddContactValidationForm)pForm;
		
		final String firstName = lForm.getFirstName();
		final String lastName = lForm.getLastName();
		final String email = lForm.getEmail();
		
		final String street = lForm.getStreet();
		final String zip = lForm.getZip();
		final String city = lForm.getCity();
		final String country = lForm.getCountry();
		
		final String phoneKind = lForm.getPhoneKind();
		final String phoneNumber = lForm.getPhoneNumber();
		
		final String btn = lForm.getBtn();
		
		Adress add = new Adress(street,city,zip,country);
		Set<PhoneNumber> spn = new HashSet<PhoneNumber>();
		PhoneNumber pn = new PhoneNumber(phoneKind, phoneNumber);
		spn.add(pn);
		Contact c = new Contact(firstName,lastName,email,add,spn);
		final ServiceContact sc = new ServiceContact();
		sc.addContact(c);
		
		/*
		if(btn.equals("save")){
			sc.add
			session.beginTransaction();
			Contact c = new Contact( firstName, lastName, email); //A voir
			Adress adresse = new Adress (street, city, zip, country);
			Set<PhoneNumber> phones = new HashSet<>();
			c.setAdress(adresse);
			//c.setPhones(phones);
			
			session.persist(c);
			
			if(phoneKind!=null){
				 pk = new PhoneNumber(phoneKind, phoneNumber);
				 pk.setContact(c);
				 session.persist(pk);
			 
			}
			
			if(phoneNumber!=null){
				 pn = new PhoneNumber(phoneKind, phoneNumber);
				 pn.setContact(c);
				 session.persist(pn);
			 
			}
			
			session.getTransaction().commit();
			*/
			List<Contact> itemListContact = sc.getListContact();
			pRequest.getServletContext().setAttribute("itemListContact", itemListContact);
			return pMapping.findForward("success");
			
		
		
		
	}
}
