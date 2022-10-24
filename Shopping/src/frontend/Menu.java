package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import cart.items.Cart;
import cart.items.Item;
import delivery.DeliveryByDrone;
import payment.PayInCash;
import payment.PayInGold;
import payment.PayWithCreditCard;
import payment.PayWithDebitCard;
import payment.TypeOfPayment;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;

public class Menu implements Items {

	private JFrame frame;
	private static JTextField name1;
	private static JTextField price1;
	private static JTextField itemCount1;
	private static JTextField name2;
	private static JTextField price2;
	private static JTextField itemCount2;
	private static JTextField name3;
	private static JTextField price3;
	private static JTextField itemCount3;
	private static JTextField totalItemCount;

	/**
	 * Launch the application.
	 */
	public static void openWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 613, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		name1 = new JTextField();
		price1 = new JTextField();
		name2 = new JTextField();
		price2 = new JTextField();
		name3 = new JTextField();
		price3 = new JTextField();
		
		refresh();
		
		
		name1.setBounds(10, 10, 251, 25);
		frame.getContentPane().add(name1);
		name1.setColumns(16);
		
		JButton btnNewButton = new JButton("Add 2.");
		btnNewButton.setBackground(new Color(245, 245, 220));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(itemsInOffer.size() > 0) {
				cart.add(itemsInOffer.get(0));
				String incrementByOne = String.valueOf(1 + Integer.parseInt(itemCount1.getText()));
				String incrementByOneTotal = String.valueOf(1 + Integer.parseInt(totalItemCount.getText()));
				itemCount1.setText(incrementByOne);
				totalItemCount.setText(incrementByOneTotal);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 8));
		btnNewButton.setBounds(10, 64, 123, 35);
		frame.getContentPane().add(btnNewButton);
		
		
		price1.setColumns(16);
		price1.setBounds(10, 37, 251, 25);
		frame.getContentPane().add(price1);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cart.getCart().size() > 0 && cart.getNumOfItems().get(0) > 0) {
				cart.remove(itemsInOffer.get(0));
				String decrementByOne = String.valueOf(Integer.parseInt(itemCount1.getText())-1);
				String decrementByOneTotal = String.valueOf(Integer.parseInt(totalItemCount.getText())-1);
				itemCount1.setText(decrementByOne);
				totalItemCount.setText(decrementByOneTotal);
				}
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnRemove.setBounds(138, 63, 123, 35);
		frame.getContentPane().add(btnRemove);
		
		itemCount1 = new JTextField();
		itemCount1.setText("0");
		itemCount1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		itemCount1.setBounds(268, 10, 58, 52);
		frame.getContentPane().add(itemCount1);
		itemCount1.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < cart.getNumOfItems().size(); i++) {
					if(cart.getCart().get(i).equals(itemsInOffer.get(0))) {
				cart.getNumOfItems().set(i, 0);
					}
				}
				
				String totalDecrement =  String.valueOf(Integer.parseInt(totalItemCount.getText())-Integer.parseInt(itemCount1.getText()));
				totalItemCount.setText(totalDecrement);
				itemCount1.setText("0");
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnClear.setBounds(268, 64, 58, 35);
		frame.getContentPane().add(btnClear);
		
		name2.setColumns(16);
		name2.setBounds(10, 99, 251, 25);
		frame.getContentPane().add(name2);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(itemsInOffer.size() > 1) {
					cart.add(itemsInOffer.get(1));
					String incrementByOne = String.valueOf(1 + Integer.parseInt(itemCount2.getText()));
					String incrementByOneTotal = String.valueOf(1 + Integer.parseInt(totalItemCount.getText()));
					itemCount2.setText(incrementByOne);
					totalItemCount.setText(incrementByOneTotal);
					}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1.setBounds(10, 153, 123, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		price2.setColumns(16);
		price2.setBounds(10, 126, 251, 25);
		frame.getContentPane().add(price2);
		
		JButton btnRemove_1 = new JButton("Remove");
		btnRemove_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cart.getCart().size() > 1 && cart.getNumOfItems().get(1) > 0) {
					cart.remove(itemsInOffer.get(1));
					String decrementByOne = String.valueOf(Integer.parseInt(itemCount2.getText())-1);
					String decrementByOneTotal = String.valueOf(Integer.parseInt(totalItemCount.getText())-1);
					itemCount2.setText(decrementByOne);
					totalItemCount.setText(decrementByOneTotal);
			}
			}
		});
		btnRemove_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnRemove_1.setBounds(138, 152, 123, 35);
		frame.getContentPane().add(btnRemove_1);
		
		itemCount2 = new JTextField();
		itemCount2.setText("0");
		itemCount2.setFont(new Font("Tahoma", Font.PLAIN, 36));
		itemCount2.setColumns(10);
		itemCount2.setBounds(268, 99, 58, 52);
		frame.getContentPane().add(itemCount2);
		
		JButton btnClear_1 = new JButton("Clear");
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < cart.getNumOfItems().size(); i++) {
					if(cart.getCart().get(i).equals(itemsInOffer.get(1))) {
				cart.getNumOfItems().set(i, 0);
					}
				}
				String totalDecrement =  String.valueOf(Integer.parseInt(totalItemCount.getText())-Integer.parseInt(itemCount2.getText()));
				totalItemCount.setText(totalDecrement);
				itemCount2.setText("0");
			}
		});
		btnClear_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnClear_1.setBounds(268, 153, 58, 35);
		frame.getContentPane().add(btnClear_1);
		
		name3.setColumns(16);
		name3.setBounds(10, 190, 251, 25);
		frame.getContentPane().add(name3);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(itemsInOffer.size() > 2) {
					cart.add(itemsInOffer.get(2));
					String incrementByOne = String.valueOf(1 + Integer.parseInt(itemCount3.getText()));
					String incrementByOneTotal = String.valueOf(1 + Integer.parseInt(totalItemCount.getText()));
					itemCount3.setText(incrementByOne);
					totalItemCount.setText(incrementByOneTotal);
					}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_2.setBounds(10, 244, 123, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		price3.setColumns(16);
		price3.setBounds(10, 217, 251, 25);
		frame.getContentPane().add(price3);
		
		JButton btnRemove_2 = new JButton("Remove");
		btnRemove_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cart.getCart().size() > 2 && cart.getNumOfItems().get(2) > 0) {
					cart.remove(itemsInOffer.get(2));
					String decrementByOne = String.valueOf(Integer.parseInt(itemCount3.getText())-1);
					String decrementByOneTotal = String.valueOf(Integer.parseInt(totalItemCount.getText())-1);
					itemCount3.setText(decrementByOne);
					totalItemCount.setText(decrementByOneTotal);
				}
			}
		});
		btnRemove_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnRemove_2.setBounds(138, 243, 123, 35);
		frame.getContentPane().add(btnRemove_2);
		
		itemCount3 = new JTextField();
		itemCount3.setText("0");
		itemCount3.setFont(new Font("Tahoma", Font.PLAIN, 36));
		itemCount3.setColumns(10);
		itemCount3.setBounds(268, 190, 58, 52);
		frame.getContentPane().add(itemCount3);
		
		JButton btnClear_2 = new JButton("Clear");
		btnClear_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < cart.getNumOfItems().size(); i++) {
					if(cart.getCart().get(i).equals(itemsInOffer.get(2))) {
				cart.getNumOfItems().remove(i);
				cart.getCart().remove(i);
					}
				}
				String totalDecrement =  String.valueOf(Integer.parseInt(totalItemCount.getText())-Integer.parseInt(itemCount3.getText()));
				totalItemCount.setText(totalDecrement);
				itemCount3.setText("0");
			}
		});
		btnClear_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnClear_2.setBounds(268, 244, 58, 35);
		frame.getContentPane().add(btnClear_2);
		
		JLabel lblNewLabel = new JLabel("Items in cart total");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(336, 8, 123, 25);
		frame.getContentPane().add(lblNewLabel);
		
		totalItemCount = new JTextField();
		totalItemCount.setText("0");
		totalItemCount.setFont(new Font("Tahoma", Font.PLAIN, 36));
		totalItemCount.setBounds(336, 40, 58, 52);
		frame.getContentPane().add(totalItemCount);
		totalItemCount.setColumns(10);
		
		JButton btnNewButton_3_3 = new JButton("Pay in gold");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PayPersonaly.setTypeOfPayment((new TypeOfPayment(new PayInGold())));
				PayPersonaly.openWindow();
			}
		});
		btnNewButton_3_3.setBounds(328, 243, 131, 35);
		frame.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_3_3_1 = new JButton("Pay in cash");
		btnNewButton_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PayPersonaly.setTypeOfPayment((new TypeOfPayment(new PayInCash())));
				PayPersonaly.openWindow();
			}
		});
		btnNewButton_3_3_1.setBounds(328, 207, 131, 35);
		frame.getContentPane().add(btnNewButton_3_3_1);
		
		JButton btnNewButton_3_3_2 = new JButton("Pay by creditcard 3.");
		btnNewButton_3_3_2.setForeground(Color.BLACK);
		btnNewButton_3_3_2.setFont(new Font("Tahoma", Font.ITALIC, 10));
		btnNewButton_3_3_2.setBackground(new Color(245, 245, 220));
		btnNewButton_3_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PayWithCard.setTypeOfPayment((new TypeOfPayment(new PayWithCreditCard())));
				PayWithCard.openWindow();
			}
		});
		btnNewButton_3_3_2.setBounds(328, 138, 131, 35);
		frame.getContentPane().add(btnNewButton_3_3_2);
		
		JButton btnNewButton_3_3_3 = new JButton("Pay by debitcard");
		btnNewButton_3_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PayWithCard.setTypeOfPayment((new TypeOfPayment(new PayWithDebitCard())));
				PayWithCard.openWindow();
			}
		});
		btnNewButton_3_3_3.setBounds(328, 173, 131, 35);
		frame.getContentPane().add(btnNewButton_3_3_3);
		
		JLabel lblNewLabel_1 = new JLabel("Select payment method");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(336, 99, 123, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Change product offer");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(469, 99, 123, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_3_3_2_1 = new JButton("Default offer 1.");
		btnNewButton_3_3_2_1.setFont(new Font("Tahoma", Font.ITALIC, 10));
		btnNewButton_3_3_2_1.setForeground(new Color(0, 0, 0));
		btnNewButton_3_3_2_1.setBackground(new Color(245, 245, 220));
		btnNewButton_3_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defaultOffer();
				refresh();
				frame.dispose();
				openWindow();
			}
		});
		btnNewButton_3_3_2_1.setBounds(461, 243, 131, 35);
		frame.getContentPane().add(btnNewButton_3_3_2_1);
		
		JButton btnNewButton_3_3_2_2 = new JButton("Clear offer");
		btnNewButton_3_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemsInOffer.clear();
				refresh();
				frame.dispose();
				openWindow();
			}
		});
		btnNewButton_3_3_2_2.setBounds(461, 207, 131, 35);
		frame.getContentPane().add(btnNewButton_3_3_2_2);
		
		JButton btnNewButton_3_3_2_3 = new JButton("Remove item");
		btnNewButton_3_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RemoveItem.openWindow();
			}
		});
		btnNewButton_3_3_2_3.setBounds(461, 173, 131, 35);
		frame.getContentPane().add(btnNewButton_3_3_2_3);
		
		JButton btnNewButton_3_3_2_4 = new JButton("Add item");
		btnNewButton_3_3_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AddItem.openWindow();
			}
		});
		btnNewButton_3_3_2_4.setBounds(461, 138, 131, 35);
		frame.getContentPane().add(btnNewButton_3_3_2_4);
		
		JButton btnNewButton_3 = new JButton("Clear all");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(cart.getCart().get(0).getName());
				cart.clear();
				itemCount1.setText("0");
				itemCount2.setText("0");
				itemCount3.setText("0");
				totalItemCount.setText("0");
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(404, 39, 188, 53);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("(Use it before shopping)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(469, 126, 123, 13);
		frame.getContentPane().add(lblNewLabel_2);
	}
	
	private static void refresh() {
		if(itemsInOffer.size() > 0) {
		name1.setText(itemsInOffer.get(0).getName());
		price1.setText(itemsInOffer.get(0).getPrice());
		}
		if(itemsInOffer.size() > 1) {
			name2.setText(itemsInOffer.get(1).getName());
			price2.setText(itemsInOffer.get(1).getPrice());
			}
		if(itemsInOffer.size() > 2) {
			name3.setText(itemsInOffer.get(2).getName());
			price3.setText(itemsInOffer.get(2).getPrice());
			}
	}
	
	private static void defaultOffer() {
		Item firstItem = new Item("Rock hammer", "59.50");
		Item secondItem = new Item("Chizel", "19.50");
		Item thirdItem = new Item("Shovel", "35.00");
		itemsInOffer.add(firstItem);
		itemsInOffer.add(secondItem);
		itemsInOffer.add(thirdItem);
	}
}
