package actionValidationForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddContactValidationForm extends ActionForm {

	private static final long serialVersionUID = 1L;

	//private long idContact=0;
	private String firstName=null;
	private String lastName=null;
	private String email=null;
	
	private String street =null ;
	private String city = null ; 
	private String zip = null ; 
	private String country = null ; 
	
	private String phoneNumber;
	private String phoneKind ;
	 
	private String[] groupe = null ; 
	
	private String btn = null; 
	

	/**
	 * @return Email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return First Name
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return Last name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param string Sets the Email
	 */
	public void setEmail(String string) {
		email = string;
	}
	/**
	 * @param string Sets the First Name
	 */
	public void setFirstName(String string) {
		firstName = string;
	}
	/**
	 * @param string sets the Last Name
	 */
	public void setLastName(String string) {
		lastName = string;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	
	public String [] getGroupe() {
		return groupe;
	}

	public void setGroupe(String[] groupe) {
		this.groupe = groupe;
	}

	
	public String getBtn() {
		return btn;
	}
	
	public void setBtn(String btn) {
		this.btn = btn;
	}
	
	public String getPhoneKind() {
		return phoneKind;
	}
	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		
		this.firstName=null;
		this.lastName=null;
		this.email=null;
		
		this.street = null;
		this.city = null;
		this.zip = null;
		this.country = null;
		
		this.phoneKind = null;
		this.phoneNumber = null;

		this.btn= null ; 

	}


	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {

		ActionErrors errors = new ActionErrors();
		if(!getBtn().equals("retour")){		
			
			if( getFirstName()== null || getFirstName().length() < 1 ) {
				errors.add("first name",new ActionMessage("creation.fn.error.required"));
			}
			
			if( getLastName()== null || getLastName().length() < 1 ) {
				errors.add("last name",new ActionMessage("creation.ln.error.required"));
			}
			
			if( getEmail() == null || getEmail().length() < 1 || !getEmail().matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" )) {
				errors.add("email", new ActionMessage("creation.email.error.required"));
			}
			
			if( getStreet()== null || getStreet().length() < 1 ) {
				errors.add("street",new ActionMessage("creation.rue.error.required"));
			}
			
			if( getCity()== null || getCity().length() < 1 ) {
				errors.add("city",new ActionMessage("creation.ville.error.required"));
			}
			
			if( getZip()== null || getZip().length() < 1 ) {
				errors.add("zip",new ActionMessage("creation.code.error.required")); //erreur code postal à gérer
			}
			
			if( getCountry()== null || getCountry().length() < 1 ) {
				errors.add("country",new ActionMessage("creation.pays.error.required"));
			}
			
			if(getPhoneKind()!=null || getPhoneKind().length()>1){
				try {
					Integer.parseInt(getPhoneKind());
				} catch (NumberFormatException e){
					errors.add("type phone",new
							ActionMessage("creation.tel.error.required"));
				}
			}
			
			if(getPhoneNumber()!=null || getPhoneNumber().length()>1) {
				try {
					Integer.parseInt(getPhoneNumber());
				} catch (NumberFormatException e){
					errors.add("telephone ",new
							ActionMessage("creation.tel.error.required"));
				}
			}
			
		}
		return errors;
	}
}


