package actionHibernate;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import actionValidationForm.UpdateContactValidationForm;
import domain.Adress;
import domain.Contact;
import domain.PhoneNumber;
import services.ServiceContact;

public class UpdateContactAction extends Action {

	public ActionForward execute(final ActionMapping dMapping, UpdateContactValidationForm dForm, final HttpServletRequest dRequest,
			final HttpServletResponse dResponse) throws NamingException, SQLException {


		final UpdateContactValidationForm lForm = dForm; //(UpdateContactValidationForm)dForm;
		final long idm = lForm.getIdm();
		
		final String firstName = lForm.getFirstName();
		final String lastName = lForm.getLastName();
		final String email = lForm.getEmail();
		
		final String street = lForm.getStreet();
		final String zip = lForm.getZip();
		final String city = lForm.getCity();
		final String country = lForm.getCountry();
		
		final String phoneKind = lForm.getPhoneKind(); 
		final String phoneNumber = lForm.getPhoneNumber() ;
		
		final String submit = lForm.getSubmit();
		
		ServiceContact sc = new ServiceContact();
		Contact c = new Contact( firstName, lastName, email); //A voir
		Adress a = new Adress (street, city, zip, country);
		c.setAdress(a);
		
		PhoneNumber p = new PhoneNumber(phoneKind, phoneNumber);
		if(submit.equals("modifier")){
			sc.updateContact(idm, c, p);
			return dMapping.findForward("sucmodif");
		}
		if(submit.equals("supprimer")){
			sc.deleteContact(idm);
			System.out.println("contact "+ idm + " supprime");
			return dMapping.findForward("sucsupp");
		}
		return null;
	}
}
