package delivery;
import builder.contact.ContactInformation;

public interface ShippingStrategy {

	void delivery(ContactInformation contact);
}
