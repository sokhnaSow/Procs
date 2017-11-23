package actionHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import domain.Adress;
import domain.Contact;

public class ItemContact extends Action{
	/*
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		List<Contact> itemListContacts = new ArrayList<Contact>();
		Contact c = new Contact();
		Adress ad = new Adress();
		
		
		
		
		c.setFirstName(c.getFirstName());
		c.setLastName(c.getLastName());
		c.setEmail(c.getEmail());
		c.setAdress(ad);
		
		itemListContacts.add(c);		

		request.getServletContext().setAttribute("itemListContacts", itemListContacts);
		
		return mapping.findForward("success");
	}
	*/
}
