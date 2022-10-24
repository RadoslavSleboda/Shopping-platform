package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import cart.items.Cart;
import cart.items.Item;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddItem implements Items {

	private JFrame frame;
	private JTextField name;
	private JTextField price;

	/**
	 * Launch the application.
	 */
	public static void openWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddItem window = new AddItem();
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
	public AddItem() {
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
		
		JLabel lblNewLabel = new JLabel("Add new item to offer");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel.setBounds(10, 10, 416, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name of new item");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(10, 68, 216, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 22));
		name.setBounds(10, 105, 311, 33);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name of new item");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(10, 149, 216, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		price = new JTextField();
		price.setFont(new Font("Tahoma", Font.PLAIN, 22));
		price.setColumns(10);
		price.setBounds(10, 183, 311, 33);
		frame.getContentPane().add(price);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(itemsInOffer.size() < 3) {
				Item newItem = new Item(name.getText(), price.getText());
				itemsInOffer.add(newItem);
				JOptionPane.showMessageDialog(null, "Item "+ newItem.getName()+" was sucessfuly added!");
				} else {
					JOptionPane.showMessageDialog(null, "You cant add another item!");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(10, 226, 311, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Menu.openWindow();
			}
		});
		btnNewButton_1.setBounds(331, 226, 95, 29);
		frame.getContentPane().add(btnNewButton_1);
	}

}
