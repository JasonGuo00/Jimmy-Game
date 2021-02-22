package src;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class TextPanel {
	
	private JPanel textPanel;
	private JTextArea textArea;
	private Container container = Game.game.getWindow().getContentPane();
	MouseClick click = new MouseClick();
	
	public TextPanel() {
		textPanel = new JPanel();
		Border border = BorderFactory.createLineBorder(Color.white, 3);
		textPanel.setBounds(100, 550, 800, 100);
		textPanel.setBackground(Color.black);
		textPanel.setBorder(border);
		
		container.add(textPanel);
		container.setLayout(null);
		
		textArea = new JTextArea("");
		textArea.setBounds(6, 6, 788, 88);
		textArea.setBackground(Color.black);
		textArea.setForeground(Color.white);
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textPanel.add(textArea);
		textPanel.addMouseListener(click);
	}
	
	public void setTextArea(String id) {
		textArea.setText(AvailableText.textList.getText(id).nextPage());
	}
	
	public JPanel getPanel() {
		return textPanel;
	}

	public JTextArea getTextArea() {
		return textArea;
	}
	
}


