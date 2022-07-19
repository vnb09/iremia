package musicwidget;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class songsevents {
	Clip clip;
	AudioInputStream song;
	//boolean flag;
	public void setSongFile(String songFileName) {
		try {
			File newFile = new File(songFileName);
			song = AudioSystem.getAudioInputStream(newFile);
			clip = AudioSystem.getClip();
			clip.open(song);
		}
		catch(Exception e) {
		}
	}
	
	public void play() {
		//flag = clip.isRunning();
		clip.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
       
	}
	
	public void stop() throws IOException{
		song.close();
		clip.close(); 
		clip.stop();
	}	
}
