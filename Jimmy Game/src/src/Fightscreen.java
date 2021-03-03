package src;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JLabel;

public class Fightscreen {
	
	//Contains the health bars, the "animation" for the health bar, text panel and buttons will be shuffled in here as well
	private Container container = Game.game.getWindow().getContentPane();
	private JLabel jimmy;
	private JLabel you;
	private JLabel jimmyhp;
	private JLabel youhp;
	private int jhp = 100;
	private int yhp = 100;

	
	public Fightscreen() {
		
		new FightButtons();
		//Name Labels
		jimmy = new JLabel("Jimmy");
		jimmy.setFont(new Font("Times New Roman", Font.BOLD, 26));
		jimmy.setBounds(40, 40, 90, 30);
		jimmy.setForeground(Color.white);
		
		you = new JLabel("You");
		you.setFont(new Font("Times New Roman", Font.BOLD, 26));
		you.setBounds(870, 490, 60, 30);
		you.setForeground(Color.white);
	
		container.add(jimmy);
		container.add(you);
		
		//Name Labels
		jimmyhp = new JLabel(jhp + "/100");
		jimmyhp.setFont(new Font("Times New Roman", Font.BOLD, 17));
		jimmyhp.setBounds(40, 70, 60, 30);
		jimmyhp.setForeground(Color.white);
		
		youhp = new JLabel(yhp + "/100");
		youhp.setFont(new Font("Times New Roman", Font.BOLD, 17));
		youhp.setBounds(870, 520, 60, 30);
		youhp.setForeground(Color.white);
	
		container.add(jimmyhp);
		container.add(youhp);
		
	}
	
	public void changeJHP(int damage) {
		jhp -= damage;
		jimmyhp.setText(jhp + "/100");
	}
	
	public void changeYHP(int damage) {
		yhp -= damage;
		youhp.setText(yhp + "/100");
	}
	
}
