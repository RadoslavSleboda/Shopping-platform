package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;

import payment.PaymentStrategy;
import payment.TypeOfPayment;
import javax.swing.JLabel;
import javax.swing.JTextField;

import builder.contact.Adress;
import builder.contact.CardInformation;
import builder.contact.ContactInformation;
import builder.contact.Name;
import delivery.DeliveryByCar;
import delivery.DeliveryByDrone;
import delivery.ShippingStrategy;
import delivery.TypeOfDelivery;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PayPersonaly implements Items {

	private JFrame frame;
	private static JTextField title;
	private static JTextField city;
	private static JTextField firstName;
	private static JTextField street;
	private static JTextField surrname;
	private static JTextField houseNumber;
	
	
	private static TypeOfPayment typeOfPayment;

	public static void setTypeOfPayment(TypeOfPayment t) {
		typeOfPayment = t;
	}
	

	/**
	 * Launch the application.
	 */
	public static void openWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayPersonaly window = new PayPersonaly();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PayPersonaly() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Title");
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 200, 24);
		frame.getContentPane().add(lblNewLabel);
		
		title = new JTextField();
		title.setBounds(10, 33, 200, 19);
		frame.getContentPane().add(title);
		title.setColumns(10);
		
		JLabel lblAdressCity = new JLabel("Adress - City");
		lblAdressCity.setForeground(new Color(255, 0, 0));
		lblAdressCity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAdressCity.setBounds(220, 10, 200, 24);
		frame.getContentPane().add(lblAdressCity);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(220, 33, 200, 19);
		frame.getContentPane().add(city);
		
		JLabel lblSurrname = new JLabel("First name");
		lblSurrname.setForeground(new Color(0, 0, 205));
		lblSurrname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSurrname.setBounds(10, 52, 200, 24);
		frame.getContentPane().add(lblSurrname);
		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(10, 75, 200, 19);
		frame.getContentPane().add(firstName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Street");
		lblNewLabel_1_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(220, 52, 200, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		street = new JTextField();
		street.setColumns(10);
		street.setBounds(220, 75, 200, 19);
		frame.getContentPane().add(street);
		
		JLabel lblSurrname_1 = new JLabel("Surrname");
		lblSurrname_1.setForeground(new Color(0, 0, 205));
		lblSurrname_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSurrname_1.setBounds(10, 95, 200, 24);
		frame.getContentPane().add(lblSurrname_1);
		
		surrname = new JTextField();
		surrname.setColumns(10);
		surrname.setBounds(10, 118, 200, 19);
		frame.getContentPane().add(surrname);
		
		JLabel lblNewLabel_1_2 = new JLabel("House number");
		lblNewLabel_1_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(220, 95, 200, 24);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		houseNumber = new JTextField();
		houseNumber.setColumns(10);
		houseNumber.setBounds(220, 118, 200, 19);
		frame.getContentPane().add(houseNumber);
		
		JButton btnNewButton = new JButton("Deliver by car 2.");
		btnNewButton.setBackground(new Color(245, 245, 220));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TypeOfDelivery delivery = new TypeOfDelivery(new DeliveryByCar());
				typeOfPayment.pay(buildContact(), null, cart);
				delivery.deliver(buildContact());
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(10, 236, 101, 24);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDeliverByDrone = new JButton("Deliver by drone");
		btnDeliverByDrone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TypeOfDelivery delivery = new TypeOfDelivery(new DeliveryByDrone());
				typeOfPayment.pay(buildContact(), null, cart);
				delivery.deliver(buildContact());
				frame.dispose();
			}
		});
		btnDeliverByDrone.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnDeliverByDrone.setBounds(109, 236, 101, 24);
		frame.getContentPane().add(btnDeliverByDrone);
		
		JButton btnAutoFill = new JButton("Auto fill 1.");
		btnAutoFill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				title.setText("Dr");
				firstName.setText("Alan");
				surrname.setText("Grant");
				city.setText("New york");
				street.setText("Wallstreet");
				houseNumber.setText("7");
			}
		});
		btnAutoFill.setBackground(new Color(245, 245, 220));
		btnAutoFill.setForeground(new Color(0, 0, 0));
		btnAutoFill.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnAutoFill.setBounds(220, 236, 200, 24);
		frame.getContentPane().add(btnAutoFill);
	}

	private ContactInformation buildContact() {
		
		Name name = new Name.Builder()
							.title(title.getText())
							.firstName(firstName.getText())
							.surrname(surrname.getText())
							.build();
		
		Adress adress = new Adress.Builder()
								  .city(city.getText())
								  .street(street.getText())
								  .houseNumber(houseNumber.getText())
								  .build();
		
		ContactInformation contact = new ContactInformation.Builder()
														   .name(name)
														   .adress(adress)
														   .build();
		
		return contact;
	}
	
}