package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveItem implements Items{

	private JFrame frame;
	private static JTextField remove2;
	private static JTextField remove3;
	private static JTextField remove1;

	/**
	 * Launch the application.
	 */
	public static void openWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveItem window = new RemoveItem();
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
	public RemoveItem() {
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
		
		remove2 = new JTextField();
		remove3 = new JTextField();
		remove1 = new JTextField();
		
		refresh();
		
		remove2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		remove2.setColumns(10);
		remove2.setBounds(154, 92, 272, 34);
		frame.getContentPane().add(remove2);
		
		JButton btnRemove_1 = new JButton("Remove");
		btnRemove_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(itemsInOffer.size() > 1) {
					itemsInOffer.remove(1);
					refresh();
					frame.dispose();
					openWindow();
					} else {
				JOptionPane.showMessageDialog(null, "There is no item!");
					}
				
			}
		});
		btnRemove_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRemove_1.setBounds(154, 130, 272, 34);
		frame.getContentPane().add(btnRemove_1);
		
		
		remove3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		remove3.setColumns(10);
		remove3.setBounds(154, 174, 272, 34);
		frame.getContentPane().add(remove3);
		
		JButton btnRemove_2 = new JButton("Remove");
		btnRemove_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(itemsInOffer.size() > 2) {
					itemsInOffer.remove(2);
					refresh();
					frame.dispose();
					openWindow();
					} else {
				JOptionPane.showMessageDialog(null, "There is no item!");
					}
				
			}
		});
		btnRemove_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRemove_2.setBounds(154, 212, 272, 34);
		frame.getContentPane().add(btnRemove_2);
		
		
		remove1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		remove1.setColumns(10);
		remove1.setBounds(154, 10, 272, 34);
		frame.getContentPane().add(remove1);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(itemsInOffer.size() > 0) {
					itemsInOffer.remove(0);
					refresh();
					frame.dispose();
					openWindow();
					} else {
				JOptionPane.showMessageDialog(null, "There is no item!");
					}
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRemove.setBounds(154, 48, 272, 34);
		frame.getContentPane().add(btnRemove);
		
		JLabel lblNewLabel = new JLabel("Item to remove");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 136, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Item to remove");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 92, 136, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Item to remove");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 174, 136, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Menu.openWindow();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(10, 212, 124, 34);
		frame.getContentPane().add(btnNewButton);
	}
	
	private void refresh() {
		if(itemsInOffer.size() > 0) {
			remove1.setText(itemsInOffer.get(0).getName());
			}
		if(itemsInOffer.size() > 1) {
			remove2.setText(itemsInOffer.get(1).getName());
			}
		if(itemsInOffer.size() > 2) {
			remove3.setText(itemsInOffer.get(2).getName());
			}
	}
}
