package domain;

import java.util.Set;

public class Entreprise extends Contact{
	
	private long numSiret;
	
	public Entreprise(String firstName, String lastName, String email, long numSiret){
		super(firstName, lastName, email);
		this.numSiret = numSiret;
	}
	
	
/*
	public Entreprise(String firstName, String lastName, String email, Set<PhoneNumber> phones, Adress adress, long numSiret) {
		super(firstName, lastName, email, phones, adress);
		this.numSiret = numSiret;
	}

*/
	public Entreprise(long numSiret) {
		super();
	}

	public long getNumSiret() {
		return numSiret;
	}

	public void setNumSiret(long numSiret) {
		this.numSiret = numSiret;
	}

}
