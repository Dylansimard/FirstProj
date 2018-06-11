package testing;

import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URISyntaxException;

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
		
		JLabel lblVerifyThat = new JLabel("2.) Verify that the user has the correct roles and groups in the security tool");
		lblVerifyThat.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVerifyThat.setBounds(20, 151, 726, 34);
		frame.getContentPane().add(lblVerifyThat);
		
		JLabel lblTheGroupNeeded = new JLabel("The group needed is \"mg_WRKDAY_LOGIN\" and the role is \"WRKDAY_LOGIN\"");
		lblTheGroupNeeded.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTheGroupNeeded.setBounds(30, 186, 583, 34);
		frame.getContentPane().add(lblTheGroupNeeded);
		
		JLabel lblTryIn = new JLabel("3.) Try in an incognito tab");
		lblTryIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				IncognitoShortcuts redirect = new IncognitoShortcuts();
			}
		});
		lblTryIn.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTryIn.setBounds(20, 242, 726, 34);
		frame.getContentPane().add(lblTryIn);
		
		JButton btnNewButton = new JButton("Incognito Shortcuts");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(269, 242, 230, 31);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblAskA = new JLabel("4.) Ask a pro to check if the user is locked out of WorkDay");
		lblAskA.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAskA.setBounds(20, 302, 726, 34);
		frame.getContentPane().add(lblAskA);
		
		JLabel lblResetThe = new JLabel("5.) Reset the users NetID password");
		lblResetThe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResetThe.setBounds(20, 361, 726, 34);
		frame.getContentPane().add(lblResetThe);
		
		JButton btnNetIDReset = new JButton("NetID Reset");
		btnNetIDReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.dispose();
			NetIDResetWindow redirect = new NetIDResetWindow();
			}
		});
		btnNetIDReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNetIDReset.setBounds(20, 424, 253, 65);
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
		btnMainMenu.setBounds(523, 424, 253, 65);
		frame.getContentPane().add(btnMainMenu);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
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
		btnToSecurity.setBounds(463, 105, 262, 32);
		frame.getContentPane().add(btnToSecurity);
		
		
	}
}
