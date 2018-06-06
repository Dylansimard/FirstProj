package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WebCampusLogin {
	
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
	
	WebCampusLogin(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		//labels:
		
		JLabel lblNewLabel = new JLabel("WebCampus can only be logged onto with netID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(10, 11, 766, 50);
		frame.getContentPane().add(lblNewLabel);
		
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
		
		
		
		//action on check, goes through steps to make sure only mac or windows is checked
		//will uncheck other if attempt to check both
		chckbxWindows.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isWindowsChecked) {
					isWindowsChecked = false;
				}
				else {
					isWindowsChecked = true;
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
		
		
		//label declarations, needed to define up here to avoid error
		JLabel lblMacFirefox = new JLabel("Cmd-Shift-p");
		JLabel lblMacChrome = new JLabel("Cmd-Shift-n");
		JLabel lblMacSafari = new JLabel("Cmd-Shift-n");
		JLabel labelWindowsFirefox = new JLabel("Ctrl-Shift-p");
		JLabel lblWindowsChrome = new JLabel("Ctrl-Shift-n");
		JLabel lblWrong = new JLabel("Please select two valid options");
		JLabel lblKeyCommand = new JLabel("Keyboard Command is:");
		
		
		//action for continue button, makes keyboard command for private window visible
		JButton btnContinue = new JButton("Continue");
		btnContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				lblKeyCommand.setVisible(true);
				
				if(isWindowsChecked && isChromeChecked) {
					lblWindowsChrome.setVisible(true);
					lblWrong.setVisible(false);
					lblMacFirefox.setVisible(false);
					lblMacChrome.setVisible(false);
					lblMacSafari.setVisible(false);
					labelWindowsFirefox.setVisible(false);
				}
				else if(isWindowsChecked && isFirefoxChecked) {
					labelWindowsFirefox.setVisible(true);
					lblWrong.setVisible(false);
					lblMacFirefox.setVisible(false);
					lblMacChrome.setVisible(false);
					lblMacSafari.setVisible(false);
					lblWindowsChrome.setVisible(false);
				}
				else if(isMacChecked && isSafariChecked) {
					lblMacSafari.setVisible(true);
					lblWrong.setVisible(false);
					lblMacFirefox.setVisible(false);
					lblMacChrome.setVisible(false);
					labelWindowsFirefox.setVisible(false);
					lblWindowsChrome.setVisible(false);
				}
				else if(isMacChecked && isChromeChecked) {
					lblMacChrome.setVisible(true);
					lblWrong.setVisible(false);
					lblMacFirefox.setVisible(false);
					lblMacSafari.setVisible(false);
					labelWindowsFirefox.setVisible(false);
					lblWindowsChrome.setVisible(false);
				}
				else if(isMacChecked && isFirefoxChecked) {
					lblMacFirefox.setVisible(true);
					lblWrong.setVisible(false);
					lblMacChrome.setVisible(false);
					lblMacSafari.setVisible(false);
					labelWindowsFirefox.setVisible(false);
					lblWindowsChrome.setVisible(false);
				}
				else {
					lblWrong.setVisible(true);
					lblMacFirefox.setVisible(false);
					lblMacChrome.setVisible(false);
					lblMacSafari.setVisible(false);
					labelWindowsFirefox.setVisible(false);
					lblWindowsChrome.setVisible(false);
				}
			}
		});

		
		//all label effects
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnContinue.setBounds(30, 432, 252, 57);
		frame.getContentPane().add(btnContinue);
		
		
		lblWrong.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblWrong.setBounds(410, 259, 350, 144);
		frame.getContentPane().add(lblWrong);
		lblWrong.setVisible(false);
		
		
		lblMacFirefox.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblMacFirefox.setBounds(459, 259, 269, 144);
		frame.getContentPane().add(lblMacFirefox);
		lblMacFirefox.setVisible(false);
		
		
		lblMacChrome.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblMacChrome.setBounds(482, 259, 271, 144);
		frame.getContentPane().add(lblMacChrome);
		lblMacChrome.setVisible(false);
		
		
		lblMacSafari.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblMacSafari.setBounds(447, 259, 274, 144);
		frame.getContentPane().add(lblMacSafari);
		lblMacSafari.setVisible(false);
		
		
		labelWindowsFirefox.setFont(new Font("Tahoma", Font.PLAIN, 50));
		labelWindowsFirefox.setBounds(460, 259, 260, 144);
		frame.getContentPane().add(labelWindowsFirefox);
		labelWindowsFirefox.setVisible(false);
		
		
		lblWindowsChrome.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblWindowsChrome.setBounds(450, 259, 260, 144);
		frame.getContentPane().add(lblWindowsChrome);
		lblWindowsChrome.setVisible(false);
		
		
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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(399, 432, 354, 57);
		frame.getContentPane().add(btnNewButton);
		


	}
}
