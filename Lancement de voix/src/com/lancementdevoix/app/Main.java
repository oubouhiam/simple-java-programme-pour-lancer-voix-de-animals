package com.lancementdevoix.app;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.lancementdevoix.models.Animal;
import com.lancementdevoix.models.Elephant;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		

		
		Animal elephant = new Elephant("Elephant", 3, 1000, null);

			elephant.ReadSound("//sound//elephant.wav","elephant");
	}
}
