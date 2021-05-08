package menu.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Game {
		int randomNumber=9;
		MyGuess guess = new MyGuess();
		Cow cc= new Cow();
		JLabel label = new JLabel();
		JLabel label2 = new JLabel();
 		JTextField text = new JTextField();
 		JButton button = new JButton();
 		JButton button2 = new JButton();
 		


 	public Game() {
 		JFrame frame = new JFrame();
 		JPanel panel = new JPanel();
 		frame.add(panel);
		frame.setVisible(true);
		frame.setTitle("Guessing Game");
		frame.setSize(350,350);
		panel.setLayout(null);
		panel.add(button2);
		panel.add(label);
		panel.add(label2);
		panel.add(text);
		panel.add(button);
		label.setText("Choose a number from 1 to 10");
		label.setBounds(75,12,300,16);
		text.setBounds(50, 50,100, 16);
		button.setText("guess");
		button.setBounds(50,70, 120, 16);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int mynum = Integer.valueOf(text.getText());
			boolean isit =	cc.check(randomNumber,mynum);
			if(isit==true) {
				label2.setText("You guessed it correctly");
				
			}
			else {
				boolean recheck=cc.check(mynum, randomNumber,0);
				if(recheck==true) {
					label2.setText("try lower number");
				}
				else {
					label2.setText("try greater number");
				}
			}
			}
			
		});
		button2.setBounds(50, 90, 150, 16);
		button2.setText("guess new number");
		label2.setBounds(47, 32, 400, 20);
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				randomNumber = guess.guess();
				label2.setText("new Random number set!");
			}
			
		});
		
		
		
		
	
		
		
		
		
 	}
}
