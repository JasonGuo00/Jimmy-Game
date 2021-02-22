package src;


public class MainGame {
	
	public AvailableText availableText = new AvailableText();
	public AvailableImages availableImage = new AvailableImages();
//	private JPanel textPanel;
//	private JTextArea textArea;
//	private Container container = Game.game.getWindow().getContentPane();
	public static TextPanel textPanel; 
	public static ButtonPanel buttonPanel;
	public static DrawImage drawImage;
	

	public MainGame() {
		drawImage = new DrawImage();
		textPanel = new TextPanel();
		textPanel.setTextArea(Game.currentRoom);
		
	}
	
	


}
