package delivery;
import javax.swing.JOptionPane;

import builder.contact.ContactInformation;

public class DeliveryByDrone extends Delivery implements ShippingStrategy {
	
	@Override
	public void delivery(ContactInformation contact) {

		JOptionPane.showMessageDialog(null, "Package will be delivered by drone within 2 work days to " + buildAdress(contact));
		
	}

}
