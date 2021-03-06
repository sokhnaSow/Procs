package actionHibernate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import actionValidationForm.LoginActionForm;

public class LoginAction extends Action{
	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) throws ClassNotFoundException {

		final LoginActionForm lForm= (LoginActionForm)pForm;


		String target=null;
		if(lForm.getUserName().equals("procs")
				&& lForm.getPassword().equals("procs")) {
			target = "success";
		}
		else {
			target = "errorlogin";
		}
		return pMapping.findForward(target);

	}
}