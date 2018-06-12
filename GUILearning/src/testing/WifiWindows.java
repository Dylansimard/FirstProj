package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class WifiWindows {
	private JFrame frame;
	
	WifiWindows(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wifi on Windows uses a NetID login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.) Which version of Windows are they using?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 62, 756, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxWin7 = new JCheckBox("Windows 7");
		JCheckBox chckbxWin8 = new JCheckBox("Windows 8");
		JCheckBox chckbxWin10 = new JCheckBox("Windows 10");
		JCheckBox chckbxNo = new JCheckBox("No");
		JCheckBox chckbxYes = new JCheckBox("Yes\r\n");

		JLabel lblVerifyTheUser = new JLabel("Verify the user can use their NetID and password elsewhere, if not, reset their password");
		
		chckbxWin7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxWin8.isSelected()) {
					chckbxWin8.setSelected(false);
				}
				
				if(chckbxWin10.isSelected()) {
					chckbxWin10.setSelected(false);
				}
				
				if(chckbxWin7.isSelected()) {
					
				}
				else {
					chckbxWin7.setSelected(false);
				}
			}
		});
		chckbxWin7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxWin7.setBounds(30, 98, 144, 40);
		frame.getContentPane().add(chckbxWin7);
		
		
		chckbxWin8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxWin10.isSelected()) {
					chckbxWin10.setSelected(false);
				}
				
				if(chckbxWin7.isSelected()) {
					chckbxWin7.setSelected(false);
				}
				
				if(chckbxWin8.isSelected()) {
					
				}
				else {
					chckbxWin8.setSelected(false);
				}
			}
		});
		chckbxWin8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxWin8.setBounds(235, 97, 144, 40);
		frame.getContentPane().add(chckbxWin8);
		
		
		chckbxWin10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxWin7.isSelected()) {
					chckbxWin7.setSelected(false);
				}
				
				if(chckbxWin8.isSelected()) {
					chckbxWin8.setSelected(false);
				}
				
				if(chckbxWin10.isSelected()) {
					
				}
				else {
					chckbxWin10.setSelected(false);
				}
				
			}
		});
		chckbxWin10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxWin10.setBounds(450, 97, 144, 40);
		frame.getContentPane().add(chckbxWin10);
		
		JLabel lblHaveThey = new JLabel("2.) Have they been connected to the wifi previously?\r\n");
		lblHaveThey.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHaveThey.setBounds(20, 169, 756, 28);
		frame.getContentPane().add(lblHaveThey);
		
		
		
		chckbxYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNo.isSelected()) {
					chckbxNo.setSelected(false);
					lblVerifyTheUser.setVisible(false);
				}
				if(chckbxYes.isSelected()) {
					
				}
				else {
					chckbxYes.setSelected(false);
				}
			}
		});
		chckbxYes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxYes.setBounds(30, 204, 144, 40);
		frame.getContentPane().add(chckbxYes);
		
		
		chckbxNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxYes.isSelected()) {
					chckbxYes.setSelected(false);
				}
				if(chckbxNo.isSelected()) {
					lblVerifyTheUser.setVisible(true);
				}
				else {
					chckbxNo.setSelected(false);
					lblVerifyTheUser.setVisible(false);
				}
			}
		});
		chckbxNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNo.setBounds(235, 204, 144, 40);
		frame.getContentPane().add(chckbxNo);
		
		
		lblVerifyTheUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVerifyTheUser.setBounds(30, 263, 756, 28);
		frame.getContentPane().add(lblVerifyTheUser);
		lblVerifyTheUser.setVisible(false);
		
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
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}	