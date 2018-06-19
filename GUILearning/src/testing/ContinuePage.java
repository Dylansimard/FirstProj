package testing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Scanner;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.SystemColor;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ContinuePage {
		
	private JFrame frame;
	private String[] parsedInput;
	private String[] keyWords; 
	private String[] matchedWords;
	
	private JLabel label = new JLabel("");
	private JLabel label_0 = new JLabel("");
	private JLabel label_1 = new JLabel("");
	private JLabel label_2 = new JLabel("");
	private JLabel label_3 = new JLabel("");
	private JLabel label_4 = new JLabel("");
	private JLabel label_5 = new JLabel("");
	private JLabel label_6 = new JLabel("");
	private JLabel label_7 = new JLabel("");
	private JLabel label_8 = new JLabel("");
	private JLabel label_9 = new JLabel("");
	
	
	ContinuePage(String input){
		initialize(input);
	}
	
	void initialize(String input){
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1024, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		JButton btnToMainMenu = new JButton("Main Menu");
		btnToMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainWindow newWindow = new MainWindow();
			}
		});
		btnToMainMenu.setVisible(true);
		
		//setting properties of return to main menu button
		btnToMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnToMainMenu.setBounds(767, 546, 230, 78);
		frame.getContentPane().add(btnToMainMenu);
		
		
		parsedInput = input.split(" ");
		frame.getContentPane().setLayout(null);

		setKeyWords();
		getMatches();
				
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(740, 129, 225, 33);
		frame.getContentPane().add(comboBox);
		
		JButton btnToNextWord = new JButton("To Selected Word");
		btnToNextWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(matchedWords.length == 0) {
					String input[] = new String[1];
					input[0] = comboBox.getItemAt(comboBox.getSelectedIndex());
					printScreen(input, 0);
				}
				else {
					printScreen(matchedWords, comboBox.getSelectedIndex());
				}
			}
		});
		btnToNextWord.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnToNextWord.setBounds(740, 32, 225, 42);
		frame.getContentPane().add(btnToNextWord);
		
		
		
		for(int i = 0; i < matchedWords.length; ++i) {
			comboBox.addItem(matchedWords[i]);
		}
		if(matchedWords.length != 0) {
			printScreen(matchedWords, 0);
		}
		else {
			label.setText("I'm sorry, none of those words matched, check the drop box for options");
			comboBox.addItem("outlook");
			comboBox.addItem("printing");
			comboBox.addItem("purchasing");
			comboBox.addItem("phone");
			comboBox.addItem("website");
			comboBox.addItem("nevadabox");
			comboBox.addItem("office365");
			comboBox.addItem("sharepoint");
			comboBox.addItem("nas");
			comboBox.addItem("network data storage");
			comboBox.addItem("wifi");
			comboBox.addItem("registering device");
			comboBox.addItem("remote services");
			comboBox.addItem("NetID");
			comboBox.addItem("NSHE id");
			
		}
		
		JLabel lblNewLabel = new JLabel("Next keyWords");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(800, 85, 117, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Original inputted statement:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(10, 11, 710, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextPane textPaneInput = new JTextPane();
		textPaneInput.setEditable(false);
		textPaneInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPaneInput.setBackground(Color.LIGHT_GRAY);
		textPaneInput.setBounds(20, 64, 675, 98);
		frame.getContentPane().add(textPaneInput);
		textPaneInput.setText(input);
		label.setForeground(new Color(0, 0, 128));
		
		
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label.setBounds(20, 173, 710, 27);
		frame.getContentPane().add(label);
		label_0.setForeground(new Color(0, 0, 128));
		
		
		label_0.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_0.setBounds(20, 211, 710, 27);
		frame.getContentPane().add(label_0);
		label_1.setForeground(new Color(0, 0, 128));
		
		
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_1.setBounds(20, 249, 710, 27);
		frame.getContentPane().add(label_1);
		label_2.setForeground(new Color(0, 0, 128));
		
		
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_2.setBounds(20, 287, 710, 27);
		frame.getContentPane().add(label_2);
		label_3.setForeground(new Color(0, 0, 128));
		
		
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_3.setBounds(20, 325, 710, 27);
		frame.getContentPane().add(label_3);
		label_4.setForeground(new Color(0, 0, 128));
		
		
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_4.setBounds(20, 364, 710, 27);
		frame.getContentPane().add(label_4);
		label_5.setForeground(new Color(0, 0, 128));
		
		
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_5.setBounds(20, 402, 710, 27);
		frame.getContentPane().add(label_5);
		label_6.setForeground(new Color(0, 0, 128));
		
		
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_6.setBounds(20, 440, 710, 27);
		frame.getContentPane().add(label_6);
		label_7.setForeground(new Color(0, 0, 128));
		
		
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_7.setBounds(20, 478, 710, 27);
		frame.getContentPane().add(label_7);
		label_8.setForeground(new Color(0, 0, 128));
		
		
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_8.setBounds(20, 516, 710, 27);
		frame.getContentPane().add(label_8);
		label_9.setForeground(new Color(0, 0, 128));
		
		
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_9.setBounds(20, 554, 710, 27);
		frame.getContentPane().add(label_9);
		

		

		
	}
	
	
	
	//function that reads keywords from a file stored in lib titled keyWord.txt
	//any keyword added to lib will be added here.
	void setKeyWords() {
		
		//declaration for opening the file, verifies it is found
		FileReader file = null;
		try {
			file = new FileReader("lib/keyWord.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		//counter for the total keyWords
		int counter = 0;
		
		//to get the number of keywords in the file
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			sc.nextLine();
			++counter;
		}
		sc.close();
		
		//re-open the file to get the scanner to start from the top
		FileReader file2 = null;
		try {
			file2 = new FileReader("lib/keyWord.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		//another scanner to start at the top of the file
		Scanner sc2 = new Scanner(file2);
		
		//setting the size of the keyword array
		keyWords = new String[counter];
		
		//assigning the words
		for(int i = 0; i < counter; ++i) {
			keyWords[i] = sc2.nextLine();
		}	
		sc2.close();
	}
	
	
	//function to match inputted words to keywords, then stores in an array titled matchedWords
	void getMatches() {
		
		//for loop to count number of matches to create the size of matchedWords
		int counter = 0;
		for(int i = 0; i < parsedInput.length; ++i) {
			for(int a = 0; a < keyWords.length; ++a ) {
				if(parsedInput[i].equalsIgnoreCase(keyWords[a])) {
					++counter;
				}
			}
		}
		
		//second counter, for storing in matchedArray
		int counter2 = 0;
		
		//assigning matchedWords in the array
		matchedWords = new String[counter];
		for(int i = 0; i < parsedInput.length; ++i) {
			for(int a = 0; a < keyWords.length; ++a ) {
				if(parsedInput[i].equalsIgnoreCase(keyWords[a])) {
					matchedWords[counter2] = keyWords[a];
					++counter2;
				}
			}
		}
		
	}
	
	void printScreen(String array[], int numWord) {
		
		if(array[numWord].equalsIgnoreCase("email") || array[numWord].equalsIgnoreCase("outlook") || 
				array[numWord].equalsIgnoreCase("mail") || array[numWord].equalsIgnoreCase("emails")
				|| array[numWord].equalsIgnoreCase("message") || array[numWord].equalsIgnoreCase("messages")) {
			
			
			label.setText("Email General info");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/email/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
					
				}
			});
			
			label_0.setText("Student Email General");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/email/student-email-address/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("Student Email Support");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/email/student-email-address/student-email-support/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("Employee Email General");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/email/employee-email-address/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("Accessing Employee Email");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/email/employee-email-address/accessing-your-employee-email-account/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("Outlook Windows Information");
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/email/employee-email-address/accessing-your-employee-email-account/outlook-2013-or-2016/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_5.setText("Outlook Mac Information");
			label_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/email/employee-email-address/accessing-your-employee-email-account/outlook-for-mac-2016/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_6.setText("Employee Email on IOS Device (Iphone)");
			label_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/email/employee-email-address/accessing-your-employee-email-account/ios-device/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_7.setText("Employee Email on Android Device");
			label_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/email/employee-email-address/accessing-your-employee-email-account/android-mobile-device/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_8.setText("Employee Email Training (Lots of Information/Links)");
			label_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/email/employee-email-address/email-training/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_9.setText("");
		}
		
		if(array[numWord].equalsIgnoreCase("printer") || array[numWord].equalsIgnoreCase("printing")
				|| array[numWord].equalsIgnoreCase("print") || array[numWord].equalsIgnoreCase("prints")
				|| array[numWord].equalsIgnoreCase("copystar")) {
			
			
			label.setText("General Printing Inforamtion");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/printers/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Network Printers General");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/printers/network-printers/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("Copystar Printers General");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/printers/kyocera-copystar/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("Copystar Printer Access");
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/printers/kyocera-copystar/access/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_5.setText("Copystar Driver Installation (Windows and Mac)");
			label_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/printers/kyocera-copystar/print-driver-and-papercut-installation/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_6.setText("Library Printing");
			label_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/printers/library-printing/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_7.setText("Printer Permissions");
			label_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/printers/network-printers/permissions/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("Network Printer Installation on Windows");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/printers/network-printers/installation/installation-on-pc/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("Network Printer Installation on Mac");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/printers/network-printers/installation/installation-on-mac/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_8.setText("");
			label_9.setText("");
		}
		
		if(array[numWord].equalsIgnoreCase("refurbished") || array[numWord].equalsIgnoreCase("surplus")
				|| array[numWord].equalsIgnoreCase("purchasing") || array[numWord].equalsIgnoreCase("warranty")
				|| array[numWord].equalsIgnoreCase("warranties") || array[numWord].equalsIgnoreCase("software")
				|| array[numWord].equalsIgnoreCase("installation") || array[numWord].equalsIgnoreCase("data")
				|| array[numWord].equalsIgnoreCase("buy") || array[numWord].equalsIgnoreCase("refurb")
				|| array[numWord].equalsIgnoreCase("backup") || array[numWord].equalsIgnoreCase("back")
				|| array[numWord].equalsIgnoreCase("up")) {
			
			
			label.setText("New Computer Purchasing");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/university-computers/office-computer-purchasing/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Refurbished Computer Purchasing");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/university-computers/refurbished-pc-purchasing/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("Surplus Computer Procedure");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/university-computers/surplus-procedure/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("Data Back Up");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/university-computers/data-back-up/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("Warranty Information");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/computers-and-devices/university-computers/warranty-information/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("Software Purchasing List");
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/software-and-online-applications/software-list/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_5.setText("Software Purchasing and Installation Information");
			label_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/software-and-online-applications/software-purchasing-and-installation/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_6.setText("Installing Software in Software Center");
			label_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/software-and-online-applications/software-purchasing-and-installation/how-to-install-software-using-the-software-center/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_7.setText("");
			label_8.setText("");
			label_8.setText("");
			label_9.setText("");
		}
	
		if(array[numWord].equalsIgnoreCase("phone") || array[numWord].equalsIgnoreCase("telephone")
				|| array[numWord].equalsIgnoreCase("skype") || array[numWord].equalsIgnoreCase("call")
				|| array[numWord].equalsIgnoreCase("calling") || array[numWord].equalsIgnoreCase("voicemail")
				|| array[numWord].equalsIgnoreCase("conference") || array[numWord].equalsIgnoreCase("voice")
				|| array[numWord].equalsIgnoreCase("calls")) {
			
			
			label.setText("General Phone Information");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/phones/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Office Phones");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/phones/office-phones/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("New Office Phone");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/phones/office-phones/new-office-phone/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("Voicemail Information");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/phones/office-phones/voicemail/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("Transfer an existing phone");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/phones/office-phones/transfer-an-existing-phone/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("Skype for Business");
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/skype-for-business/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_5.setText("Conference Calls");
			label_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/email-phone-and-communications/audio-and-visual-conferencing/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_6.setText("");
			label_7.setText("");
			label_8.setText("");
			label_9.setText("");
		}
		
		if(array[numWord].equalsIgnoreCase("website") || array[numWord].equalsIgnoreCase("wolfweb")
				|| array[numWord].equalsIgnoreCase("wolf") || array[numWord].equalsIgnoreCase("web")
				|| array[numWord].equalsIgnoreCase("filezilla") || array[numWord].equalsIgnoreCase("dreamweaver")
				|| array[numWord].equalsIgnoreCase("site")) {
			
			
			label.setText("General Website information");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/website-options/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Department Websites Information");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/website-options/department-websites/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("Connecting to Department Site with DreamWeaver");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/website-options/department-websites/connecting-to-department-site-with-dreamweaver-cc-2018/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("Connecting to Department Site with FileZilla");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/website-options/department-websites/connecting-to-department-site-with-filezilla/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("Wolfweb Personal Websites");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/website-options/wolfweb-personal-websites/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("Connecting to Wolfweb with FileZilla");
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/website-options/wolfweb-personal-websites/connecting-to-wolfweb-with-filezilla/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_5.setText("");
			label_6.setText("");
			label_7.setText("");
			label_8.setText("");
			label_9.setText("");
		}
		
		if(array[numWord].equalsIgnoreCase("nevadabox") || array[numWord].equalsIgnoreCase("box")
				|| array[numWord].equalsIgnoreCase("box.unr.edu")) {
			
			label.setText("NevadaBox General Information");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/nevadabox/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Logging into NevadaBox");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/nevadabox/logging-in-to-nevadabox/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("Creating a Folder in NevadaBox");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/nevadabox/creating-a-folder/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("Deleting or Restoring a File in NevadaBox");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/nevadabox/deleting-or-restoring-a-file/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("Sharing a File in NevadaBox");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/nevadabox/sharing-files/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("NevadaBox Apps");
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/nevadabox/nevadabox-apps/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_5.setText("");
			label_6.setText("");
			label_7.setText("");
			label_8.setText("");
			label_9.setText("");
		}
		
		if(array[numWord].equalsIgnoreCase("office") || array[numWord].equalsIgnoreCase("office365")
				|| array[numWord].equalsIgnoreCase("365") || array[numWord].equalsIgnoreCase("word")
				|| array[numWord].equalsIgnoreCase("excel") || array[numWord].equalsIgnoreCase("microsoft")) {
			
			label.setText("Office365 General");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/office-365/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Install Office for Home Use");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/office-365/install-microsoft-office-for-home-use/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("Microsoft Office General");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/software-and-online-applications/software-list/microsoft-office/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("");
			label_3.setText("");
			label_4.setText("");
			label_5.setText("");
			label_6.setText("");
			label_7.setText("");
			label_8.setText("");
			label_9.setText("");
		}
		
		if(array[numWord].equalsIgnoreCase("sharepoint") || array[numWord].equalsIgnoreCase("share")
				|| array[numWord].equalsIgnoreCase("point")) {
			
			label.setText("SharePoint General Information");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/sharepoint/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Using SharePoint");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/sharepoint/using-sharepoint/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("SharePoint Pages Information");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/sharepoint/sharepoint-pages/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("SharePoint Lists Information");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/sharepoint/sharepoint-lists/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("SharePoint Shared Documents");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/sharepoint/sharepoint-lists/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("SharePoint New Site");
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/sharepoint/sharepoint-administration/sharepoint-new-site/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_5.setText("SharePoint Assigning Subsite Permissions");
			label_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/sharepoint/sharepoint-administration/sharepoint-assigning-subsite-permissions/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_6.setText("");
			label_7.setText("");
			label_8.setText("");
			label_9.setText("");
		}
		
		if(array[numWord].equalsIgnoreCase("nas") || array[numWord].equalsIgnoreCase("network data storage")
				|| array[numWord].equalsIgnoreCase("storage") || array[numWord].equalsIgnoreCase("network share")
				|| array[numWord].equalsIgnoreCase("data")|| array[numWord].equalsIgnoreCase("share")) {
			
			label.setText("Network Data Storage");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/network-data-storage/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("NAS: Department Share");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/network-data-storage/nas-department-share/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("NAS: Personal Share");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/network-data-storage/nas-personal-share/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("NAS: Mapping a Network Share on Windows");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/network-data-storage/nas-mapping-a-network-share-pc/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("NAS: Mapping a Network Share on Mac");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/network-data-storage/nas-mapping-a-network-share-mac/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("NAS Backup/Restore Information");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/data-storage/network-data-storage/nas-backuprestore/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("");
			label_5.setText("");
			label_6.setText("");
			label_7.setText("");
			label_8.setText("");
			label_9.setText("");
		}
		
		if(array[numWord].equalsIgnoreCase("wifi") || array[numWord].equalsIgnoreCase("network")
				|| array[numWord].equalsIgnoreCase("ethernet") || array[numWord].equalsIgnoreCase("internet")
				|| array[numWord].equalsIgnoreCase("connection") || array[numWord].equalsIgnoreCase("wireless")
				|| array[numWord].equalsIgnoreCase("eduroam") || array[numWord].equalsIgnoreCase("guest")
				|| array[numWord].equalsIgnoreCase("register") || array[numWord].equalsIgnoreCase("device")
				|| array[numWord].equalsIgnoreCase("registering") || array[numWord].equalsIgnoreCase("xbox")
				|| array[numWord].equalsIgnoreCase("playstation") || array[numWord].equalsIgnoreCase("ps4")
				|| array[numWord].equalsIgnoreCase("registering device")) {
			
			label.setText("Network and Internet General Information");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Wireless Access Information");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/wireless-access/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("Eduroam general Information");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/wireless-access/eduroam/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("Connecting to Eduroam on Iphone");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/wireless-access/eduroam/connecting-to-eduroam-on-mobile-devices/connecting-to-eduroam-apple-mobile-devices-ios/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("Connecting to Eduroam on Android");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/wireless-access/eduroam/connecting-to-eduroam-on-mobile-devices/connecting-to-eduroam-android-mobile-devices-android/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("UNR Guest General Information");
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/wireless-access/unr-guest/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_5.setText("Wireless Locations");
			label_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/wireless-access/wireless-locations/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_6.setText("Wireless Restrictions");
			label_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/wireless-access/wireless-restrictions/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_7.setText("Wireless Troubleshooting");
			label_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/wireless-access/wireless-troubleshooting/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			label_8.setText("Residence Hall Registration for Computers");
			label_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/residence-hall-network/reshall-registration-for-computer/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_9.setText("Residence Hall Registration for Other Devices");
			label_9.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/residence-hall-network/reshall-registration-for-other-devices/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
		}
		
		if(array[numWord].equalsIgnoreCase("remote") || array[numWord].equalsIgnoreCase("desktop")
				|| array[numWord].equalsIgnoreCase("services") || array[numWord].equalsIgnoreCase("direct")
				|| array[numWord].equalsIgnoreCase("vpn") || array[numWord].equalsIgnoreCase("access")
				|| array[numWord].equalsIgnoreCase("remote.unr.edu") || array[numWord].equalsIgnoreCase("remote services")) {
			
			label.setText("Remote Access General");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Remote Services General Information");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/remote-services/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("Remote.unr.edu Information (Remote Services)");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/remote-services/website-connection/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
	
			label_2.setText("Direct Remote Access General");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/remote-services/direct-remote-access/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("Direct Remote Access for Windows General");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/remote-services/direct-remote-access/pc/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("Direct Remote Access for Mac General");
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/remote-services/direct-remote-access/mac/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
		
		
			label_5.setText("Direct Remote Connection Information for Mac");
			label_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/remote-services/remote-application-connections/macosx/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
		
			label_6.setText("Direct Remote Connection Information for Windows");
			label_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/remote-services/remote-application-connections/windows-7-or-10-connection/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_7.setText("Connecting to the VPN");
			label_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/network-and-internet/remote-access/vpn/connect-to-the-vpn/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			
			label_7.setText("");
			label_8.setText("");
			label_9.setText("");
			
			
		
		}
		if(array[numWord].equalsIgnoreCase("netid") || array[numWord].equalsIgnoreCase("net")
				|| array[numWord].equalsIgnoreCase("id") || array[numWord].equalsIgnoreCase("activate")
				|| array[numWord].equalsIgnoreCase("activation") || array[numWord].equalsIgnoreCase("forgot")) {
			
			label.setText("NetID General Information");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/login-ids-and-passwords/netid/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("NetID Activation Information");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/login-ids-and-passwords/netid/netid-activation/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("NetID Password Expiration Information");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/login-ids-and-passwords/netid/netid-password-expiration/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("NetID Password Reset Information");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/login-ids-and-passwords/netid/netid-password-reset/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_3.setText("NetID Login Issues FAQ");
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/login-ids-and-passwords/netid/netid-faq/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_4.setText("Guest NetID Information");
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/login-ids-and-passwords/netid/guest-netid/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_5.setText("");
			label_6.setText("");
			label_7.setText("");
			label_8.setText("");
			label_9.setText("");
		}
		
		if(array[numWord].equalsIgnoreCase("nshe") || array[numWord].equalsIgnoreCase("id")
				|| array[numWord].equalsIgnoreCase("activate") || array[numWord].equalsIgnoreCase("activation")
				|| array[numWord].equalsIgnoreCase("number") || array[numWord].equalsIgnoreCase("forgot")
				|| array[numWord].equalsIgnoreCase("nshe id")) {
			
			label.setText("NSHE ID General Information");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/login-ids-and-passwords/nshe-id/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Forgot NSHE ID Number");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/login-ids-and-passwords/nshe-id/forgot-your-nshe-id-number/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("Forgot NSHE ID Password");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://oit.unr.edu/services-and-support/login-ids-and-passwords/nshe-id/forgot-your-nshe-id-password/");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("");
			label_3.setText("");
			label_4.setText("");
			label_5.setText("");
			label_6.setText("");
			label_7.setText("");
			label_8.setText("");
			label_9.setText("");
			
		}
		
		if(array[numWord].equalsIgnoreCase("workday") || array[numWord].equalsIgnoreCase("work")
				|| array[numWord].equalsIgnoreCase("day") || array[numWord].equalsIgnoreCase("myworkday")) {
			
			label.setText("Workday General Information");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://www.unr.edu/workday");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_0.setText("Workday Training Information and Resources");
			label_0.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("https://www.unr.edu/workday/workday-training-and-resources");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_1.setText("Accessing Workday (and FAQ at bottom of page)");
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
						
						URI supportCenterLink = null;
						try {
							supportCenterLink = new URI("hhttps://www.unr.edu/workday/accessing-workday");
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
						
						try {
							desktop.browse(supportCenterLink);
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			});
			
			label_2.setText("");
			label_3.setText("");
			label_4.setText("");
			label_5.setText("");
			label_6.setText("");
			label_7.setText("");
			label_8.setText("");
			label_9.setText("");
			
		}
		
	}
}
