package com.williams.day2.creature;

public abstract class Mammal extends Creature {

	private String liveBirth;

	public Mammal(int age, double height, double weight, String liveBirth) {
		super(age, height, weight);

	}

	public String getLiveBirth() {
		return liveBirth;
	}

	public void setLiveBirth(String liveBirth) {
		this.liveBirth = liveBirth;
	}

}
