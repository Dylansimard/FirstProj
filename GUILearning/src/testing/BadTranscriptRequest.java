package testing;

import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class BadTranscriptRequest {
	private JFrame frame;
	
	 BadTranscriptRequest(){
		 initialize();
	 }
	 
	 void initialize() {
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.LIGHT_GRAY);
			frame.getContentPane().setLayout(null);
			frame.setBounds(100, 100, 802, 539);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
			JLabel lblNewLabel = new JLabel("Is it an unofficial or official transcript request?");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblNewLabel.setBounds(10, 11, 766, 51);
			frame.getContentPane().add(lblNewLabel);
			
			JCheckBox chckbxUnofficial = new JCheckBox("Unofficial");
			JCheckBox chckbxOfficial = new JCheckBox("Official");
			
			JButton btnFirefox = new JButton("Disable Popups in Firefox");
			JButton btnSafari = new JButton("Disable Popups in Safari");
			JButton btnChrome = new JButton("Disable Popups in Chrome");
			
			JTextPane textPane = new JTextPane();
			textPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			
			chckbxUnofficial.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxOfficial.isSelected()) {
						chckbxOfficial.setSelected(false);
					}
					if(chckbxUnofficial.isSelected()) {
						textPane.setText("User's can do this through MyNevada, the process is:"
								+ "\n\n1.) Go to MyNevada and search \"Unofficial transcript request\""
										+ "\n\n2.) Click on the link that says \"Unofficial Transcript Request\", then the user will then be prompted to login"
										+ "\n\n3.) Select \"University of Nevada, Reno\", and then \"Unofficial Transcript\""
										+ "\n\n3.) They will then be redirected to a page where they will see the report. If they click"
										+ " on it and a transcript doesn't pop up, they will need to disable pop-ups in their browser"
										+ "\n(note) the safari link shows how to do it in all browsers on a mac");
						
						btnChrome.setVisible(true);
						btnFirefox.setVisible(true);
						btnSafari.setVisible(true);
					}
					else {
						textPane.setText("");
						btnChrome.setVisible(false);
						btnFirefox.setVisible(false);
						btnSafari.setVisible(false);
					}
				}
			});
			chckbxUnofficial.setFont(new Font("Tahoma", Font.PLAIN, 20));
			chckbxUnofficial.setBounds(20, 69, 157, 42);
			frame.getContentPane().add(chckbxUnofficial);
			
			
			chckbxOfficial.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxUnofficial.isSelected()) {
						chckbxUnofficial.setSelected(false);
						btnChrome.setVisible(false);
						btnFirefox.setVisible(false);
						btnSafari.setVisible(false);
					}
					if(chckbxOfficial.isSelected()) {
						textPane.setText("1.) Verify the user is on the correct site, it should say \"Academic Central\" at the top"
								+ "\n\n2.) Verify the user has an active NetID in the security tool and their password hasn't expired"
								+ "\n\n3.) Verify the user isn't using any capital letters when typing in their NetID"
								+ "\n\n4.) If the user is still unable to login, tell them to email \"transcriptrequests@unr.edu\" and they will give them access"
								+ "\n(note) the text to the right explains they need to email them to get verified." );
					}
					else {
						textPane.setText("");
					}
				}
			});
			chckbxOfficial.setFont(new Font("Tahoma", Font.PLAIN, 20));
			chckbxOfficial.setBounds(222, 69, 157, 42);
			frame.getContentPane().add(chckbxOfficial);
			
			JButton btnNewButton = new JButton("General transcript request info");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						URI eduWebsiteLink = null;
						try {
							eduWebsiteLink = new URI("https://www.unr.edu/academic-central/forms-and-policies/forms/transcripts");
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
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setBounds(457, 69, 319, 42);
			frame.getContentPane().add(btnNewButton);
			
			textPane.setEditable(false);
			textPane.setBackground(Color.LIGHT_GRAY);
			textPane.setBounds(21, 136, 755, 190);
			frame.getContentPane().add(textPane);
			
			
			btnChrome.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						URI eduWebsiteLink = null;
						try {
							eduWebsiteLink = new URI("https://support.google.com/chrome/answer/95472?co=GENIE.Platform%3DDesktop&hl=en");
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
			btnChrome.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnChrome.setBounds(20, 341, 288, 42);
			frame.getContentPane().add(btnChrome);
			btnChrome.setVisible(false);
			
			
			btnFirefox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						URI eduWebsiteLink = null;
						try {
							eduWebsiteLink = new URI("https://www.lifewire.com/disable-popup-blocker-firefox-1259171");
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
			btnFirefox.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnFirefox.setBounds(20, 394, 288, 42);
			frame.getContentPane().add(btnFirefox);
			btnFirefox.setVisible(false);
			
			
			btnSafari.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						URI eduWebsiteLink = null;
						try {
							eduWebsiteLink = new URI("https://www.digitaltrends.com/computing/how-to-allow-pop-ups-on-a-mac/");
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
			btnSafari.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSafari.setBounds(20, 447, 288, 42);
			frame.getContentPane().add(btnSafari);
			btnSafari.setVisible(false);
			
			JButton btnNewButton1 = new JButton("NetID Reset");
			btnNewButton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					NetIDResetWindow redirect = new NetIDResetWindow();
				}
			});
			btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton1.setBounds(592, 369, 184, 49);
			frame.getContentPane().add(btnNewButton1);
			
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

	 }
}
