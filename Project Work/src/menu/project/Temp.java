package menu.project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Temp implements Calculating{
	JLabel label4 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JTextField celcius = new JTextField();



public Temp() {
	System.out.println("calculating temperature");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	
	
	JButton button2 = new JButton();

	JButton button = new JButton();
	
	frame.add(panel);
	frame.setVisible(true);
	frame.setTitle("Temperature Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,350);
	panel.setBackground(Color.GRAY);
	panel.add(label);
	
	label.setText("Enter in celcius:");
	button.setText("Convert");
	panel.add(label3);
	panel.add(label2);
	panel.add(label4);
	panel.add(button);
	panel.add(celcius);
	panel.add(button2);
	label.setBounds(12, 40, 120, 16);
	celcius.setBounds(125, 40, 120, 20);
	label2.setBounds(12, 25, 150, 16);
	label3.setBounds(12, 54, 150, 16);
	button.setBounds(15, 75, 150, 16);
	button2.setBounds(12, 100, 150, 16);
	label4.setBounds(12, 120,150 ,16);
	button2.setText("Home");
	label2.setText("Kelvin:");
	label3.setText("fahrenheit:");
	panel.setLayout(null);
	button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			calulate();
			
			}
		
	});
	button2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			frame.dispose();
			new Work();
			
		}
		
	});
	
	
	
	
}


@Override
public void calulate() {
	String cel = celcius.getText();
	double conv = Double.valueOf(cel);
	double fer,kelv;
	kelv= (conv + 273.15);
	fer =(conv)*9/5+32;
	label2.setText("Kelvin: "+String.valueOf(kelv));
	label3.setText("fahrenheit: "+String.valueOf(fer));
	
}

}
