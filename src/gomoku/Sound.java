/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gomoku;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author kito
 */
public class Sound {
        public Clip clip;
        AudioInputStream audio;
	
        /**
         * 
         * @param path 
         * take the path of the audio and plays it
         */
        public void sound(String path){
		
		try {

			audio = AudioSystem.getAudioInputStream(Sound.class.getResource(path)); // Load music
			clip = AudioSystem.getClip(); // create clip object
			clip.open(audio);
                        clip.loop(-1);
			clip.start();
		
		} catch (Exception e) {
			//System.out.println("Might wanna check path: \n" + path);
			e.printStackTrace();
		}
		
	}
        
        /**
         * stop the the sound thread
         */
        public void end(){
                clip.stop();
        }
    
}
