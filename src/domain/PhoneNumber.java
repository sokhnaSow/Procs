package domain;

public class PhoneNumber {
	
	private long idPhoneNumber ; 
	private String phoneKind ; 
	private String phoneNumber ;
	private Contact contact ;
	
	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneNumber(long idPhoneNumber, String phoneKind, String phoneNumber) {
		super();
		this.idPhoneNumber = idPhoneNumber;
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneNumber(String phoneKind, String phoneNumber) {
		super();
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneNumber(String phoneKind, String phoneNumber, Contact contact) {
		super();
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
		this.contact = contact;
	}


	public long getIdPhoneNumber() {
		return idPhoneNumber;
	}

	public void setIdPhoneNumber(long idPhoneNumber) {
		this.idPhoneNumber = idPhoneNumber;
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
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}
