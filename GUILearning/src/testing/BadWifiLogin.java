package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class BadWifiLogin {
	private JFrame frame;
	
	BadWifiLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("There are two seperate Wifi networks available");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxEduroam = new JCheckBox("Eduroam");
		JCheckBox chckbxUnrGuest = new JCheckBox("UNR Guest");
		JLabel lblUseIndicator = new JLabel("");
		
		
		chckbxEduroam.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblUseIndicator.setText("Eduroam is for user's with a NetID");
				if(!chckbxEduroam.isSelected()) {
					lblUseIndicator.setText("");
				}
				if(chckbxUnrGuest.isSelected()) {
					chckbxUnrGuest.setSelected(false);
				}
				
			}
		});
		chckbxEduroam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxEduroam.setBounds(10, 97, 183, 47);
		frame.getContentPane().add(chckbxEduroam);
		
		
		chckbxUnrGuest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblUseIndicator.setText("The guest network is for people who are here temporarily, that don't have NetID's");
				if(!chckbxUnrGuest.isSelected()) {
					lblUseIndicator.setText("");
				}
				if(chckbxEduroam.isSelected()) {
					chckbxEduroam.setSelected(false);
				}
				
			}
		});
		chckbxUnrGuest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxUnrGuest.setBounds(259, 97, 183, 47);
		frame.getContentPane().add(chckbxUnrGuest);
		
		JLabel lblNewLabel_1 = new JLabel("Which is the user trying to sign into?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 58, 650, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		lblUseIndicator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUseIndicator.setBounds(10, 150, 766, 32);
		frame.getContentPane().add(lblUseIndicator);
		
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
