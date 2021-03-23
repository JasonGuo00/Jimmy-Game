package src;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Fightscreen {
	
	//Contains the health bars, the "animation" for the health bar, text panel and buttons will be shuffled in here as well
	private Container container = Game.game.getWindow().getContentPane();
	private JLabel jimmy;
	private JLabel you;
	private JLabel jimmyhp;
	private JLabel youhp;
	private int jhp = 100;
	private int yhp = 100;
	private JPanel textPanel;
	private JTextArea textArea;

	
	public Fightscreen() {
		
		Game.game.currentRoom = "jimmyFight";
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
		
		textPanel = new JPanel();
		Border border = BorderFactory.createLineBorder(Color.white, 3);
		textPanel.setBounds(200, 50, 600, 100);
		textPanel.setBackground(Color.black);
		textPanel.setBorder(border);
		
		container.add(textPanel);
		container.setLayout(null);
		
		textArea = new JTextArea("Jimmy stares deeply into your blueberry eyes.");
		textArea.setBounds(6, 6, 588, 88);
		textArea.setBackground(Color.black);
		textArea.setForeground(Color.white);
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textPanel.add(textArea);
		
		MainGame.drawImage = new DrawImage();
		MainGame.drawImage.changeBounds(275, 150, 800, 400);
	}
	
	public void checkWin() {
		if (jhp <= 0 && yhp > 0) {
			jhp = 0;
			jimmyhp.setText(jhp + "/100");
			gameWin();
		} else if (jhp > 0 && yhp <= 0) {
			yhp = 0;
			youhp.setText(yhp + "/100");
			gameLose();
		} else if (jhp <= 0 && yhp <= 0) {
			jhp = 0;
			jimmyhp.setText(jhp + "/100");
			yhp = 0;
			youhp.setText(yhp + "/100");
			gameLose();
		}
	}
	
	public void updateText(String texter) {
		textArea.setText(texter);
	}
	
	public void changeJHP(int damage) {
		jhp -= damage;
		jimmyhp.setText(jhp + "/100");
	}
	
	public void changeYHP(int damage) {
		yhp -= damage;
		youhp.setText(yhp + "/100");
	}
	
	public void gameWin() {
		Game.game.currentRoom = "jimmyWin";
		Game.game.switchToText("jimmyWin");
	}
	
	public void gameLose() {
		Game.game.currentRoom = "jimmyLose";
		Game.game.switchToText("jimmyLose");
		MainGame.drawImage.changeBounds(275, 150, 800, 400);
	}
	
}
