package testing;

import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URISyntaxException;

public class HousingLogin {
	
	private JFrame frame;
	private JButton btnHousingLink;
	
	HousingLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 943, 685);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		
		JLabel lblNewLabel = new JLabel("User trying to login to student housing");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(10, 11, 766, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.) It is not done through MyNevada, a link is:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 87, 335, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		JButton btnHousingLink = new JButton("Link to housing application");
		btnHousingLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
				
				if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
					
					
					URI supportCenterLink = null;
					try {
						supportCenterLink = new URI("https://www.unr.edu/housing/resources/reslife-apply");
					} catch (URISyntaxException e1) {
						e1.printStackTrace();
					}
					
					try {
						desktop.browse(supportCenterLink);
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
		btnHousingLink.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHousingLink.setBounds(385, 87, 357, 44);
		frame.getContentPane().add(btnHousingLink);
		
		JLabel lblWhenYouGet = new JLabel("2.)When you get to the UNR website, scroll down and click on the blue link that says \"ONLINE HOUSING APPLICATION\"");
		lblWhenYouGet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWhenYouGet.setBounds(20, 154, 727, 44);
		frame.getContentPane().add(lblWhenYouGet);
		
		JLabel lblItIs = new JLabel("3.) It is likely NOT an NSHE ID logon, point the user to the text on the right with instructions on how to create an account");
		lblItIs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblItIs.setBounds(20, 209, 756, 44);
		frame.getContentPane().add(lblItIs);
		
		
		Icon Picture1 = new ImageIcon("lib/housing1.png");
		Icon Picture2 = new ImageIcon("lib/housing2.png");
		
		
		JLabel lblPicture1 = new JLabel("New label");
		lblPicture1.setBounds(47, 319, 308, 324);
		frame.getContentPane().add(lblPicture1);
		lblPicture1.setIcon(Picture1);
		
		JLabel lblNewLabel_2 = new JLabel("New Students");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(129, 264, 130, 44);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblReturningStudents = new JLabel("Returning Students");
		lblReturningStudents.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblReturningStudents.setBounds(531, 264, 170, 44);
		frame.getContentPane().add(lblReturningStudents);
		
		JLabel lblPicture2 = new JLabel("New label");
		lblPicture2.setIcon(Picture2);
		lblPicture2.setBounds(480, 311, 296, 115);
		frame.getContentPane().add(lblPicture2);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainWindow redirect = new MainWindow();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(711, 591, 206, 44);
		frame.getContentPane().add(btnNewButton);


	}
}