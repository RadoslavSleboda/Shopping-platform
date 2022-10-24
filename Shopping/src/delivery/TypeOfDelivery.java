package delivery;

import builder.contact.ContactInformation;

public class TypeOfDelivery {
	
	private final ShippingStrategy shippingStrategy;

	public TypeOfDelivery(ShippingStrategy shippingStrategy) {
		this.shippingStrategy = shippingStrategy;
	}

	public void deliver(ContactInformation contact) {
		shippingStrategy.delivery(contact);
	}
	
}
