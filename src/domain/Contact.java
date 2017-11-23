package domain;

import java.util.HashSet;
import java.util.Set;


public class Contact {
	

	private long idContact ; 
	private String firstName ; 
	private String lastName ; 
	private String email ;
	
	private Set<ContactGroup> groupes = new HashSet<ContactGroup>(0); 
	private Set<PhoneNumber> phones = new HashSet<PhoneNumber>(0); 
	private Adress adress; 
	
	
	

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(long idContact, String firstName, String lastName, String email) {
		super();
		this.idContact = idContact;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	} 
	
	public Contact(String firstName, String lastName, String email, Set<ContactGroup> groupes) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.groupes = groupes;
	} 
	
	public Contact(String firstName, String lastName, String email,Adress adress, Set<PhoneNumber> phonesNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.adress = adress;
		this.phones = phonesNumber;
	} 
	
	
	public Contact(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Contact(String firstName, String lastName, String email, Adress adress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.adress = adress;
	}
	
	public Contact(String firstName, String lastName, String email, Set<PhoneNumber> phones, Adress adress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phones = phones;
		this.adress = adress;
	}

	public long getIdContact() {
		return idContact;
	}

	public void setIdContact(long idContact) {
		this.idContact = idContact;
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
	
	public Set<ContactGroup> getGroupes() {
		return groupes;
	}

	public void setGroupes(Set<ContactGroup> groupes) {
		this.groupes = groupes;
	}

	public Set<PhoneNumber> getPhones() {
		return phones;
	}

	public void setPhones(Set<PhoneNumber> phones) {
		this.phones = phones;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

}
