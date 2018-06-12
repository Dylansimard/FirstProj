package testing;

import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JTextPane;

public class BadBoxLogin {
	
	private JFrame frame;
	
	
	BadBoxLogin(){
		initialize();
	}
	
	void initialize() {
		//initializing frame
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 584);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//Header label
		JLabel lblHeader = new JLabel("Box.unr.edu uses a NetID login");
		lblHeader.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHeader.setBounds(10, 11, 766, 57);
		frame.getContentPane().add(lblHeader);
		
		//first message label
		JLabel lblNewLabel_1 = new JLabel("1.) Is the user a student, employee, or both? (Verify in the security tool)\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 61, 735, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		//textbox declarations
		JCheckBox chckbxStudent = new JCheckBox("Student");
		JCheckBox chckbxEmployee = new JCheckBox("Employee");
		JCheckBox chckbxBoth = new JCheckBox("Both");
		JTextPane textPaneMessage = new JTextPane();
		
		//textpane declaration
		textPaneMessage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		//button declaratoin
		JButton btnStudentEmail = new JButton("Student Email Info");
		
		
		//implementation of student checkbox
		//sets the message, and verifies only one option is checked
		chckbxStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxEmployee.isSelected()) {
					chckbxEmployee.setSelected(false);
				}
				else if(chckbxBoth.isSelected()) {
					chckbxBoth.setSelected(false);	
				}
				if(chckbxStudent.isSelected()) {
					textPaneMessage.setText("Verify that the user has a student email, if they have a student tag in the security tool, it is required.");
					btnStudentEmail.setVisible(true);
				}
				else {
					textPaneMessage.setText("");
					btnStudentEmail.setVisible(false);
				}
				
			}
			
		});
		chckbxStudent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxStudent.setBounds(30, 97, 141, 39);
		frame.getContentPane().add(chckbxStudent);
		
		
		//implementation of Employee checkbox
		//sets the message, and verifies only one option is checked
		chckbxEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxStudent.isSelected()) {
					chckbxStudent.setSelected(false);
				}
				else if(chckbxBoth.isSelected()) {
					chckbxBoth.setSelected(false);
				}
				if(chckbxEmployee.isSelected()) {
					textPaneMessage.setText("Follow steps below");
					btnStudentEmail.setVisible(false);
				}
				else{
					textPaneMessage.setText("");
				}
			}
		});
		chckbxEmployee.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxEmployee.setBounds(206, 97, 141, 39);
		frame.getContentPane().add(chckbxEmployee);
		
		
		//implementation of Both checkbox
		//sets the message, and verifies only one option is checked
		chckbxBoth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxStudent.isSelected()) {
					chckbxStudent.setSelected(false);
				}
				else if(chckbxEmployee.isSelected()) {
					chckbxEmployee.setSelected(false);
				}
				if(chckbxBoth.isSelected()) {
					textPaneMessage.setText("Verify that the user has a student email, if they have a student tag in the security tool, it is required.");
					btnStudentEmail.setVisible(true);
				}
				else {
					textPaneMessage.setText("");
					btnStudentEmail.setVisible(false);
				}
			}
		});
		chckbxBoth.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxBoth.setBounds(384, 97, 141, 39);
		frame.getContentPane().add(chckbxBoth);
		
		
		//declaration and implementation of the next label
		JLabel lblHaveThe = new JLabel("2.) Have the user try in an incognito tab, if it still doesn't work, reset NetID password\r\n");
		lblHaveThe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHaveThe.setBounds(20, 348, 735, 39);
		frame.getContentPane().add(lblHaveThe);
		
		
		//implementation of the button redirect to incognito shortcuts page
		JButton btnIncognitoShortcuts = new JButton("Incognito Shortcuts");
		btnIncognitoShortcuts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				IncognitoShortcuts redirect = new IncognitoShortcuts();
			}
		});
		btnIncognitoShortcuts.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIncognitoShortcuts.setBounds(30, 398, 225, 45);
		frame.getContentPane().add(btnIncognitoShortcuts);
		
		
		//implementation of the button redirect to NetID reset page
		JButton btnNetidReset = new JButton("NetID Reset");
		btnNetidReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NetIDResetWindow redirect = new NetIDResetWindow();	
			}
			
		});
		btnNetidReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNetidReset.setBounds(279, 398, 225, 45);
		frame.getContentPane().add(btnNetidReset);
		
		
		//implementation of the text pane
		textPaneMessage.setBackground(Color.LIGHT_GRAY);
		textPaneMessage.setBounds(40, 173, 485, 164);
		frame.getContentPane().add(textPaneMessage);
		
		
		//implementation of the button redirect to the student email page
		btnStudentEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				BadStudentEmailLogin redirect = new BadStudentEmailLogin();
			}
		});
		btnStudentEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnStudentEmail.setBounds(564, 221, 212, 57);
		frame.getContentPane().add(btnStudentEmail);
		btnStudentEmail.setVisible(false);
		
		
		//implementation of the button redirect to the main menu
		JButton btnMainmenu = new JButton("Main Menu");
		btnMainmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainWindow redirect = new MainWindow();
			}
		});
		btnMainmenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMainmenu.setBounds(530, 398, 225, 45);
		frame.getContentPane().add(btnMainmenu);
		
		
		//implementation of the button redirect to the security website
		JButton btnToSecurity = new JButton("To Security Website");
		btnToSecurity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		btnToSecurity.setBounds(514, 27, 262, 32);
		frame.getContentPane().add(btnToSecurity);
		
		
		//implementation of bottom label
		JLabel lblNewLabel_2 = new JLabel("(Note) If a user recently changed their password, they may be locked out");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 500, 449, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		//implementation of button redirect to lockout page
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
