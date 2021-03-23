package src;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class Info {
	
	private Container container = Game.game.getWindow().getContentPane();
	private JButton button;
	
	public Info() {
		new DrawSpecificImage("info");
		
		Border border = BorderFactory.createLineBorder(Color.white, 3);
		button = new JButton("Got it!");
		button.setBackground(Color.black);
		button.setForeground(Color.white);
		button.setBounds(400, 550, 200, 100);
		button.setBorder(border);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		button.setFocusPainted(false);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.game.newScreen();
				new MainGame();
			}
		});
		container.add(button);
		container.setLayout(null);
	}

}
