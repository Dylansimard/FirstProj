package testing;

import java.awt.Color;

import javax.swing.JFrame;

public class ContinueLinkingPage {
		
	private JFrame frame;
	private String[] parsedInput;
	
	ContinueLinkingPage(String input){
		initialize(input);
	}
	
	void initialize(String input){
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		parsedInput = input.split("");
	}
}
