package src;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class FightButtons {
	
	private Container container = Game.game.getWindow().getContentPane();
	private JButton button1, button2, button3;
	
	public FightButtons() {
		Border border = BorderFactory.createLineBorder(Color.white, 3);
		button1 = new JButton("Reckless Suplex");
		button1.setBackground(Color.black);
		button1.setForeground(Color.white);
		button1.setBounds(100, 550, 200, 100);
		button1.setBorder(border);
		button1.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		button1.setFocusPainted(false);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int damage = (int) (Math.random() * 9 + 10);
				MouseClick.fight.changeJHP(damage);
				MouseClick.fight.changeYHP((int)(Math.random() * 19));
				
			}
		});
		
		button2 = new JButton("Careful Punch");
		button2.setBackground(Color.black);
		button2.setForeground(Color.white);
		button2.setBounds(400, 550, 200, 100);
		button2.setBorder(border);
		button2.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		button2.setFocusPainted(false);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int damage = (int) (Math.random() * 4 + 5);
				MouseClick.fight.changeJHP(damage);
				MouseClick.fight.changeYHP((int)(Math.random() * 15) );
			}
		});
		
		button3 = new JButton("Defend");
		button3.setBackground(Color.black);
		button3.setForeground(Color.white);
		button3.setBounds(700, 550, 200, 100);
		button3.setBorder(border);
		button3.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		button3.setFocusPainted(false);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MouseClick.fight.changeYHP((int)(Math.random() * 5));
			}
		});
		
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.setLayout(null);
	}

}
