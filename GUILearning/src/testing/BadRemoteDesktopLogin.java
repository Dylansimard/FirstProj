package testing;

import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BadRemoteDesktopLogin {
	
	private JFrame frame;
	
	BadRemoteDesktopLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 584);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Remote Desktop uses a NetID login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Is the user on a Windows, Mac, or University computer?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 66, 464, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxWindows = new JCheckBox("Windows");
		JCheckBox chckbxMac = new JCheckBox("Mac");
		JCheckBox chckbxUniversity = new JCheckBox("University");
		JTextPane textPane = new JTextPane();
		JButton btnToWindowsWebsite = new JButton("To Website Instructions");
		JButton btnToMacWebsite = new JButton("To Website Instructions");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		chckbxWindows.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				btnToWindowsWebsite.setVisible(true);
				btnToMacWebsite.setVisible(false);
				textPane.setText("");
				textPane.setText("On a Windows machine, the user must go to \"remote.unr.edu\", they'll need to sign in, download the file, and then run it. When running it, they will need to enter their NetID" + 
				" in the form \"UNR\\NetID\" and then fill in the password");
				
				if(!chckbxWindows.isSelected()) {
					textPane.setText("");
					btnToWindowsWebsite.setVisible(false);
				}
				else if(chckbxMac.isSelected()) {
					chckbxMac.setSelected(false);
				}
				else if(chckbxUniversity.isSelected()) {
					chckbxUniversity.setSelected(false);
				}

			}
				
			
		});
		chckbxWindows.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxWindows.setBounds(30, 100, 114, 35);
		frame.getContentPane().add(chckbxWindows);
		
		
		chckbxMac.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textPane.setText("These instructions are for Microsoft Remote Desktop 8, not version 10\n\n"
						+ "On a mac, the user must download the Microsoft Remote Desktop app. It can be found in the app store, once downloaded"
						+ " they will need to click on Remote Resources in the top menu, they will need to enter the following credentials:"
						+ "\n\nURL: https://remote.unr.edu/RDWeb/feed/webfeed.aspx"
						+ "\nUser Name: Your NetID in the form of UNR\\NetID"
						+ "\nPassword: Your NetID password"
						+ "\n\nThen hit the refresh button, their desktop should be there");
				btnToMacWebsite.setVisible(true);
				btnToWindowsWebsite.setVisible(false);
				
				if(!chckbxMac.isSelected()) {
					btnToWindowsWebsite.setVisible(false);
					btnToMacWebsite.setVisible(false);
					textPane.setText("");
				}
				else if(chckbxWindows.isSelected()) {
					chckbxWindows.setSelected(false);
				}
				else if(chckbxUniversity.isSelected()) {
					chckbxUniversity.setSelected(false);
				}
			}			
		});
		chckbxMac.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxMac.setBounds(181, 100, 114, 35);
		frame.getContentPane().add(chckbxMac);
		
		
		chckbxUniversity.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textPane.setText("On a University machine (verify if windows still, if mac go to mac instructions), the user must go to \"remote.unr.edu\", they'll need to sign in, download the file, and then run it. When running it, they will need to enter their NetID" + 
				" in the form \"UNR\\NetID\" and then fill in the password");
				btnToWindowsWebsite.setVisible(true);
				btnToMacWebsite.setVisible(false);
				
				if(!chckbxUniversity.isSelected()) {
					btnToWindowsWebsite.setVisible(false);
					textPane.setText("");
				}
				
				else if(chckbxWindows.isSelected()) {
					chckbxWindows.setSelected(false);
				}
				
				else if(chckbxMac.isSelected()) {
					chckbxMac.setSelected(false);
				}
			}
		});
		chckbxUniversity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxUniversity.setBounds(338, 100, 114, 35);
		frame.getContentPane().add(chckbxUniversity);
		
		
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(20, 152, 464, 175);
		frame.getContentPane().add(textPane);
		
		btnToWindowsWebsite.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
				if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
					URI eduWebsiteLink = null;
					try {
						eduWebsiteLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/remote-services/website-connection/");
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
		btnToWindowsWebsite.setVisible(false);
		btnToWindowsWebsite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnToWindowsWebsite.setBounds(521, 141, 255, 49);
		frame.getContentPane().add(btnToWindowsWebsite);
		
		
		btnToMacWebsite.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
				if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
					URI eduWebsiteLink = null;
					try {
						eduWebsiteLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/remote-services/remote-application-connections/macosx/");
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
		btnToMacWebsite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnToMacWebsite.setBounds(521, 209, 255, 49);
		btnToMacWebsite.setVisible(false);
		frame.getContentPane().add(btnToMacWebsite);
		
		JLabel lblIfTheUser = new JLabel("If the user is still unable to login, verify they have an active NetID and that their password");
		lblIfTheUser.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIfTheUser.setBounds(10, 359, 766, 27);
		frame.getContentPane().add(lblIfTheUser);
		
		JLabel lblTheir = new JLabel("isn't expired.");
		lblTheir.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTheir.setBounds(10, 384, 766, 27);
		frame.getContentPane().add(lblTheir);
		
		JLabel lblNewLabel_2 = new JLabel("If still unable to login, reset the users NetID password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 410, 740, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNetIDReset = new JButton("NetID Reset");
		btnNetIDReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				NetIDResetWindow redirect = new NetIDResetWindow();
			}
		});
		btnNetIDReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNetIDReset.setBounds(10, 448, 205, 41);
		frame.getContentPane().add(btnNetIDReset);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MainWindow redirect = new MainWindow();
			}
		});
		btnMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMainMenu.setBounds(571, 448, 205, 41);
		frame.getContentPane().add(btnMainMenu);
		

		
		JLabel lblNewLabel_21 = new JLabel("(Note) If a user recently changed their password, they may be locked out");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_21.setBounds(10, 500, 449, 39);
		frame.getContentPane().add(lblNewLabel_21);
		
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
