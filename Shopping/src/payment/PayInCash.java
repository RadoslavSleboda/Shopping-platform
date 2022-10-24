package payment;
import javax.swing.JOptionPane;

import builder.contact.CardInformation;
import builder.contact.ContactInformation;
import cart.items.Cart;

public class PayInCash extends Pay implements PaymentStrategy {

	@Override
	public void pay(ContactInformation contact, CardInformation card, Cart cart) {

		JOptionPane.showMessageDialog(null, "You will pay " + totalPrice(cart) + " euros in cash" + itemsInCart(cart));
		
	}

}
