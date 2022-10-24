package payment;
import javax.swing.JOptionPane;

import builder.contact.CardInformation;
import builder.contact.ContactInformation;
import cart.items.Cart;

public class PayWithDebitCard extends Pay implements PaymentStrategy {

	@Override
	public void pay(ContactInformation contact, CardInformation card, Cart cart) {	
		
		JOptionPane.showMessageDialog(null, "You have paid " + totalPrice(cart) + " euros with a debitcard" + itemsInCart(cart));
		JOptionPane.showMessageDialog(null, infoForBank(contact, card));
		
	}
}