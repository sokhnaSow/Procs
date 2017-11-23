package actionValidationForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UpdateContactValidationForm {

	private static final long serialVersionUID = 1L;

	private int idm; //btModif
	private String firstName=null;
	private String lastName=null;
	private String email=null;

	private String street =null ;
	private String city = null ; 
	private String zip = null ; 
	private String country = null ; 

	private String phoneKind ;
	private String phoneNumber ;

	private String submit;

	public int getIdm() {
		return idm;
	}

	public void setIdm(int idm) {
		this.idm = idm;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) {
		ActionErrors errors = new ActionErrors();

		if(getIdm()==0) {
			errors.add("Id",new ActionMessage("creation.id.error.required"));
		}		
		
		if(getFirstName()== null ||getFirstName().length() < 1 ) {
			errors.add("first name",new	ActionMessage("creation.fn.error.required"));
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
			errors.add("zip",new ActionMessage("creation.code.error.required"));
		}
		
		if( getCountry()== null || getCountry().length() < 1 ) {
			errors.add("country",new ActionMessage("creation.pays.error.required"));
		}
		
		
		if( getPhoneNumber()== null || getPhoneNumber().length() < 1 ) {
			errors.add("telephone",new ActionMessage("creation.tel.error.required"));
		}

		try {
			Integer.parseInt(getPhoneNumber());
		} catch (NumberFormatException e){
			errors.add("telephone",new ActionMessage("creation.tel.error.required"));
		}
		try {
			Integer.parseInt(getZip());
		} catch (NumberFormatException e){
			errors.add("code",new ActionMessage("creation.code.error.required"));
		}

		return errors;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}