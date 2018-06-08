package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class BadWorkdayLogin {
	private JFrame frame;
	
	BadWorkdayLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Workday can only be logged onto with a Netid");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.) Verify that the user has an active NetID in the security tool");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 72, 726, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Verify that the user's password isn't expired");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(30, 106, 583, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblVerifyThat = new JLabel("2.) Verify that the user has the correct roles and groups");
		lblVerifyThat.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVerifyThat.setBounds(20, 151, 726, 34);
		frame.getContentPane().add(lblVerifyThat);
		
		JLabel lblTheGroupNeeded = new JLabel("The group needed is \"mg_WRKDAY_LOGIN\" and the role is \"WRKDAY_LOGIN\"");
		lblTheGroupNeeded.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTheGroupNeeded.setBounds(30, 186, 583, 34);
		frame.getContentPane().add(lblTheGroupNeeded);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
