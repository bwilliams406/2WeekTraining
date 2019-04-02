package com.williams.day2.creature.birds;

import com.williams.day2.creature.Bird;
import com.williams.day2.creature.behavior.Eating;
import com.williams.day2.creature.behavior.Flying;
import com.williams.day2.creature.behavior.FlyingSpeed;
import com.williams.day2.creature.behavior.Hunting;
import com.williams.day2.creature.behavior.Moving;
import com.williams.day2.creature.behavior.Swimming;

public class Wren extends Bird implements Eating, Flying, FlyingSpeed, Hunting, Swimming, Moving {

	boolean isWrenHunting;
	private int flyingSpeed;

	public Wren(int age, double height, double weight, String hasWings, String laysEggs, String SwimsAndFlys) {
		super(age, height, weight, hasWings, laysEggs);

	}

	public void setWrenHunting(boolean isWrenHunting) {
		this.isWrenHunting = isWrenHunting;
	}

	public void setFlyingSpeed(int flyingSpeed) {
		this.flyingSpeed = flyingSpeed;
	}

	@Override
	public void move() {
		System.out.println("The Wren is Moving At The Speed Of Light");

	}

	@Override
	public void eating() {
		System.out.println("The Wren is Eating Fish");

	}

	public void swimming() {
		System.out.println("The Wren is Swimming Happily");

	}

	public void isHunting() {
		if (isWrenHunting == true) {
			System.out.println("The Wren Is Hunting...");
		} else {
			System.out.println("The Wren Is Not Hunting...");
		}
	}

	public void flyingSpeed() {
		System.out.println("The Wren is Flying at " + flyingSpeed + " MPH");

	}

	public void flying() {
		System.out.println("The Wren is Flying");

	}

	public void laysEggs() {
		System.out.println("A Wren Lays 2 Eggs");
	}

}
