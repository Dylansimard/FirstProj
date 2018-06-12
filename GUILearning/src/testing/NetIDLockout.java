package testing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NetIDLockout {
	private JFrame frame;
	
	NetIDLockout(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("The users NetID may be locked");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your NetID will be locked if you have incorrectly used it 4 times");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 71, 756, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("However the lockout only lasts 10 minutes");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(30, 100, 722, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblLockoutsOccurOften = new JLabel("Lockout's occur often when a user has just changed their NetID password");
		lblLockoutsOccurOften.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLockoutsOccurOften.setBounds(20, 151, 756, 30);
		frame.getContentPane().add(lblLockoutsOccurOften);
		
		JLabel lblTheMostFrequent = new JLabel("The most frequent cause is a user was connected to the wifi before they changed their password");
		lblTheMostFrequent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTheMostFrequent.setBounds(30, 181, 722, 30);
		frame.getContentPane().add(lblTheMostFrequent);
		
		JLabel lblToSolveThis = new JLabel("To solve this, have the user disconnect from the wifi on all of their devices");
		lblToSolveThis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblToSolveThis.setBounds(30, 208, 722, 30);
		frame.getContentPane().add(lblToSolveThis);
		
		JLabel lblIfTheUser = new JLabel("If the user is still having issues signing in, ask a pro to see if they are locked out and which device");
		lblIfTheUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIfTheUser.setBounds(20, 267, 756, 30);
		frame.getContentPane().add(lblIfTheUser);
		
		JLabel lblIsLockingThe = new JLabel("is locking the user out");
		lblIsLockingThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIsLockingThe.setBounds(20, 298, 756, 30);
		frame.getContentPane().add(lblIsLockingThe);

		
		JButton btnNewButton = new JButton("NetID Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NetIDResetWindow redirect = new NetIDResetWindow();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(592, 369, 184, 49);
		frame.getContentPane().add(btnNewButton);
		
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
