package payment;

import builder.contact.CardInformation;
import builder.contact.ContactInformation;
import cart.items.Cart;

public interface PaymentStrategy {

void pay(ContactInformation contact, CardInformation card, Cart cart);


}
