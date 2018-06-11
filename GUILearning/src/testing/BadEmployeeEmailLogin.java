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

public class BadEmployeeEmailLogin {
	private JFrame frame;
	
	BadEmployeeEmailLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee emails are almost always NetID@unr.edu\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("The password will be the same as their NetID password as well");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 61, 756, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2.) If user is trying to login to the desktop application, try online at portal.office.com");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 275, 766, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("If that doesn't work, try in an incognito window");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(20, 309, 722, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnToIncognito = new JButton("Incognito Shortcuts");
		btnToIncognito.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				IncognitoShortcuts redirect = new IncognitoShortcuts();
			}
		});
		btnToIncognito.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnToIncognito.setBounds(373, 322, 269, 36);
		frame.getContentPane().add(btnToIncognito);
		
		JLabel lblVerifyThe = new JLabel("1.) Verify the user has an employee email\r\n");
		lblVerifyThe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVerifyThe.setBounds(10, 108, 766, 36);
		frame.getContentPane().add(lblVerifyThe);
		
		JLabel lblToDoThat = new JLabel("To do that, go to the security tool and look under account details. \r\n");
		lblToDoThat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblToDoThat.setBounds(20, 143, 722, 30);
		frame.getContentPane().add(lblToDoThat);
		
		JLabel lblIfAfterexchange = new JLabel("If after \"Exchange\" there is \"True\" then the user has an employee email");
		lblIfAfterexchange.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIfAfterexchange.setBounds(20, 172, 722, 30);
		frame.getContentPane().add(lblIfAfterexchange);
		
		JLabel lblIfItIs = new JLabel("If it is \"False\" and the user doesn't have a ticket in to get one created, start a ticket for the user");
		lblIfItIs.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIfItIs.setBounds(30, 205, 722, 30);
		frame.getContentPane().add(lblIfItIs);
		
		JLabel lblThereIs = new JLabel("There is template for it in footprints, instead of clicking new ticket, click \"New Employee Email/\"");
		lblThereIs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblThereIs.setBounds(40, 232, 722, 30);
		frame.getContentPane().add(lblThereIs);
		
		JLabel lblIfThe = new JLabel("3.) If the user still cannot login, reset the user's password\r\n");
		lblIfThe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIfThe.setBounds(10, 379, 766, 36);
		frame.getContentPane().add(lblIfThe);
		
		JButton btnNetIDReset = new JButton("NetID Password Reset");
		btnNetIDReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				NetIDResetWindow redirect = new NetIDResetWindow();
			}
		});
		btnNetIDReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNetIDReset.setBounds(30, 426, 240, 63);
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
		btnMainMenu.setBounds(545, 426, 231, 63);
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
		btnToSecurity.setBounds(468, 108, 262, 53);
		frame.getContentPane().add(btnToSecurity);
		
		
	}
}
