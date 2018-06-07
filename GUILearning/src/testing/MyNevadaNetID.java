package testing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyNevadaNetID {

	private JFrame frame;
	
	private JCheckBox chckbxWindows;
	private JCheckBox chckbxMac;
	
	private JCheckBox chckbxSafari;
	private JCheckBox chckbxChrome;
	private JCheckBox chckbxFirefox;
	
	private boolean isWindowsChecked = false;
	private boolean isMacChecked = false;
	
	private boolean isSafariChecked = false;
	private boolean isChromeChecked = false;
	private boolean isFirefoxChecked = false;

	MyNevadaNetID(){
		initialize();
	}
	
	void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		JLabel lblNewLabel_1 = new JLabel("1.) Verify user has an active NetID in the security tool");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 72, 331, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblVerifyUsers = new JLabel("2.) Verify user's password hasn't expired");
		lblVerifyUsers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVerifyUsers.setBounds(20, 104, 331, 32);
		frame.getContentPane().add(lblVerifyUsers);
		
		JLabel lblIfBothAre = new JLabel("If both are true, and user is confident they know their password, try in a private window");
		lblIfBothAre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIfBothAre.setBounds(20, 140, 549, 32);
		frame.getContentPane().add(lblIfBothAre);
		
		JLabel lblForInstructionsGet = new JLabel("For instructions, get OS and Browser");
		lblForInstructionsGet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblForInstructionsGet.setBounds(20, 170, 290, 32);
		frame.getContentPane().add(lblForInstructionsGet);
		
		
		
		//initializing checkboxes
		JCheckBox chckbxWindows = new JCheckBox("Windows");
		JCheckBox chckbxMac = new JCheckBox("Mac");	
		JCheckBox chckbxSafari = new JCheckBox("Safari");
		JCheckBox chckbxChrome = new JCheckBox("Chrome");
		JCheckBox chckbxFirefox = new JCheckBox("Firefox");
		
		//label
		JLabel lblShortcutMessage = new JLabel("");
		JLabel lblKeyCommand = new JLabel("Keyboard Command is:");
		JLabel lblError = new JLabel("Please select two valid options");
		
		
		
		//action on check, goes through steps to make sure only mac or windows is checked
		//will uncheck other if attempt to check both
		chckbxWindows.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isWindowsChecked) {
					isWindowsChecked = false;
				}
				else {
					if(isSafariChecked) {
						chckbxWindows.setSelected(false);
					}
					else {
						isWindowsChecked = true;
					}
				}
				
				
				if(isMacChecked) {
					isMacChecked = false;
					chckbxMac.setSelected(false);
				}
			}
		});
		chckbxWindows.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxWindows.setBounds(30, 209, 114, 37);
		frame.getContentPane().add(chckbxWindows);
		
		
		//action on check, goes through steps to make sure only mac or windows is checked
		//will uncheck other if attempt to check both		
		chckbxMac.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isMacChecked) {
					isMacChecked = false;
				}
				else {
					isMacChecked = true;
				}
				
				if(isWindowsChecked) {
					isWindowsChecked = false;
					chckbxWindows.setSelected(false);
				}
			}
		});
		chckbxMac.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxMac.setBounds(168, 209, 114, 37);
		frame.getContentPane().add(chckbxMac);
		
		
		
		//active listener for Safari checkbox
		//makes sure only one box can be checked
		chckbxSafari.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isSafariChecked) {
					isSafariChecked = false;
				}
				else if(isWindowsChecked) {
					chckbxSafari.setSelected(false);
				}
				else {
					isSafariChecked = true;
				
					if(isChromeChecked) {
						chckbxChrome.setSelected(false);
						isChromeChecked = false;
					}
					
					if(isFirefoxChecked) {
						chckbxFirefox.setSelected(false);
						isFirefoxChecked = false;
					}
				}
			}
			
		});
		chckbxSafari.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxSafari.setBounds(96, 259, 114, 37);
		frame.getContentPane().add(chckbxSafari);
		
		
		
		//active listener for Chrome checkbox
		//makes sure only one box can be checked
		chckbxChrome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isChromeChecked) {
					isChromeChecked = false;
				}
				else {
					isChromeChecked = true;
					
					if(isSafariChecked) {
						chckbxSafari.setSelected(false);
						isSafariChecked = false;
					}
					
					if(isFirefoxChecked) {
						chckbxFirefox.setSelected(false);
						isFirefoxChecked = false;
					}
				}
				
			}
			
		});
		chckbxChrome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxChrome.setBounds(96, 313, 114, 37);
		frame.getContentPane().add(chckbxChrome);
		
		
		//active listener for Firefox checkbox
		//makes sure only one box can be checked
		chckbxFirefox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isFirefoxChecked) {
					isFirefoxChecked = false;
				}
				else {
					isFirefoxChecked = true;
			
					if(isSafariChecked) {
						chckbxSafari.setSelected(false);
						isSafariChecked = false;
					}
					
					if(isChromeChecked) {
						chckbxChrome.setSelected(false);
						isChromeChecked = false;
					}
				}
				
			}
			
		});
		chckbxFirefox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxFirefox.setBounds(96, 366, 114, 37);
		frame.getContentPane().add(chckbxFirefox);
		
		
		
		//action for shortcut button, makes keyboard command for private window visible
		JButton btnShortcut = new JButton("Shortcut");
		btnShortcut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(isWindowsChecked && isChromeChecked) {
					lblShortcutMessage.setText("Ctrl-Shift-n");
					lblKeyCommand.setVisible(true);
					lblError.setVisible(false);
				}
				else if(isWindowsChecked && isFirefoxChecked) {
					lblShortcutMessage.setText("Ctrl-Shift-p");
					lblKeyCommand.setVisible(true);
					lblError.setVisible(false);
				}
				else if(isMacChecked && isSafariChecked) {
					lblShortcutMessage.setText("Cmd-Shift-n");
					lblKeyCommand.setVisible(true);
					lblError.setVisible(false);
				}
				else if(isMacChecked && isChromeChecked) {
					lblShortcutMessage.setText("Cmd-Shift-n");
					lblKeyCommand.setVisible(true);
					lblError.setVisible(false);
				}
				else if(isMacChecked && isFirefoxChecked) {
					lblShortcutMessage.setText("Cmd-Shift-p");
					lblKeyCommand.setVisible(true);
					lblError.setVisible(false);
				}
				else {
					lblShortcutMessage.setText("");
					lblKeyCommand.setVisible(false);
					lblError.setVisible(true);
				}
			}
		});

		
		//all label effects
		btnShortcut.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnShortcut.setBounds(30, 432, 209, 57);
		frame.getContentPane().add(btnShortcut);
		
		
		lblKeyCommand.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblKeyCommand.setBounds(422, 209, 331, 37);
		frame.getContentPane().add(lblKeyCommand);
		lblKeyCommand.setVisible(false);
		
		
		//button to link to the NetID reset page.
		JButton btnNewButton = new JButton("Reset NetID Password\r\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				NetIDResetWindow netIDReset = new NetIDResetWindow();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(260, 432, 282, 57);
		frame.getContentPane().add(btnNewButton);
		
		
		lblShortcutMessage.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblShortcutMessage.setBounds(422, 259, 331, 65);
		frame.getContentPane().add(lblShortcutMessage);
		
		
		
		JButton btnToMainMenu = new JButton("Main Menu");
		btnToMainMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MainWindow newWindow = new MainWindow();
			}
		});
		
		//setting properties of return to main menu button
		btnToMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnToMainMenu.setBounds(567, 432, 209, 57);
		frame.getContentPane().add(btnToMainMenu);
		
		
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblError.setBounds(387, 259, 366, 65);
		frame.getContentPane().add(lblError);
		
		JLabel lblNewLabel = new JLabel("MyNevada issues signing in with NetID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(10, 11, 743, 57);
		frame.getContentPane().add(lblNewLabel);
		lblError.setVisible(false);
		
	}


}
