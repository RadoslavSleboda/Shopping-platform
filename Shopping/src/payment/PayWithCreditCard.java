package payment;
import javax.swing.JOptionPane;

import builder.contact.CardInformation;
import builder.contact.ContactInformation;
import cart.items.Cart;

public class PayWithCreditCard extends Pay implements PaymentStrategy {

	@Override
	public void pay(ContactInformation contact, CardInformation card, Cart cart) {	
		
		JOptionPane.showMessageDialog(null, "You have paid " + (totalPrice(cart)+5) + " euros with a creditcard" + itemsInCart(cart) + "Bank charged extra 5 euros for transaction!");
		JOptionPane.showMessageDialog(null, infoForBank(contact, card));
		
	}
}
