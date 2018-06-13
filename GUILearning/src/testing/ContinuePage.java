package testing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridBagLayout;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class ContinuePage {
		
	private JFrame frame;
	private String[] parsedInput;
	private String[] keyWords; 
	private String[] matchedWords;
	
	ContinuePage(String input){
		initialize(input);
	}
	
	void initialize(String input){
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1072, 674);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		parsedInput = input.split(" ");
		frame.getContentPane().setLayout(null);

		setKeyWords();
		getMatches();
		
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(789, 129, 225, 33);
		frame.getContentPane().add(comboBox);
		
		
		JLabel lblNewLabel = new JLabel("Next keyWords");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(846, 85, 117, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Original inputted statement:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(10, 11, 1036, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextPane textPaneInput = new JTextPane();
		textPaneInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPaneInput.setBackground(Color.LIGHT_GRAY);
		textPaneInput.setBounds(20, 64, 710, 98);
		frame.getContentPane().add(textPaneInput);
		textPaneInput.setText(input);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setUnitIncrement(5);
		scrollBar.setBlockIncrement(20);
		scrollBar.setBounds(1039, 0, 17, 635);
		frame.getContentPane().add(scrollBar);
		
		for(int i = 0; i < matchedWords.length; ++i) {
			comboBox.addItem(matchedWords[i]);
		}
		
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
}
