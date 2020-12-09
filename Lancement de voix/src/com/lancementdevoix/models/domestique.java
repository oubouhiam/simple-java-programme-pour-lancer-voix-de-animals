package com.lancementdevoix.models;

public class domestique extends Animal {
	
	private String owner;
	
	

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}



	public domestique(String name, int age, int poid, String owner) {
		super(name, age, poid);
		this.owner = owner;
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
