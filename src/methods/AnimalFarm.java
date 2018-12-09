package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
			for(int x =1; x < 5; x++) {
				String answer = JOptionPane.showInputDialog("cow, duck, dog, cat, or llama");
		/* 2. Make it so that the user can keep entering new animals. */
				if(answer.equals("cow")) {
					playMoo();
				}
				else if(answer.equals("llama")) {
					playLlama();
				}
				else if(answer.equals("cat")) {
					playMeow();
				}
				else if(answer.equals("duck")) {
					playQuack();
				}
				else if(answer.equals("dog")) {
					playWoof();
				}
				else {
					System.out.println("You didn't type one of the listed animals.");
				}
			
			
			
			
			}
		}
		

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	void playMeow() {
		playNoise(meowFile);
	}
	
	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
