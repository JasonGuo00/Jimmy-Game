package src;

import java.util.ArrayList;


public class TextList {
	
	private ArrayList<MoreText> textList;
	
	public TextList() {
		textList = new ArrayList<MoreText>();
	}
	
	public ArrayList<MoreText> getTextList() {
		return textList;
	}
	
	public int textListSize( ) {
		return textList.size();
	}
	
	public MoreText get(int index) {
		return textList.get(index);
	}
	
	public void addText(MoreText ahuizotl) {
		textList.add(ahuizotl);
	}
	
	
	public MoreText getText(String id) {
		for(int i = 0; i < textList.size(); i++) {
			 if(textList.get(i).returnID().equals(id)) {
				 return textList.get(i);
			 }
		}
		return textList.get(0);
	}
	
	public int getTextIndex(String id) {
		for(int i = 0; i < textList.size(); i++) {
			 if(textList.get(i).returnID().equals(id)) {
				 return i;
			 }
		}
		return 0;
	}
	

	//textList.getText("Some id").returnText();
	//textList.getText("Some id").nextPage();

}

class MoreText {
	
	private String id;
	private ArrayList<Text> jimmy;
	private int index = 0;
	
	public MoreText(String id) {
		jimmy = new ArrayList<Text>();
		this.id = id;
	}
	
	public void addText(Text bababooey) {
		jimmy.add(bababooey);
	}
	
	public String nextPage() {
		String str = "Add Buttons Here";
		if(index == 0) {
			str = jimmy.get(0).getText();
			index++;
		}
		else if(index < jimmy.size()) {
			str = jimmy.get(index).getText();
			index++;
		}
		return str;
	}
	
	public void resetIndex() {
		index = 0;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String returnID() {
		return id;
	}
	
	public int getSize() {
		return jimmy.size();
	}
}

class Text {
	
	private String text;
	
	public Text(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	
}

class AvailableText {
	public static TextList textList = new TextList(); 
	
	private MoreText startRoomText = new MoreText("start");
	private Text startText1 = new Text("You open your eyes to a flash of white light.");
	private Text startText2 = new Text("You're sitting on a dusty, grimy couch with a static TV in front of you.");
	private Text startText3 = new Text("You don't know why, but you feel an intense urge to flip on the telly.  However, there's no remote in sight.");
	private Text startText4 = new Text("You look behind your back and can see the outline of a dark hallway.  You get up.");
	
	private MoreText hallwayText = new MoreText("hallway");
	private Text hallway = new Text("You walk down the hallway.");
	private Text hallway2 = new Text("The hallway forks down three paths.");
	private Text hallway3 = new Text("Which way would you like to go?");
	
	private MoreText room1Text = new MoreText("room1");
	private Text room1_1 = new Text("Down the dark hallway you see a door.  You decide to open it.");
	private Text room1_2 = new Text("You find yourself in a dark room, dimy lit by a small candle atop an old wooden desk.");
	private Text room1_3 = new Text("You walk up to the desk and search around.  Rummaging through the drawers, you find a Damiel.");
	private Text room1_4 = new Text("There doesn't seem to be anything else of interest in the room.  You decide to head back out into the dark hallways.");
	
	private MoreText room2Text = new MoreText("room2");
	private Text room2_1 = new Text("You walk into a room.  You explode.");
	
	private MoreText room3Text = new MoreText("room3");
	private Text room3_1 = new Text("Baba");
	private Text room3_2 = new Text("Booey");
	
	private MoreText finalRoomText = new MoreText("finalRoom");
	private Text finalRoom1 = new Text("You head back to the TV room.");
	private Text finalRoom2 = new Text("You assemble the remote and flip on the telly.");
	private Text finalRoom3 = new Text("You suddenly feel an ominous presence behind you.");
	private Text finalRoom4 = new Text("Add the wrestling with Jimmy match here");

	
	
	public AvailableText() {
		//Starting Room text
		startRoomText.addText(startText1);
		startRoomText.addText(startText2);
		startRoomText.addText(startText3);
		startRoomText.addText(startText4);
		textList.addText(startRoomText);
		
		//Hallway text
		hallwayText.addText(hallway);
		hallwayText.addText(hallway2);
		hallwayText.addText(hallway3);
		textList.addText(hallwayText);
		
		//Room 1 text
		room1Text.addText(room1_1);
		room1Text.addText(room1_2);
		room1Text.addText(room1_3);
		room1Text.addText(room1_4);
		textList.addText(room1Text);
		
		//Room 2 text
		room2Text.addText(room2_1);
		textList.addText(room2Text);
		
		//Room 3 text
		room3Text.addText(room3_1);
		room3Text.addText(room3_2);
		textList.addText(room3Text);
		
		//Final Room Text
		finalRoomText.addText(finalRoom1);
		finalRoomText.addText(finalRoom2);
		finalRoomText.addText(finalRoom3);
		finalRoomText.addText(finalRoom4);
		textList.addText(finalRoomText);
	}
}
