package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;

public class BadBoxLogin {
	
	private JFrame frame;
	
	
	BadBoxLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Box.unr.edu uses a NetID login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.) Is the user a student, employee, or both? (Verify in the security tool)\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 61, 735, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
		JCheckBox chckbxStudent = new JCheckBox("Student");
		JCheckBox chckbxEmployee = new JCheckBox("Employee");
		JCheckBox chckbxBoth = new JCheckBox("Both");
		JTextPane textPaneMessage = new JTextPane();
		textPaneMessage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JButton btnStudentEmail = new JButton("Student Email Info");
		
		chckbxStudent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxEmployee.isSelected()) {
					chckbxEmployee.setSelected(false);
				}
				else if(chckbxBoth.isSelected()) {
					chckbxBoth.setSelected(false);	
				}
				textPaneMessage.setText("Verify that the user has a student email, if they have a student tag in the security tool, it is required.");
				btnStudentEmail.setVisible(true);
			}
			
		});
		chckbxStudent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxStudent.setBounds(30, 97, 141, 39);
		frame.getContentPane().add(chckbxStudent);
		
		
		chckbxEmployee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxStudent.isSelected()) {
					chckbxStudent.setSelected(false);
				}
				else if(chckbxBoth.isSelected()) {
					chckbxBoth.setSelected(false);
				}
				textPaneMessage.setText("Follow steps below");
				btnStudentEmail.setVisible(false);
			}
		});
		chckbxEmployee.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxEmployee.setBounds(206, 97, 141, 39);
		frame.getContentPane().add(chckbxEmployee);
		
		
		chckbxBoth.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxStudent.isSelected()) {
					chckbxStudent.setSelected(false);
				}
				else if(chckbxEmployee.isSelected()) {
					chckbxEmployee.setSelected(false);
				}
				textPaneMessage.setText("Verify that the user has a student email, if they have a student tag in the security tool, it is required.");
				btnStudentEmail.setVisible(true);
			}
			
		});
		chckbxBoth.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxBoth.setBounds(384, 97, 141, 39);
		frame.getContentPane().add(chckbxBoth);
		
		JLabel lblHaveThe = new JLabel("2.) Have the user try in an incognito tab, if it still doesn't work, reset NetID password\r\n");
		lblHaveThe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHaveThe.setBounds(20, 348, 735, 39);
		frame.getContentPane().add(lblHaveThe);
		
		JButton btnIncognitoShortcuts = new JButton("Incognito Shortcuts");
		btnIncognitoShortcuts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				IncognitoShortcuts redirect = new IncognitoShortcuts();
			}
		});
		btnIncognitoShortcuts.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIncognitoShortcuts.setBounds(30, 398, 225, 45);
		frame.getContentPane().add(btnIncognitoShortcuts);
		
		JButton btnNetidReset = new JButton("NetID Reset");
		btnNetidReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NetIDResetWindow redirect = new NetIDResetWindow();	
			}
			
		});
		btnNetidReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNetidReset.setBounds(279, 398, 225, 45);
		frame.getContentPane().add(btnNetidReset);
		
		
		textPaneMessage.setBackground(Color.LIGHT_GRAY);
		textPaneMessage.setBounds(40, 173, 485, 164);
		frame.getContentPane().add(textPaneMessage);
		
		
		btnStudentEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				BadStudentEmailLogin redirect = new BadStudentEmailLogin();
			}
		});
		btnStudentEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnStudentEmail.setBounds(564, 221, 212, 57);
		frame.getContentPane().add(btnStudentEmail);
		
		JButton btnMainmenu = new JButton("Main Menu");
		btnMainmenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MainWindow redirect = new MainWindow();
			}
		});
		
		btnMainmenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMainmenu.setBounds(530, 398, 225, 45);
		frame.getContentPane().add(btnMainmenu);
		btnStudentEmail.setVisible(false);

	}
}
