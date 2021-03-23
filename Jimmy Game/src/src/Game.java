package src;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


// Game class creates the window for the game
public class Game {
	//Actual window of the game
	private JFrame window;
	public static Game game;
	public AvailableImages availableImage = new AvailableImages();
	public static String currentRoom = "start";
	private boolean key1 = false;
	private boolean key2 = false;
	private boolean key3 = false;



	public static void main(String[] args) {
		game = new Game();
		new Title();
		new Music();
	}
	
	public Game() {
		//Initialize and set the size of the window
		window = new JFrame("Jimmy Game");
		window.setSize(1000, 700);
		//Allows the window to close
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Sets the background color of the window
		window.getContentPane().setBackground(Color.black);
		//Disables the normal layout of the JFrame 
		window.setLayout(null);
		//Disables resizing
		window.setResizable(false);
		//Makes the window visible
		window.setVisible(true);
	}
	
	public JFrame getWindow() {
		return window;
	}
	
	public void newScreen() {
		window.getContentPane().removeAll();
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1000, 700);
		panel.setBackground(Color.black);
		Game.game.getWindow().setContentPane(panel);
	}
	
	public void switchToText(String id) {
		// Sets the TextPanel variable to a new text panel, pass through an id
		newScreen();
		MainGame.drawImage = new DrawImage();
		MainGame.textPanel = new TextPanel();
		MainGame.textPanel.setTextArea(id);
	}
	
	public void switchToButton() {
		newScreen();
		MainGame.drawImage = new DrawImage();
		//Resets the "page" of every text box
		for(int i = 0; i < AvailableText.textList.textListSize(); i++) {
			AvailableText.textList.get(i).resetIndex();
		}
		MainGame.buttonPanel = new ButtonPanel();
	}
	
	// Random number is inputed into the function to randomly select a room and return the room's ID
		public String proceduralRoom() {
			int randomNumber = (int) (Math.random() * 100);
			System.out.println(randomNumber);
			if(key1 && key2 && key3) {
				currentRoom = "finalRoom";
				return currentRoom;
			}
			else if(randomNumber >= 25 && randomNumber < 50 && !key1) {
				currentRoom = "room1";
				key1 = true;
				return currentRoom;
			}
			else if(randomNumber >= 50 && randomNumber < 75 && !key2) {
				currentRoom = "room2";
				key2 = true;
				return currentRoom;
			}
			else if(randomNumber >= 75 && randomNumber < 100 && !key3) {
				currentRoom = "room3";
				key3 = true;
				return currentRoom;
				
			}
			else {
				currentRoom = "hallway";
				return currentRoom;
			}
		}
	

}
