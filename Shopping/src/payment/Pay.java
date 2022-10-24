package payment;
import java.util.StringJoiner;

import builder.contact.CardInformation;
import builder.contact.ContactInformation;
import cart.items.Cart;

public class Pay {

	protected double totalPrice(Cart cart) {
		double totalPrice = 0;
		for(int i = 0; i < cart.getCart().size(); i++) {
		totalPrice += Double. parseDouble(cart.getCart().get(i).getPrice()) * cart.getNumOfItems().get(i);
		}
		return totalPrice;
	}
	
	protected String itemsInCart(Cart cart) {
		  StringJoiner stringJoiner = new StringJoiner("");
		  stringJoiner.add(" for these items: ");
		for(int i = 0; i < cart.getCart().size(); i++) {
			stringJoiner.add(cart.getNumOfItems().get(i).toString());
			stringJoiner.add("X ");
			stringJoiner.add(cart.getCart().get(i).getName());
			stringJoiner.add(", ");
		}
		return stringJoiner.toString();
	}
	
	protected String infoForBank(ContactInformation contact, CardInformation card) {
		String infoForBank = "Information for bank: card number: "
									+ card.getCardNumber() + 
				" date of expiry: " + card.getExpirationDay() + 
								"/" + card.getExpirationMonth() + 
				" security number: "+ card.getSecurityNumber();
		
		return infoForBank;
}
	
}
