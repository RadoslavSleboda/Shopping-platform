package delivery;
import javax.swing.JOptionPane;

import builder.contact.ContactInformation;

public class DeliveryByCar extends Delivery implements ShippingStrategy {

	@Override
	public void delivery(ContactInformation contact) {
		JOptionPane.showMessageDialog(null, "Package will be delivered by car within 5 work days to " + buildAdress(contact));
		
	}

}
