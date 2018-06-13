package testing;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow {

	
	JFrame frame;
	private String input;
	
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		//for the label at the top
		JLabel lblStateTheIssue = new JLabel("State The Issue");
		lblStateTheIssue.setFont(new Font("Tahoma", Font.BOLD, 44));
		
		
		//the text area that the user will type into
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textArea.setRows(100);
		textArea.setColumns(100);
		
		
		
		
		//button for NSHE reset, need to code into next window
		JButton btnNSHEReset = new JButton("NSHE Reset");
		btnNSHEReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
				NSHEResetWindow reset = new NSHEResetWindow();
				
				
				
			}
		});
		btnNSHEReset.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		
		
		//button for NetID resets, need to code into next window
		JButton btnNetidReset = new JButton("NetID Reset\r\n");
		btnNetidReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
				NetIDResetWindow reset = new NetIDResetWindow();
			}
		});
		btnNetidReset.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		
		
		
		//button for can't login, need to code into next window
		JButton btnBadLogin = new JButton("Can't Login?");
		btnBadLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
				BadLoginWindow badLogin = new BadLoginWindow();
			}
		});
		btnBadLogin.setFont(new Font("Tahoma", Font.PLAIN, 35));
		
		
		
		//button for continue
		JButton btnContinue = new JButton("Continue\r\n");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input = textArea.getText();
				if(!input.isEmpty()) {
					frame.dispose();
					ContinuePage redirect = new ContinuePage(input);
				}
			}
		});
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		
		
		//layout settings
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblStateTheIssue, GroupLayout.PREFERRED_SIZE, 786, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 772, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNSHEReset, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNetidReset, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
							.addGap(47)
							.addComponent(btnBadLogin, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(btnContinue, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		//more layout settings
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStateTheIssue, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnNSHEReset, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNetidReset, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
							.addComponent(btnBadLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(btnContinue, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
