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

public class MyNevadaBadLoginInit {
	
	private JFrame frame;
	private boolean isApplicantChecked = false;
	private boolean isNSHEChecked = false;
	private boolean isNetIDChecked = false;
	
	MyNevadaBadLoginInit(){
		initialize();
	}
	
	void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		JLabel lblHeader1 = new JLabel("There are 3 possible logins, NSHE ID, NetID, and Applicant ID\r\n");
		lblHeader1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblHeader1.setBounds(10, 11, 766, 69);
		frame.getContentPane().add(lblHeader1);
		
		JLabel lblHeader2 = new JLabel("Which are they using?");
		lblHeader2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblHeader2.setBounds(20, 62, 263, 49);
		frame.getContentPane().add(lblHeader2);
		
		
		
		//checkbox declarations
		JCheckBox chckbxApplicant = new JCheckBox("Applicant ID");
		JCheckBox chckbxNSHE = new JCheckBox("NSHE ID");
		JCheckBox chckbxNetID = new JCheckBox("NetID");
		
		//label declarations
		JLabel lblApplicantEX = new JLabel("ex: Johnsmith123");
		JLabel lblApplicantMessage = new JLabel("Used when the user hasn't recieved an NSHE ID");
		JLabel lblNSHEEX = new JLabel("ex: 8000646852");
		JLabel lblNSHEMessage1 = new JLabel("Used by future students, current students, and alumni");
		JLabel lblNSHEMessage2 = new JLabel("Normally begins with 8000, 1000, or 5000");
		JLabel lblNetIDEX = new JLabel("ex: johnsmith, or jsmith");
		JLabel lblNetIDMessage = new JLabel("Can be used by future or current students");
		JLabel lblError = new JLabel("Please select one of the options");
		
		
		//function for checking applicant id
		//verifies that applicant ID is the only one checked,
		//and shows/hides applicable message.
		chckbxApplicant.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(isApplicantChecked) {
					isApplicantChecked = false;
					lblApplicantEX.setVisible(false);
					lblApplicantMessage.setVisible(false);
				}
				
				else {
					if(isNSHEChecked) {
						isNSHEChecked = false;
						chckbxNSHE.setSelected(false);
						lblNSHEEX.setVisible(false);
						lblNSHEMessage1.setVisible(false);
						lblNSHEMessage2.setVisible(false);
					}
					else if(isNetIDChecked) {
						chckbxNetID.setSelected(false);
						isNetIDChecked = false;
						lblNetIDEX.setVisible(false);
						lblNetIDMessage.setVisible(false);
					}
					isApplicantChecked = true;
					lblApplicantEX.setVisible(true);
					lblApplicantMessage.setVisible(true);
					lblError.setVisible(false);
				}
			}
			
		});
		chckbxApplicant.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxApplicant.setBounds(20, 147, 166, 49);
		frame.getContentPane().add(chckbxApplicant);
		
		
		
		//function for checking NSHE id
		//verifies that NSHE ID is the only one checked,
		//and shows/hides applicable message.
		chckbxNSHE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(isNSHEChecked) {
					isNSHEChecked = false;
					
					lblNSHEEX.setVisible(false);
					lblNSHEMessage1.setVisible(false);
					lblNSHEMessage2.setVisible(false);
				}
				
				else {
					if(isApplicantChecked) {
						isApplicantChecked = false;
						chckbxApplicant.setSelected(false);
						
						lblApplicantEX.setVisible(false);
						lblApplicantMessage.setVisible(false);
					}
					else if(isNetIDChecked) {
						isNetIDChecked = false;
						chckbxNetID.setSelected(false);
						
						lblNetIDEX.setVisible(false);
						lblNetIDMessage.setVisible(false);
					}
					
					isNSHEChecked = true;
					lblNSHEEX.setVisible(true);
					lblNSHEMessage1.setVisible(true);
					lblNSHEMessage2.setVisible(true);
					lblError.setVisible(false);
				}
			}
		});
		chckbxNSHE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNSHE.setBounds(20, 255, 166, 49);
		frame.getContentPane().add(chckbxNSHE);
		
		
		
		chckbxNetID.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(isNetIDChecked) {
					isNetIDChecked = false;
					
					lblNetIDEX.setVisible(false);
					lblNetIDMessage.setVisible(false);
				}
				
				else {
					if(isApplicantChecked) {
						isApplicantChecked = false;
						chckbxApplicant.setSelected(false);
						
						lblApplicantEX.setVisible(false);
						lblApplicantMessage.setVisible(false);
					}
					else if(isNSHEChecked) {
						isNSHEChecked = false;
						chckbxNSHE.setSelected(false);
						
						lblNSHEEX.setVisible(false);
						lblNSHEMessage1.setVisible(false);
						lblNSHEMessage2.setVisible(false);
					}
					isNetIDChecked = true;
					lblNetIDEX.setVisible(true);
					lblNetIDMessage.setVisible(true);
					lblError.setVisible(false);
				}
				
			}
			
		});
		chckbxNetID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNetID.setBounds(20, 384, 166, 49);
		frame.getContentPane().add(chckbxNetID);
		
		
		
		lblApplicantEX.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblApplicantEX.setBounds(30, 193, 156, 49);
		frame.getContentPane().add(lblApplicantEX);
		lblApplicantEX.setVisible(false);
		
		
		
		lblApplicantMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblApplicantMessage.setBounds(289, 116, 427, 111);
		frame.getContentPane().add(lblApplicantMessage);
		lblApplicantMessage.setVisible(false);
		
		
		
		lblNSHEEX.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNSHEEX.setBounds(30, 311, 156, 49);
		frame.getContentPane().add(lblNSHEEX);
		lblNSHEEX.setVisible(false);
		
		
		
		lblNSHEMessage1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNSHEMessage1.setBounds(289, 249, 480, 61);
		frame.getContentPane().add(lblNSHEMessage1);
		lblNSHEMessage1.setVisible(false);
		
		
		
		lblNSHEMessage2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNSHEMessage2.setBounds(289, 289, 480, 61);
		frame.getContentPane().add(lblNSHEMessage2);
		lblNSHEMessage2.setVisible(false);
		
		
		
		lblNetIDEX.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNetIDEX.setBounds(30, 440, 195, 49);
		frame.getContentPane().add(lblNetIDEX);
		lblNetIDEX.setVisible(false);
		
		
		
		lblNetIDMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNetIDMessage.setBounds(289, 378, 480, 61);
		frame.getContentPane().add(lblNetIDMessage);
		lblNetIDMessage.setVisible(false);
		

		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(isApplicantChecked) {
					frame.dispose();	
					MyNevadaApplicationID redirect = new MyNevadaApplicationID();
				}
				else if(isNSHEChecked) {
					frame.dispose();
					MyNevadaNSHEID redirect = new MyNevadaNSHEID();
				}
				else if(isNetIDChecked) {
					frame.dispose();
					MyNevadaNetID redirect = new MyNevadaNetID();
				}
				else {
					lblError.setVisible(true);
				}
				
			}
		});
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnContinue.setBounds(544, 440, 232, 38);
		frame.getContentPane().add(btnContinue);
		
		
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblError.setBounds(544, 470, 232, 33);
		frame.getContentPane().add(lblError);
		lblError.setVisible(false);
		

		
		
		
	}
}
