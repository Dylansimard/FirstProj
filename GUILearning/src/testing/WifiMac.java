package testing;

import java.awt.Color;

import javax.swing.JFrame;

public class WifiMac {
	private JFrame frame;
	
	WifiMac(){
		initialize();
	}

	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

