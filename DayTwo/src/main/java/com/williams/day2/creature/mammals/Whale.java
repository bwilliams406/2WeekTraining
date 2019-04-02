package com.williams.day2.creature.mammals;

import com.williams.day2.creature.Mammal;
import com.williams.day2.creature.behavior.Eating;
import com.williams.day2.creature.behavior.Hunting;
import com.williams.day2.creature.behavior.Moving;
import com.williams.day2.creature.behavior.Swimming;

public class Whale extends Mammal implements Swimming, Moving, Hunting, Eating {

	private String livesInWater;
	private boolean isWhaleHunting;

	public Whale(int age, double height, double weight, String liveBirth, String livesInWater) {
		super(age, height, weight, liveBirth);

	}

	public String getLivesInWater() {
		return livesInWater;
	}

	public void setLivesInWater(String livesInWater) {
		this.livesInWater = livesInWater;
	}

	public void setHunting(boolean b) {

	}

	public void isHunting() {
		if (isWhaleHunting == true) {
			System.out.println("The Whale Is Hunting...");
		} else {
			System.out.println("The Whale Is Not Hunting...");
		}
	}

	@Override
	public void move() {
		System.out.println("The Whale is Moving At Speed to Get Away");

	}

	@Override
	public void eating() {
		System.out.println("The Whale is Eating a Giant Squid");

	}

	public void swimming() {
		System.out.println("The Whale is Swimming to the Surface");

	}

}
