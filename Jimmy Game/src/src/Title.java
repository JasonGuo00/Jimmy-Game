package src;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Title {
	
	JPanel titlePanel;
	Container container;
	JLabel titleLabel;
	JButton startButton;
	JPanel buttonPanel;
	
	
	public Title() {
		//Allows for content to be expressed in the functional GUI part of the window
		container = Game.game.getWindow().getContentPane();
		//Making Title Panel
		titlePanel = new JPanel();
		titlePanel.setBounds(200, 50, 600, 150);
		titlePanel.setBackground(Color.black);
		//Making Title Label
		titleLabel = new JLabel("Jimmy Game", JLabel.CENTER);
		titleLabel.setForeground(Color.white);
		Font font = new Font("Times New Roman", Font.BOLD, 100);
		titleLabel.setFont(font);
		titlePanel.add(titleLabel);
		//Making Start Button
		
		buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 500, 400, 100);
		buttonPanel.setBackground(Color.black);
		startButton = new JButton("Start");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		startButton.setFocusPainted(false);
		//Adding functional aspect to the button
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.game.newScreen();
				new MainGame();
			}
		});
		buttonPanel.add(startButton);
		
		//Adding everything into the visible ContentPane
		container.add(titlePanel);
		container.add(buttonPanel);
	}
	
	

}
