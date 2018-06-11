package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

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
		
		chckbxComputer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(chckbxPhone.isSelected()) {
					chckbxPhone.setSelected(false);
					chckbxIOSIphone.setVisible(false);
					chckbxAndroid.setVisible(false);
					chckbxIOSIphone.setSelected(false);
					chckbxAndroid.setSelected(false);
				}
				if(!chckbxComputer.isSelected()) {
					chckbxWindows.setSelected(false);
					chckbxWindows.setVisible(false);
					chckbxOsxmac.setSelected(false);
					chckbxOsxmac.setVisible(false);
				}
				else {
					chckbxWindows.setVisible(true);
					chckbxOsxmac.setVisible(true);
				}
			}
		});
		chckbxComputer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxComputer.setBounds(10, 231, 183, 47);
		frame.getContentPane().add(chckbxComputer);
		
		chckbxPhone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxComputer.isSelected()) {
					chckbxComputer.setSelected(false);
					chckbxWindows.setVisible(false);
					chckbxWindows.setSelected(false);
					chckbxOsxmac.setVisible(false);
					chckbxOsxmac.setSelected(false);
				}
				
				if(!chckbxPhone.isSelected()) {
					chckbxIOSIphone.setVisible(false);
					chckbxAndroid.setVisible(false);
					chckbxIOSIphone.setSelected(false);
					chckbxAndroid.setSelected(false);
				}
				else {
					chckbxIOSIphone.setVisible(true);
					chckbxAndroid.setVisible(true);
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
		
		
		chckbxIOSIphone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxAndroid.isSelected()) {
					chckbxAndroid.setSelected(false);
				}
			}
		});
		chckbxIOSIphone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxIOSIphone.setBounds(259, 347, 183, 47);
		frame.getContentPane().add(chckbxIOSIphone);
		chckbxIOSIphone.setVisible(false);
		
		chckbxAndroid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxUnrGuest.isSelected()) {
					frame.dispose();
					BadGuestWifi redirect = new BadGuestWifi();
				}
				else {
					if(chckbxComputer.isSelected()) {
						if(chckbxWindows.isSelected()) {
							frame.dispose();
							WindowsEduWifi redirect = new WindowsEduWifi();
						}
						else if(chckbxOsxmac.isSelected()){
							frame.dispose();
							MacEduWifi redirect = new MacEduWifi();
						}
					}
					else {
						if(chckbxAndroid.isSelected()) {
							frame.dispose();
							AndroidEduWifi redirect = new AndroidEduWifi();
						}
						else if(chckbxIOSIphone.isSelected()) {
							frame.dispose();
							IphoneEduWifi redirect = new IphoneEduWifi();
						}
					}
				}
			}
		});
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnContinue.setBounds(593, 423, 183, 66);
		frame.getContentPane().add(btnContinue);
		chckbxOsxmac.setVisible(false);
		
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
