package src;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Images {
	private String dir;
	private String id;
	
	public Images(String directory, String ID) {
		dir = directory;
		id = ID;
	}
	public String returnID() {
		return id;
	}
	public String returnDir() {
		return dir;
	}
}

class ImageList {
	private ArrayList<Images> imageList;
	
	public ImageList() {
		imageList = new ArrayList<Images>();
	}
	
	// Returns the directory of the image
	public String getImage(String id) {
		for(int i = 0; i < imageList.size(); i++) {
			if(imageList.get(i).returnID().equals(id)) {
				return imageList.get(i).returnDir();
			}
		}
		return "ID Not Found";
	}
	
	public void addImage(Images image) {
		imageList.add(image);
	}
}

class AvailableImages {
	public static ImageList imageList = new ImageList();
	private Images startRoom = new Images("start.png", "start");
	private Images hallway = new Images("hallway.png", "hallway");
	private Images room1 = new Images("room1.png", "room1");
	private Images room2 = new Images("wip.png", "room2");
	private Images room3 = new Images("wip.png", "room3");
	private Images finalRoom = new Images("start.png", "finalRoom");
	
	public AvailableImages() {
		imageList.addImage(startRoom);
		imageList.addImage(hallway);
		imageList.addImage(room1);
		imageList.addImage(room2);
		imageList.addImage(room3);
		imageList.addImage(finalRoom);
	}
}

class DrawImage {
	private JLabel imageLabel;
	private ImageIcon imageIcon;
	private Container container = Game.game.getWindow().getContentPane();
	
	public DrawImage() {
		if(getClass().getResource(AvailableImages.imageList.getImage(Game.currentRoom)) != null) {
			imageIcon = new ImageIcon(getClass().getResource(AvailableImages.imageList.getImage(Game.currentRoom)));
		}
		imageLabel = new JLabel();
		//images loaded in will be 800 x 450
		imageLabel.setBounds(100, 50, 800, 450);
		imageLabel.setIcon(imageIcon);
		container.add(imageLabel);
		
	}
}
