package testing;

import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class WifiMac {
	private JFrame frame;
	
	WifiMac(){
		initialize();
	}

	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 584);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel lblWifiOnMacs = new JLabel("Wifi on a Mac uses a NetID login");
		lblWifiOnMacs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWifiOnMacs.setBounds(10, 11, 766, 40);
		frame.getContentPane().add(lblWifiOnMacs);
		
		JLabel lblNewLabel = new JLabel("1.) Has the user been logged into the Wifi previously?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 62, 756, 31);
		frame.getContentPane().add(lblNewLabel);
		
		
		JCheckBox chckbxYes = new JCheckBox("Yes");
		JCheckBox chckbxNo = new JCheckBox("No");
		
		JLabel label1 = new JLabel("");
		JLabel lblStillNotWorking = new JLabel("Still not working? Verify user can login using NetID on the security tool");
		JLabel lblNewLabel_1 = new JLabel("If they are able to, remove the network driver, instructions below");
		
		JButton btnInstructions1 = new JButton("Instructions");
		JButton btnInstructions2 = new JButton("Instructions");
		

		
		
		chckbxYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNo.isSelected()) {
					chckbxNo.setSelected(false);
				}
				if(chckbxYes.isSelected()) {
					label1.setText("Remove the network and then re-add it, instructions below");
					btnInstructions1.setVisible(true);
					btnInstructions2.setVisible(true);
					lblStillNotWorking.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else {
					label1.setText("");					
					chckbxYes.setSelected(false);
					btnInstructions1.setVisible(false);
					btnInstructions2.setVisible(false);
					lblStillNotWorking.setVisible(false);
					lblNewLabel_1.setVisible(false);
				}
			}
		});
		chckbxYes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxYes.setBounds(30, 100, 123, 40);
		frame.getContentPane().add(chckbxYes);
		
		
		chckbxNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxYes.isSelected()) {
					chckbxYes.setSelected(false);
				}
				if(chckbxNo.isSelected()) {
					label1.setText("Verify user can log in to something else with their NetID, if not, reset their password");
					btnInstructions1.setVisible(false);
					btnInstructions2.setVisible(false);
					lblStillNotWorking.setVisible(false);
					lblNewLabel_1.setVisible(false);
					
				}
				else {
					chckbxNo.setSelected(false);
					btnInstructions1.setVisible(false);
					btnInstructions2.setVisible(false);
					lblStillNotWorking.setVisible(false);
					label1.setText("");
					lblNewLabel_1.setVisible(false);
				}
			}
		});
		chckbxNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNo.setBounds(240, 100, 123, 40);
		frame.getContentPane().add(chckbxNo);
		
		
		JButton btnNewButton = new JButton("NetID Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NetIDResetWindow redirect = new NetIDResetWindow();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(592, 369, 184, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainWindow redirect = new MainWindow();
			}
		});
		btnMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMainMenu.setBounds(592, 439, 184, 49);
		frame.getContentPane().add(btnMainMenu);
		
		
		label1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label1.setBounds(30, 161, 756, 31);
		frame.getContentPane().add(label1);
		
		
		btnInstructions1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
				if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
					URI eduWebsiteLink = null;
					try {
						eduWebsiteLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/wireless-access/wireless-troubleshooting/wireless-troubleshooting-for-mac/");
					}
					catch(URISyntaxException e1) {
						e1.printStackTrace();
					}
					try {
						desktop.browse(eduWebsiteLink);
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
		btnInstructions1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnInstructions1.setBounds(30, 214, 165, 56);
		frame.getContentPane().add(btnInstructions1);
		btnInstructions1.setVisible(false);
		
		
		
		lblStillNotWorking.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStillNotWorking.setBounds(20, 310, 756, 31);
		lblStillNotWorking.setVisible(false);
		frame.getContentPane().add(lblStillNotWorking);
		
		
		
		btnInstructions2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
				if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
					URI eduWebsiteLink = null;
					try {
						eduWebsiteLink = new URI("https://kb.wisc.edu/helpdesk/page.php?id=26681");
					}
					catch(URISyntaxException e1) {
						e1.printStackTrace();
					}
					try {
						desktop.browse(eduWebsiteLink);
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
		btnInstructions2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnInstructions2.setBounds(30, 402, 165, 56);
		btnInstructions2.setVisible(false);
		frame.getContentPane().add(btnInstructions2);
		
		
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 352, 505, 28);
		lblNewLabel_1.setVisible(false);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("(Note) If a user recently changed their password, they may be locked out");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 500, 449, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnLockoutInfo = new JButton("Lockout Info");
		btnLockoutInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NetIDLockout redirect = new NetIDLockout();
			}
		});
		btnLockoutInfo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLockoutInfo.setBounds(469, 500, 153, 39);
		frame.getContentPane().add(btnLockoutInfo);

		

	}
}

