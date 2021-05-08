package menu.project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Work{
	
	public  Work() {
	 
	 	JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		
		
		JButton button = new JButton();
		JButton button2 = new JButton();
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setTitle("Project");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,350);
		frame.setBackground(Color.GRAY);

		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		
		panel.add(button);
		panel.add(button2);
;
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);

		label.setBounds(10, 10, 800, 32);
		label2.setBounds(10, 50, 250, 16);
		label3.setBounds(10, 90, 250, 16);
		Font labelFont = label.getFont();
		label.setFont(new Font(labelFont.getName(), Font.BOLD, 20));

		
		label.setText("Choose what do you want to do?");
		label2.setText("1) play guessing game");
		label3.setText("2) convert temperatures ");
				
		button.setText("Play");
		button2.setText("Start calculator");
		

		button.setBounds(200, 50, 100, 16);
		button2.setBounds(200, 90, 100, 16);
		
		button.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				new Game();
				
			}
		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Temp();
			}
			
		});
		
		

	
	
}
}
