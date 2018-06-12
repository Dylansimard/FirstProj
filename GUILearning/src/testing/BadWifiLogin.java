package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class BadWifiLogin {
	private JFrame frame;
	
	BadWifiLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("There are two seperate Wifi networks available");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 766, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxEduroam = new JCheckBox("Eduroam");
		JCheckBox chckbxUnrGuest = new JCheckBox("UNR Guest");
		JLabel lblUseIndicator = new JLabel("");
		JCheckBox chckbxComputer = new JCheckBox("Computer\r\n");
		JCheckBox chckbxPhone = new JCheckBox("Phone");
		JCheckBox chckbxIOSIphone = new JCheckBox("IOS (Iphone)");
		JCheckBox chckbxAndroid = new JCheckBox("Android");
		JCheckBox chckbxWindows = new JCheckBox("Windows");
		JCheckBox chckbxOsxmac = new JCheckBox("OSX (Mac)");
		JLabel lblError = new JLabel("Not a valid option");
		
		chckbxEduroam.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblUseIndicator.setText("Eduroam is for user's with a NetID");
				if(!chckbxEduroam.isSelected()) {
					lblUseIndicator.setText("");
				}
				if(chckbxUnrGuest.isSelected()) {
					chckbxUnrGuest.setSelected(false);
				}
				
			}
		});
		chckbxEduroam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxEduroam.setBounds(10, 97, 183, 47);
		frame.getContentPane().add(chckbxEduroam);
		
		
		chckbxUnrGuest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblUseIndicator.setText("The guest network is for people who are here temporarily, that don't have NetID's");
				
				if(!chckbxUnrGuest.isSelected()) {
					lblUseIndicator.setText("");
				}
				if(chckbxEduroam.isSelected()) {
					chckbxEduroam.setSelected(false);
				}
				
			}
		});
		chckbxUnrGuest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxUnrGuest.setBounds(259, 97, 183, 47);
		frame.getContentPane().add(chckbxUnrGuest);
		
		JLabel lblNewLabel_1 = new JLabel("1.) Which is the user trying to sign into?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 58, 650, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		lblUseIndicator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUseIndicator.setBounds(10, 150, 766, 32);
		frame.getContentPane().add(lblUseIndicator);
		
		JLabel lblWhatDevice = new JLabel("2.) What device is the user on?\r\n");
		lblWhatDevice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWhatDevice.setBounds(10, 192, 650, 32);
		frame.getContentPane().add(lblWhatDevice);
		
		chckbxComputer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxComputer.isSelected()) {
					chckbxPhone.setSelected(false);
					
					chckbxOsxmac.setVisible(true);
					chckbxOsxmac.setSelected(false);
					
					chckbxWindows.setVisible(true);
					chckbxWindows.setSelected(false);
					
					chckbxAndroid.setVisible(false);
					chckbxAndroid.setSelected(false);
					
					chckbxIOSIphone.setVisible(false);
					chckbxIOSIphone.setSelected(false);
					
				}
				else {
					chckbxOsxmac.setSelected(false);
					chckbxOsxmac.setVisible(false);
					
					chckbxWindows.setSelected(false);
					chckbxWindows.setVisible(false);
				}

			}
		});
		chckbxComputer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxComputer.setBounds(10, 231, 183, 47);
		frame.getContentPane().add(chckbxComputer);
		
		chckbxPhone.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if(chckbxPhone.isSelected()) {
					chckbxComputer.setSelected(false);
					
					chckbxAndroid.setVisible(true);
					chckbxAndroid.setSelected(false);
					
					chckbxIOSIphone.setVisible(true);
					chckbxIOSIphone.setSelected(false);
					
					chckbxOsxmac.setSelected(false);
					chckbxOsxmac.setVisible(false);
					
					chckbxWindows.setSelected(false);
					chckbxWindows.setVisible(false);
					
					
				}
				
				else {
					chckbxAndroid.setVisible(false);
					chckbxAndroid.setSelected(false);
					
					chckbxIOSIphone.setVisible(false);
					chckbxIOSIphone.setSelected(false);
				}
			
			}
		});
		chckbxPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxPhone.setBounds(259, 231, 183, 47);
		frame.getContentPane().add(chckbxPhone);
		
		JLabel lblWhatIs = new JLabel("3.) What is the operating system of the device?");
		lblWhatIs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWhatIs.setBounds(10, 308, 650, 32);
		frame.getContentPane().add(lblWhatIs);
		
		
		chckbxIOSIphone.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxAndroid.isSelected()) {
					chckbxAndroid.setSelected(false);
				}
			}
		});
		chckbxIOSIphone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxIOSIphone.setBounds(259, 347, 183, 47);
		frame.getContentPane().add(chckbxIOSIphone);
		chckbxIOSIphone.setVisible(false);
		
		chckbxAndroid.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxIOSIphone.isSelected()) {
					chckbxIOSIphone.setSelected(false);
				}
			}
		});
		chckbxAndroid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxAndroid.setBounds(10, 347, 183, 47);
		frame.getContentPane().add(chckbxAndroid);
		chckbxAndroid.setVisible(false);
		
		
		chckbxWindows.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		chckbxWindows.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxWindows.setBounds(10, 425, 183, 47);
		frame.getContentPane().add(chckbxWindows);
		chckbxWindows.setVisible(false);
		
		
		chckbxOsxmac.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		chckbxOsxmac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxOsxmac.setBounds(259, 425, 183, 47);
		frame.getContentPane().add(chckbxOsxmac);
		chckbxOsxmac.setVisible(false);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxUnrGuest.isSelected()) {
					frame.dispose();
					WifiGuest redirect = new WifiGuest();
				}
				else if(chckbxEduroam.isSelected()) {
					if(chckbxComputer.isSelected()) {
						if(chckbxWindows.isSelected()) {
							frame.dispose();
							WifiWindows redirect = new WifiWindows();
						}
						else if(chckbxOsxmac.isSelected()){
							frame.dispose();
							WifiMac redirect = new WifiMac();
						}
					}
					else if(chckbxPhone.isSelected()) {
						if(chckbxAndroid.isSelected()) {
							frame.dispose();
							WifiAndroid redirect = new WifiAndroid();
						}
						else if(chckbxIOSIphone.isSelected()) {
							frame.dispose();
							WifiIphone redirect = new WifiIphone();
						}
					}
				}
				lblError.setVisible(true);
			}
		});
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnContinue.setBounds(593, 423, 183, 66);
		frame.getContentPane().add(btnContinue);
		
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblError.setBounds(593, 380, 183, 32);
		frame.getContentPane().add(lblError);
		lblError.setVisible(false);
		
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
