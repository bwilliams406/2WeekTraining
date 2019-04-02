package com.williams.day2.creature.birds;

import com.williams.day2.creature.Bird;
import com.williams.day2.creature.behavior.Eating;
import com.williams.day2.creature.behavior.Moving;
import com.williams.day2.creature.behavior.Swimming;

public class Penguin extends Bird implements Eating, Swimming, Moving {

	private String walks;

	public Penguin(int age, double height, double weight, String hasWings, String laysEggs, String walks) {
		super(age, height, weight, hasWings, laysEggs);

	}

	public String getWalks() {
		return walks;
	}

	public void setWalks(String walks) {
		this.walks = walks;
	}

	@Override
	public void move() {

		System.out.println("The Penguin is Moving East");

	}

	@Override
	public void eating() {

		System.out.println("The penguin is Eating a Bug");
	}

	public void swimming() {

		System.out.println("The penguin is Swimming Under the Ice");

	}

	public void walks() {
		System.out.println("Penguins Walk Most of the Time");
	}

	public void laysEggs() {
		System.out.println("Penguins Lay Eggs, and The Dad Keeps them Warm On His Feet");
	}

}
