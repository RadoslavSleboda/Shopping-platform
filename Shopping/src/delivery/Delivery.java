package delivery;


import builder.contact.ContactInformation;

public class Delivery {

	protected String buildAdress(ContactInformation contact) {
	
	String adress =contact.getAdress().getCity() +
			", " + contact.getAdress().getStreet() +
			", " + contact.getAdress().getHouseNumber()
			 	 + " for " + contact.getName().getTitle() +
			 "." + contact.getName().getFirstName() +
			 " " + contact.getName().getSurrname();
	return adress;
}
}
