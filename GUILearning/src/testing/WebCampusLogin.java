package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WebCampusLogin {
	
	private JFrame frame;
	
	WebCampusLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("WebCampus can only be logged onto with netID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(10, 11, 766, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.) Verify user has an active netID in the security tool");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 72, 331, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblVerifyUsers = new JLabel("2.) Verify user's password hasn't expired");
		lblVerifyUsers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVerifyUsers.setBounds(20, 104, 331, 32);
		frame.getContentPane().add(lblVerifyUsers);
		
		JLabel lblIfBothAre = new JLabel("If both are true, and user is confident they know their password, try in a private window");
		lblIfBothAre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIfBothAre.setBounds(20, 140, 549, 32);
		frame.getContentPane().add(lblIfBothAre);
		
		JLabel lblForInstructionsGet = new JLabel("For instructions, get OS and Browser");
		lblForInstructionsGet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblForInstructionsGet.setBounds(20, 170, 290, 32);
		frame.getContentPane().add(lblForInstructionsGet);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Windows");
		chckbxNewCheckBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}
		});
		
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(30, 209, 114, 37);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		
		
		JCheckBox chckbxMac = new JCheckBox("Mac");
		chckbxMac.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxMac.setBounds(168, 209, 114, 37);
		frame.getContentPane().add(chckbxMac);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Safari");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox_1.setBounds(96, 259, 114, 37);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxChrome = new JCheckBox("Chrome");
		chckbxChrome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxChrome.setBounds(96, 313, 114, 37);
		frame.getContentPane().add(chckbxChrome);
		
		JCheckBox chckbxFirefox = new JCheckBox("Firefox");
		chckbxFirefox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxFirefox.setBounds(96, 366, 114, 37);
		frame.getContentPane().add(chckbxFirefox);
		
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
