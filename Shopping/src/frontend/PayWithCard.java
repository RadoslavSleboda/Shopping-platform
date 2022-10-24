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

public class PayWithCard implements Items {

	private JFrame frame;
	private static JTextField title;
	private static JTextField city;
	private static JTextField firstName;
	private static JTextField street;
	private static JTextField surrname;
	private static JTextField houseNumber;
	private static JTextField cardNumber;
	private static JTextField securityNumber;
	private static JTextField expirationDay;
	private static JTextField expirationMonth;
	
	
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
					PayWithCard window = new PayWithCard();
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
	public PayWithCard() {
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
		
		JLabel lblCardNumber = new JLabel("Card number");
		lblCardNumber.setForeground(new Color(218, 165, 32));
		lblCardNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCardNumber.setBounds(10, 140, 200, 24);
		frame.getContentPane().add(lblCardNumber);
		
		cardNumber = new JTextField();
		cardNumber.setColumns(10);
		cardNumber.setBounds(10, 163, 200, 19);
		frame.getContentPane().add(cardNumber);
		
		JLabel lblNewLabel_1_3 = new JLabel("Security number");
		lblNewLabel_1_3.setForeground(new Color(218, 165, 32));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(220, 140, 200, 24);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		securityNumber = new JTextField();
		securityNumber.setColumns(10);
		securityNumber.setBounds(220, 163, 200, 19);
		frame.getContentPane().add(securityNumber);
		
		JLabel lblExpirationDay = new JLabel("Expiration day");
		lblExpirationDay.setForeground(new Color(218, 165, 32));
		lblExpirationDay.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblExpirationDay.setBounds(10, 184, 200, 24);
		frame.getContentPane().add(lblExpirationDay);
		
		expirationDay = new JTextField();
		expirationDay.setColumns(10);
		expirationDay.setBounds(10, 207, 200, 19);
		frame.getContentPane().add(expirationDay);
		
		JLabel lblNewLabel_1_4 = new JLabel("Expiration month");
		lblNewLabel_1_4.setForeground(new Color(218, 165, 32));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(220, 184, 200, 24);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		expirationMonth = new JTextField();
		expirationMonth.setColumns(10);
		expirationMonth.setBounds(220, 207, 200, 19);
		frame.getContentPane().add(expirationMonth);
		
		JButton btnNewButton = new JButton("Deliver by car 2.");
		btnNewButton.setBackground(new Color(245, 245, 220));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TypeOfDelivery delivery = new TypeOfDelivery(new DeliveryByCar());
				typeOfPayment.pay(buildContact(), buildCard(), cart);
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
				typeOfPayment.pay(buildContact(), buildCard(), cart);
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
				cardNumber.setText("074482993658");
				securityNumber.setText("213");
				expirationDay.setText("25");
				expirationMonth.setText("9");
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
	
	private CardInformation buildCard() {
		
		CardInformation card = new CardInformation.Builder()
												  .cardNumber(cardNumber.getText())
												  .securityNumber(securityNumber.getText())
												  .expirationDay(expirationDay.getText())
												  .expirationMonth(expirationMonth.getText())
												  .build();
		
		return card;
	}
	
}
