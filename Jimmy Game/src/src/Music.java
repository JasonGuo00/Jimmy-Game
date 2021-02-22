package src;

import java.io.FileInputStream;


import javazoom.jl.player.Player;

public class Music {
	
	// User Vlad on StackOverflow : https://stackoverflow.com/questions/16870064/how-to-play-an-mp3-file-in-java
	public Music(){

	    try{
	    	
	    	do {
		    	FileInputStream fis = new FileInputStream("D:/Eclipse/eclipse-workspace/Jimmy Game/bin/src/bgm.mp3");
			    Player playMP3 = new Player(fis);
		
			    playMP3.play();	
	    	}while(true);
	    
	    }
	    
	    catch(Exception e){
	    	System.out.println(e);
    	}
	}

	

}
