package testing;

import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URISyntaxException;

public class WifiAndroid {
	private JFrame frame;
	
	WifiAndroid(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel lblWifiOnAn = new JLabel("Wifi on an Android uses a NetID login");
		lblWifiOnAn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWifiOnAn.setBounds(10, 11, 766, 40);
		frame.getContentPane().add(lblWifiOnAn);
		
		JLabel lblNewLabel = new JLabel("1.) Verify they are active in the security tool and their password hasn't expired");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 62, 756, 28);
		frame.getContentPane().add(lblNewLabel);

		
		JButton btnToSecurity = new JButton("To Security Website");
		btnToSecurity.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
				if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
					URI eduWebsiteLink = null;
					try {
						eduWebsiteLink = new URI("https://security.unr.edu/");
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
		btnToSecurity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnToSecurity.setBounds(501, 101, 262, 32);
		frame.getContentPane().add(btnToSecurity);
		
		JLabel lblVerifyThey = new JLabel("2.) Verify they can log into something with their NetID, if they can't, reset their password");
		lblVerifyThey.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVerifyThey.setBounds(20, 160, 756, 28);
		frame.getContentPane().add(lblVerifyThey);
		
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
		
		JLabel lblFollowThe = new JLabel("3.) Follow the instructions below to help get them connected");
		lblFollowThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFollowThe.setBounds(20, 228, 756, 28);
		frame.getContentPane().add(lblFollowThe);
		
		JButton btnNewButton_1 = new JButton("Instructions");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
				if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
					URI eduWebsiteLink = null;
					try {
						eduWebsiteLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/wireless-access/eduroam/connecting-to-eduroam-on-mobile-devices/connecting-to-eduroam-android-mobile-devices-android/");
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
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(20, 267, 200, 58);
		frame.getContentPane().add(btnNewButton_1);
	}
}
