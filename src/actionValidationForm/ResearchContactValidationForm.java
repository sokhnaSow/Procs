package actionValidationForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ResearchContactValidationForm extends ActionForm{
	
	private static final long serialVersionUID = 1L;
	private String research;
	
	public String getResearch() {
		return research;
	}
	
	public void setResearch(String research) {
		this.research = research;
	}
	/*
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.research=0;
	}
	*/
	public ActionErrors validate(
			ActionMapping mapping, HttpServletRequest request ) {
		ActionErrors errors = new ActionErrors();

		if( getResearch()== null) {
			errors.add("Search",new ActionMessage("search.fn.error.required"));
		}

		return errors;
	}

}
