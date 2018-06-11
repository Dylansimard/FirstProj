package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CampusComputerLogin {
	
	private JFrame frame;
	private JButton btnNetIDReset;
	
	CampusComputerLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Campus computers use NetID and password to login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("If a user can't login, they need to have their NetID password reset");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 83, 736, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextPane txtpnAfterGettingThem = new JTextPane();
		txtpnAfterGettingThem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnAfterGettingThem.setText("After getting them a temporary password, they just need to login to the computer with their NetID and the temporary password, and it will prompt them to change their password");
		txtpnAfterGettingThem.setBackground(Color.LIGHT_GRAY);
		txtpnAfterGettingThem.setBounds(30, 125, 673, 199);
		txtpnAfterGettingThem.setEditable(false);
		frame.getContentPane().add(txtpnAfterGettingThem);
		
		btnNetIDReset = new JButton("NetID Reset");
		btnNetIDReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
				NetIDResetWindow redirect = new NetIDResetWindow();
			}
			
		});
		btnNetIDReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNetIDReset.setBounds(10, 439, 196, 50);
		frame.getContentPane().add(btnNetIDReset);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				MainWindow redirect = new MainWindow();
			}
		});
		btnMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMainMenu.setBounds(580, 439, 196, 50);
		frame.getContentPane().add(btnMainMenu);

	}
}
