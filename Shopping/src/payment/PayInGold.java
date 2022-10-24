package payment;
import javax.swing.JOptionPane;

import builder.contact.CardInformation;
import builder.contact.ContactInformation;
import cart.items.Cart;

public class PayInGold extends Pay implements PaymentStrategy {

	@Override
	public void pay(ContactInformation contact, CardInformation card, Cart cart) {

		double gramsOfGold = totalPrice(cart)/54.68;
		gramsOfGold *= 1000;
		gramsOfGold = Math.round(gramsOfGold);
		gramsOfGold /= 1000;
		
		JOptionPane.showMessageDialog(null, "You will pay " + gramsOfGold + " grams of gold" + itemsInCart(cart));
		
				
	}

}
