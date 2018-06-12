package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BadStudentEmailLogin {
	private JFrame frame;
	
	BadStudentEmailLogin(){
		initialize();
	}
	
	void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student emails are seperate from all other accounts!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.) Student emails are Gmail accounts, users will go to gmail.com to login");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 75, 714, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblToCreateOne = new JLabel("To create one, just search MyNevada for \"Student Email\" and the first link will take them to a page to start the process\r\n");
		lblToCreateOne.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblToCreateOne.setBounds(30, 109, 734, 34);
		frame.getContentPane().add(lblToCreateOne);
		
		JLabel lblToChangeThe = new JLabel("3.) To change the password, the next link after \"Student Campus Email\" will allow them to");
		lblToChangeThe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblToChangeThe.setBounds(20, 378, 756, 34);
		frame.getContentPane().add(lblToChangeThe);
		
		JLabel lblTheLinkIs = new JLabel("The link is titled \"Student Campus Email Password Reset\"");
		lblTheLinkIs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTheLinkIs.setBounds(30, 413, 714, 34);
		frame.getContentPane().add(lblTheLinkIs);
		
		JLabel lblIfWhenAttempting = new JLabel("2.) If when attempting to create one they get an error, they likely already have one\r\n");
		lblIfWhenAttempting.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIfWhenAttempting.setBounds(20, 166, 714, 34);
		frame.getContentPane().add(lblIfWhenAttempting);
		
		JLabel lblToSeeWhat = new JLabel("To see what the email is, search \"student center\" in the MyNevada search bar, and click on\r\n \"Student Center\"");
		lblToSeeWhat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblToSeeWhat.setBounds(30, 200, 714, 34);
		frame.getContentPane().add(lblToSeeWhat);
		
		JLabel lblInStudentCenter = new JLabel("Log in, and then in student center, click on \"Home\" in the top right hand corner\r\n");
		lblInStudentCenter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInStudentCenter.setBounds(40, 232, 714, 34);
		frame.getContentPane().add(lblInStudentCenter);
		
		JLabel lblThenClickOn = new JLabel("Then click on the first BLUE link that says \"Your Account\"");
		lblThenClickOn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblThenClickOn.setBounds(50, 264, 714, 34);
		frame.getContentPane().add(lblThenClickOn);
		
		JLabel lblInyourAccount = new JLabel("In \"Your Account\", their email will be listed under the blue heading titled \"Campus Email\"");
		lblInyourAccount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInyourAccount.setBounds(60, 295, 714, 34);
		frame.getContentPane().add(lblInyourAccount);
		
		JLabel lblUsersCanAlso = new JLabel("User's can also change their campus email password here, or they could do the next step.");
		lblUsersCanAlso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsersCanAlso.setBounds(70, 328, 714, 34);
		frame.getContentPane().add(lblUsersCanAlso);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainWindow redirect = new MainWindow();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(583, 436, 193, 53);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
