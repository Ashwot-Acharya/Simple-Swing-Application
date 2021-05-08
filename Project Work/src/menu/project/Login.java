package menu.project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.io.File;

import javax.swing.*;


public class Login   {
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JTextField txt = new JTextField();
	JPasswordField pass = new JPasswordField();
	JButton button = new JButton("Login");
	JButton button2 = new JButton("New User");
	String userN ="admin";
	String userP="admin";

	
	Login(){

	 	JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		
		frame.add(panel);
		frame.setTitle("Login");
		frame.setSize(250,300);

		panel.setLayout(null);
		panel.add(label3);
		panel.add(label2);
		panel.add(label);
		panel.add(txt);
		panel.add(pass);
		panel.add(button);
		panel.add(button2);
		Font labelFont = label.getFont();
		
		
		label.setText("Login");
		label.setFont(new Font(labelFont.getName(), Font.BOLD, 20));
		label2.setText("Username");
		label3.setText("Password");
		

		label.setBounds(80,1, 270, 25);
		label2.setBounds(30, 50, 70, 20);
		label3.setBounds(30, 100, 70, 20);
		txt.setBounds(40,75,130,20);
		pass.setBounds(40,125,130,20);
		button.setBounds(30,170,90,20);
		button2.setBounds(150,170,90,20);
		//login button
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(txt.getText());
				System.out.println(pass.getText());
				String username = txt.getText();
				String password = pass.getText();

	if(username.equals(userN) && password.equals(userP)) {
		frame.dispose();
		new Work();	
	}
	else {
		label.setText("try again");
	}
			
			}	
		});
//new user
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new User();
				
			}
			
		});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}


