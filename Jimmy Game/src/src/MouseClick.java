package src;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class MouseClick implements MouseListener {
	
	public static Fightscreen fight;

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		if(AvailableText.textList.get(AvailableText.textList.getTextIndex(Game.currentRoom)).getIndex() < AvailableText.textList.get(AvailableText.textList.getTextIndex(Game.currentRoom)).getSize()) {
			MainGame.textPanel.setTextArea(Game.currentRoom); 
		}
		else if(Game.currentRoom.equals("start")) {
			Game.currentRoom = "hallway";
		}
		else {
			if(!(Game.currentRoom.equals("finalRoom"))) {
				
				if (!(Game.currentRoom.equals("jimmyWin") || Game.currentRoom.equals("jimmyLose"))) {
					Game.game.switchToButton();
				}

			}
			// Initiate the jimmy wrestle here
			else{
				Game.game.newScreen();
				fight = new Fightscreen();
			}
		}
		

		
		//Add some function that checks which ID is currently being used for the text area, and then specifically run the next page of that
	
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
