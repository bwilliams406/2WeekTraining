package com.williams.day2.creature.mammals;

import com.williams.day2.creature.Mammal;
import com.williams.day2.creature.behavior.Hunting;
import com.williams.day2.creature.behavior.RunningSpeed;
import com.williams.day2.creature.behavior.Swimming;

public class Tiger extends Mammal implements Hunting, RunningSpeed, Swimming {

	private int runningSpeed;
	private boolean isTigerHunting;

	public Tiger(int age, double height, double weight, String liveBirth) {
		super(age, height, weight, liveBirth);

	}

	public void setHunting(boolean isHunting) {
		this.isTigerHunting = isHunting;
	}

	public void setRunningSpeed(int tigerRunningSpeed) {
		this.runningSpeed = tigerRunningSpeed;
	}

	public void isHunting() {
		if (isTigerHunting == true) {
			System.out.println("The Tiger Is Hunting...");
		} else {
			System.out.println("The Tiger Is Not Hunting...");
		}
	}

	public void running() {
		System.out.println("The Tiger is Running at " + runningSpeed + " MPH");

	}

	@Override
	public void move() {
		System.out.println("The Tiger is Moving At The Speed Of Light");

	}

	@Override
	public void eating() {
		System.out.println("The Tiger is Eating Quickly");

	}

	public void swimming() {
		System.out.println("The Tiger is Swimming To Its Prey");

	}

}
