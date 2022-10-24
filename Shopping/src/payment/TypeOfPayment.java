package payment;

import builder.contact.CardInformation;
import builder.contact.ContactInformation;
import cart.items.Cart;

public class TypeOfPayment {
	
	private final PaymentStrategy paymentStrategy;
		
	public TypeOfPayment(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	

	public void pay(ContactInformation contact, CardInformation cardInfo, Cart cart) {
		paymentStrategy.pay(contact, cardInfo,  cart);
	}

}
