package actionHibernate;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import actionValidationForm.ResearchContactValidationForm;
import domain.Contact;
import services.ServiceContact;

public class ResearchContactAction extends Action{
	
	public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest,
			   final HttpServletResponse pResponse) throws ClassNotFoundException, ServletException, IOException, SQLException, NamingException {
			  
			  final ResearchContactValidationForm lForm=(ResearchContactValidationForm)pForm;
			  final String research = lForm.getResearch();
			  
			  final ServiceContact sc = new ServiceContact();
			  
			  List<Contact> list;
			  list = sc.researchContact(research);			  
			  
			  RequestDispatcher rd = pRequest.getRequestDispatcher("/pages/successResearch.jsp");
			  pRequest.setAttribute("list", list);
			  rd.forward(pRequest, pResponse);
			  return null;
	}

}
