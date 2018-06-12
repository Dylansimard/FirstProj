package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class WifiGuest {
	private JFrame frame;
	
	WifiGuest(){
		initialize();
	}
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("The guest wifi is for users who do not have a NetID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.) To log into it, users will need to connect to it, and then fill out email and phone number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 69, 756, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTheUser = new JLabel("2.) The user will recieve an email containing the password\r\n");
		lblTheUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTheUser.setBounds(20, 117, 756, 25);
		frame.getContentPane().add(lblTheUser);
		
		JLabel lblTheyWill = new JLabel("3.) They will use their email address as a username, and the password they recieve to login\r\n");
		lblTheyWill.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTheyWill.setBounds(20, 168, 756, 25);
		frame.getContentPane().add(lblTheyWill);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
