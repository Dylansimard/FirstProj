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

public class MyNevadaApplicationID {
	
	private JFrame frame;
	
	private boolean isWindowsChecked = false;
	private boolean isMacChecked = false;
	
	private boolean isSafariChecked = false;
	private boolean isChromeChecked = false;
	private boolean isFirefoxChecked = false;
	
	
	MyNevadaApplicationID(){
		initialize();
	}
	
	
	void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Users should ONLY be using an Application ID if they haven't been accepted");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 11, 766, 58);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
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
		
		
		lblShortcutMessage.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblShortcutMessage.setBounds(422, 259, 331, 65);
		frame.getContentPane().add(lblShortcutMessage);
		
		
		//main menu button
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
		
		
		//error label info
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblError.setBounds(387, 259, 366, 65);
		frame.getContentPane().add(lblError);
		
		JLabel lblNewLabel_1 = new JLabel("1.) Try in an incognito tab");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 80, 262, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblAskA = new JLabel("2.) Ask a pro to reset their Applicant ID password");
		lblAskA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAskA.setBounds(20, 133, 366, 45);
		frame.getContentPane().add(lblAskA);
		lblError.setVisible(false);
		
	}

}

	
	

