package testing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;

public class MyNevadaNSHEID {
	
	private JFrame frame;
	
	private boolean isStudentChecked = false;
	private boolean isProfessorChecked = false;
	
	MyNevadaNSHEID(){
		initialize();
	}

	void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("MyNevada Issues signing in with NSHE ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(10, 11, 766, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.) Has the user activated their NSHE ID?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 75, 756, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblIfTheyAre = new JLabel("If they are unsure, ask them to try to activate again by searching MyNevada for \"Activate My NSHE ID\"");
		lblIfTheyAre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIfTheyAre.setBounds(30, 109, 756, 23);
		frame.getContentPane().add(lblIfTheyAre);
		
		JLabel lblIsThe = new JLabel("2.) Is the user a student or professor?");
		lblIsThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIsThe.setBounds(20, 219, 756, 23);
		frame.getContentPane().add(lblIsThe);
		
		
		
		JCheckBox chckbxStudent = new JCheckBox("Student");
		JCheckBox chckbxProfessor = new JCheckBox("Professor");
		
		JTextPane textPaneMessage = new JTextPane();
		textPaneMessage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		
		
		chckbxStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isStudentChecked) {
					isStudentChecked = false;
					textPaneMessage.setText("");
				}
				else {
					if(isProfessorChecked) {
						isProfessorChecked = false;
						chckbxProfessor.setSelected(false);
					}
					isStudentChecked = true;
					textPaneMessage.setText("Try in an incognito window");
				}
			}
			
		});
		chckbxStudent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxStudent.setBounds(30, 249, 124, 42);
		frame.getContentPane().add(chckbxStudent);
		
		chckbxProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isProfessorChecked) {
					isProfessorChecked = false;
					chckbxProfessor.setSelected(false);
				}
				else {
					if(isStudentChecked) {
						isStudentChecked = false;
						chckbxStudent.setSelected(false);
					}
					isProfessorChecked = true;
					textPaneMessage.setText("Verify that Professor has completed FERPA training in WebCampus. If they have, try in an incognito window");
				}
			}
		});
		chckbxProfessor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxProfessor.setBounds(185, 249, 124, 42);
		frame.getContentPane().add(chckbxProfessor);
		
		
		textPaneMessage.setBackground(Color.LIGHT_GRAY);
		textPaneMessage.setBounds(30, 322, 279, 107);
		frame.getContentPane().add(textPaneMessage);
		
		JLabel lblTheyNeedTo = new JLabel("They need to enter their first and last name, DOB, and last 4 of SSN");
		lblTheyNeedTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTheyNeedTo.setBounds(40, 142, 756, 23);
		frame.getContentPane().add(lblTheyNeedTo);
		
		JLabel lblIfItIsnt = new JLabel("If it isn't activated, it will allow them to create a password. If it is, it will show them some of their information");
		lblIfItIsnt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIfItIsnt.setBounds(50, 176, 756, 23);
		frame.getContentPane().add(lblIfItIsnt);
		
		JButton btnNewButton = new JButton("Incognito Shortcuts");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				IncognitoShortcuts redirect = new IncognitoShortcuts();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(30, 440, 279, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainWindow redirect = new MainWindow();
			}
		});
		btnMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMainMenu.setBounds(497, 440, 279, 49);
		frame.getContentPane().add(btnMainMenu);

		

				
	}
}
