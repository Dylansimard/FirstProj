package testing;

import java.awt.Color;
import java.awt.EventQueue;

import java.awt.datatransfer.*;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NSHEResetWindow {

	private JFrame frame;
	private JTextField textField_NSHE;
	private JTextField textField_DOB;
	private JTextField textField_SSN;
	private String NSHE_ID;
	private String DOB;
	private String SSN;
	private JButton btn_Copy;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public NSHEResetWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		
		
		//the header
		JLabel lblThreeThingsNeeded = new JLabel("Three things needed for NSHE resets:");
		lblThreeThingsNeeded.setBounds(10, 0, 766, 46);
		lblThreeThingsNeeded.setFont(new Font("Tahoma", Font.BOLD, 38));
		frame.getContentPane().add(lblThreeThingsNeeded);
		
		
		
		//NSHE ID label
		JLabel lbl_NSHE = new JLabel("NSHE ID: ");
		lbl_NSHE.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_NSHE.setBounds(10, 102, 158, 56);
		frame.getContentPane().add(lbl_NSHE);
		
		
		
		//DOB label
		JLabel lbl_DOB = new JLabel("DOB:");
		lbl_DOB.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_DOB.setBounds(10, 201, 158, 56);
		frame.getContentPane().add(lbl_DOB);
		
		
		
		//SSN label
		JLabel lbl_SSN = new JLabel("Last 4 of SSN:");
		lbl_SSN.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_SSN.setBounds(10, 288, 158, 56);
		frame.getContentPane().add(lbl_SSN);
		
		
		
		//NSHE textfield
		textField_NSHE = new JTextField();
		textField_NSHE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_NSHE.setBounds(214, 102, 230, 56);
		frame.getContentPane().add(textField_NSHE);
		textField_NSHE.setColumns(10);
		
		
		//DOB textfield
		textField_DOB = new JTextField();
		textField_DOB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_DOB.setColumns(10);
		textField_DOB.setBounds(214, 201, 230, 56);
		frame.getContentPane().add(textField_DOB);
		
		
		
		//SSN textfield
		textField_SSN = new JTextField();
		textField_SSN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_SSN.setColumns(10);
		textField_SSN.setBounds(214, 288, 230, 56);
		frame.getContentPane().add(textField_SSN);
		
		
		
		btn_Copy = new JButton("Copy");
		btn_Copy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				NSHE_ID = textField_NSHE.getText();
				DOB = textField_DOB.getText();
				SSN = textField_SSN.getText();
				
				String out = "NSHE: " + NSHE_ID + "\nDOB: " + DOB + "\nSSN: " + SSN;
				StringSelection toClipboard = new StringSelection(out);
				Clipboard copied = Toolkit.getDefaultToolkit().getSystemClipboard();
				copied.setContents(toClipboard, null);
				
			}
		});
		
		
		btn_Copy.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn_Copy.setBounds(10, 396, 230, 78);
		frame.getContentPane().add(btn_Copy);
		
		
		
		JButton btnToSupportcenter = new JButton("To supportcenter");
		btnToSupportcenter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnToSupportcenter.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnToSupportcenter.setBounds(279, 396, 230, 78);
		frame.getContentPane().add(btnToSupportcenter);
		
		
		
		JButton btnToUserservices = new JButton("To userservices");
		btnToUserservices.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnToUserservices.setBounds(546, 396, 230, 78);
		frame.getContentPane().add(btnToUserservices);
		
		
		
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
