package testing;

import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

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
		frame.setBounds(100, 100, 802, 539);
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
		btnHousingLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
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
		
		
		JLabel lblPicture1 = new JLabel("New label");
		lblPicture1.setBounds(30, 263, 267, 226);
		frame.getContentPane().add(lblPicture1);
		
		lblPicture1.setIcon(Picture1);


	}
}