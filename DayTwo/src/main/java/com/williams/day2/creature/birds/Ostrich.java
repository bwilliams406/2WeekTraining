package com.williams.day2.creature.birds;

import com.williams.day2.creature.Bird;
import com.williams.day2.creature.behavior.Eating;
import com.williams.day2.creature.behavior.Moving;
import com.williams.day2.creature.behavior.RunningSpeed;
import com.williams.day2.creature.behavior.Swimming;

public class Ostrich extends Bird implements Eating, Swimming, RunningSpeed, Moving {

	private int runningSpeed;
	private String runs;

	public Ostrich(int age, double height, double weight, String hasWings, String laysEggs, String Runs) {
		super(age, height, weight, hasWings, laysEggs);

	}

	public void setRunningSpeed(int runningSpeed) {
		this.runningSpeed = runningSpeed;
	}

	public String getRuns() {
		return runs;
	}

	public int getRunningSpeed() {
		return runningSpeed;
	}

	public void setRuns(String runs) {
		this.runs = runs;
	}

	@Override
	public void move() {
		System.out.println("The Ostrich is Moving Fast");
	}

	@Override
	public void eating() {
		System.out.println("The Ostrich Loves Eating Corn");
	}

	public void running() {
		System.out.println("The Ostrich is Running at " + runningSpeed + " MPH");
	}

	public void swimming() {
		System.out.println("The Ostrich is Swimming");
	}

	public void runs() {
		System.out.println("An Ostrich Cannot Fly, But They Can Run");
	}

}
