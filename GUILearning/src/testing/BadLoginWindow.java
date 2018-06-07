package testing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BadLoginWindow {
	
	private JFrame frame;
	
	BadLoginWindow(){
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		frame.setBounds(100, 100, 802, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//header
		JLabel lblHeader = new JLabel("What are they unable to login to?");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblHeader.setBounds(10, 11, 766, 56);
		frame.getContentPane().add(lblHeader);
		
		
		//webcampus login
		JButton btnWebCampus = new JButton("WebCampus");
		btnWebCampus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				WebCampusBadLogin webCampusRedirect = new WebCampusBadLogin();
			}
		});
		btnWebCampus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnWebCampus.setBounds(20, 88, 180, 46);
		frame.getContentPane().add(btnWebCampus);
		
		
		
		//myNevada login
		JButton btnMynevada = new JButton("MyNevada");
		btnMynevada.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				
				MyNevadaBadLoginInit MyNevadaLogin = new MyNevadaBadLoginInit();
			}			
		});
		btnMynevada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMynevada.setBounds(20, 147, 180, 46);
		frame.getContentPane().add(btnMynevada);
		
		
		
		//housing login
		JButton btnHousing = new JButton("Housing");
		btnHousing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHousing.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHousing.setBounds(20, 204, 180, 46);
		frame.getContentPane().add(btnHousing);
		
		
		//fitness login
		JButton btnFitness = new JButton("Fitness");
		btnFitness.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFitness.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFitness.setBounds(20, 261, 180, 46);
		frame.getContentPane().add(btnFitness);
		
		
		//Student email login
		JButton btnStudentEmail = new JButton("Student Email");
		btnStudentEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnStudentEmail.setBounds(20, 318, 180, 46);
		frame.getContentPane().add(btnStudentEmail);
		
		
		//employee email login
		JButton btnEmployeeEmail = new JButton("Employee Email");
		btnEmployeeEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEmployeeEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEmployeeEmail.setBounds(20, 375, 180, 46);
		frame.getContentPane().add(btnEmployeeEmail);
		
		
		//box login
		JButton btnBoxunredu = new JButton("Box.unr.edu");
		btnBoxunredu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBoxunredu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBoxunredu.setBounds(20, 432, 180, 46);
		frame.getContentPane().add(btnBoxunredu);
		
		
		//campus computer login
		JButton btnCampusComputer = new JButton("Campus Computer");
		btnCampusComputer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCampusComputer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCampusComputer.setBounds(280, 88, 207, 46);
		frame.getContentPane().add(btnCampusComputer);
		
		
		//workday login
		JButton btnWorkday = new JButton("Workday\r\n\r\n");
		btnWorkday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnWorkday.setBounds(280, 147, 207, 46);
		frame.getContentPane().add(btnWorkday);
		
		
		//remote desktop login
		JButton btnRemoteDesktop = new JButton("Remote Desktop");
		btnRemoteDesktop.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRemoteDesktop.setBounds(280, 204, 207, 46);
		frame.getContentPane().add(btnRemoteDesktop);
		
		
		//wifi login
		JButton btnWifi = new JButton("Wifi");
		btnWifi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnWifi.setBounds(280, 261, 207, 46);
		frame.getContentPane().add(btnWifi);
		
		//transcript request login
		JButton btnTranscriptRequests = new JButton("Transcript Request");
		btnTranscriptRequests.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTranscriptRequests.setBounds(280, 318, 207, 46);
		frame.getContentPane().add(btnTranscriptRequests);
		
		
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
		btnToMainMenu.setBounds(546, 396, 230, 78);
		frame.getContentPane().add(btnToMainMenu);
		
	}

}

