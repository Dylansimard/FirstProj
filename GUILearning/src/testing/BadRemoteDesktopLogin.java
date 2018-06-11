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

public class BadRemoteDesktopLogin {
	
	private JFrame frame;
	
	BadRemoteDesktopLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
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
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		chckbxWindows.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("On a Windows machine, the user must go to \"remote.unr.edu\", they'll need to sign in, download the file, and then run it. When running it, they will need to enter their NetID" + 
				" in the form \"UNR\\NetID\" and then fill in the password");
				btnToWindowsWebsite.setVisible(true);
			
				
				if(!chckbxWindows.isSelected()) {
					textPane.setText("");
					btnToWindowsWebsite.setVisible(false);
				}
				else if(chckbxMac.isSelected()) {
					chckbxMac.setSelected(false);
					textPane.setText("");
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
				if(!chckbxMac.isSelected()) {
					btnToWindowsWebsite.setVisible(false);
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
				if(!chckbxUniversity.isSelected()) {
					btnToWindowsWebsite.setVisible(false);
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
		textPane.setBounds(20, 152, 464, 124);
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
		btnToWindowsWebsite.setBounds(521, 152, 255, 49);
		frame.getContentPane().add(btnToWindowsWebsite);
		
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
