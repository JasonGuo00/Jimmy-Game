package src;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class ButtonPanel {
	
	private Container container = Game.game.getWindow().getContentPane();
	private JButton button1, button2, button3;
	
	public ButtonPanel() {
		Border border = BorderFactory.createLineBorder(Color.white, 3);
		button1 = new JButton("Turn left");
		button1.setBackground(Color.black);
		button1.setForeground(Color.white);
		button1.setBounds(100, 550, 200, 100);
		button1.setBorder(border);
		button1.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		button1.setFocusPainted(false);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.game.switchToText(Game.game.proceduralRoom());
			}
		});
		
		button2 = new JButton("Move forward");
		button2.setBackground(Color.black);
		button2.setForeground(Color.white);
		button2.setBounds(400, 550, 200, 100);
		button2.setBorder(border);
		button2.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		button2.setFocusPainted(false);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.game.switchToText(Game.game.proceduralRoom());
			}
		});
		
		button3 = new JButton("Turn right");
		button3.setBackground(Color.black);
		button3.setForeground(Color.white);
		button3.setBounds(700, 550, 200, 100);
		button3.setBorder(border);
		button3.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		button3.setFocusPainted(false);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.game.switchToText(Game.game.proceduralRoom());
			}
		});
		
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.setLayout(null);
	}
	
//	public void close() {
//		button1.setVisible(false);
//		button2.setVisible(false);
//		button3.setVisible(false);
//	}
	
}
