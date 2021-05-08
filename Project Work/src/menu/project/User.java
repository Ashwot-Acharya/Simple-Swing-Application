package menu.project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class User{
		JLabel label = new JLabel();
		JLabel label2 = new JLabel();
		JTextField text = new JTextField();
		JButton button = new JButton();
		JLabel label3= new JLabel();
		JPasswordField pass = new JPasswordField();
		JPasswordField pass2 = new JPasswordField();
		JTextField txt = new JTextField();



 User() {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
		
	
		
	frame.add(panel);
	frame.setVisible(true);
	frame.setTitle("New User");
	frame.setSize(800,350);
	
	panel.setLayout(null);
	panel.add(label);
	panel.add(label2);
	panel.add(label3);
	panel.add(text);
	panel.add(button);
	panel.add(pass);
	panel.add(pass2);
	label.setBounds(12, 12,670, 30);
	Font labelFont = label.getFont();
	label.setFont(new Font(labelFont.getName(), Font.BOLD, 20));
	label.setText("Due to techinical problems we do not have new user section");
	label2.setBounds(12,40,400,20);
	label2.setText("you can still use the application ");
	label3.setBounds(12,60,400,20);
	label3.setText("username:admin password:admin");
	button.setBounds(12, 100, 100, 16);
	button.setText("Home");
	button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			frame.dispose();
			new Login();
			
		}
		
	});
	

	

	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	
	
	
	
}

}
