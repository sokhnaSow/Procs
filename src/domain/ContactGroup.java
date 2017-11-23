package domain;

import java.util.HashSet;
import java.util.Set;

public class ContactGroup {
	
	private long idContactGroup ; 
	private String groupName; 	
	private Set<Contact> contacts = new HashSet<>();
	
	public ContactGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactGroup(long idContactGroup, String groupName) {
		super();
		this.idContactGroup = idContactGroup;
		
	}
	
	public ContactGroup(String groupName) {
		super();
		this.groupName = groupName;
		
	}
	
	public ContactGroup(long idContactGroup, String groupName, Set<Contact> contacts) {
		super();
		this.idContactGroup = idContactGroup;
		this.groupName = groupName;
		this.contacts = contacts;
		
	}
	
	public ContactGroup(String groupName, Set<Contact> contacts) {
		super();
		this.groupName = groupName;
		this.contacts = contacts;
		
	}

	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}

	public long getIdContactGroup() {
		return idContactGroup;
	}

	public void setIdContactGroup(long idContactGroup) {
		this.idContactGroup = idContactGroup;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	} 

}
