package com.lancementdevoix.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {

	private String name;
	private int age;
	private int poid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

	public Animal() {
		super();
	}

	public Animal(String name, int age, int poid) {
		super();
		this.name = name;
		this.age = age;
		this.poid = poid;
	}

	@Override
	public String toString() {
		return "\nName : " + name + "\nAge : " + age + "\nPoid : " + poid;
	}

	public void ReadSound(String path, String effectSource)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		Path AbsolutePath = FileSystems.getDefault().getPath("").toAbsolutePath();
		String fullPath = AbsolutePath + path;

		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(fullPath));

		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		System.out.println(effectSource + " sound is start ! ");
		System.out.println("Sound : " + clip.isActive());
		while (clip.isActive()) {
		}
		clip.close();
		System.out.println(effectSource + " sound is end ! ");
	}
}
