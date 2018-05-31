package testing;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;


public class Test extends JFrame{
	
	public Test() {
		JFrame example = new JFrame();
		JLabel label = new JLabel("test");
		JButton button = new JButton("Hello");
		
		example.setLayout(new FlowLayout());

		example.add(label, BorderLayout.NORTH);
		
		example.setTitle("empty");
		example.setSize(500, 500);
		example.setLocation(500, 300);
		example.setVisible(true);
		
		button.setPreferredSize(new Dimension(100, 50));
		button.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
		button.setVisible(true);
		example.add(button, BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );
	}

	public static void main(String[] args) {
		Test window = new Test();
	}
	
}
