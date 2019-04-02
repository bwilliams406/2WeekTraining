package com.williams.day2.creature.mammals;

import com.williams.day2.creature.Mammal;
import com.williams.day2.creature.behavior.Eating;
import com.williams.day2.creature.behavior.Moving;
import com.williams.day2.creature.behavior.Running;

public class Elephant extends Mammal implements Moving, Running, Eating {

	private String hasTrunk;
	private String oneOffSpring;

	public Elephant(int age, double height, double weight, String liveBirth, String hasTrunk, String oneOffSpring) {
		super(age, height, weight, liveBirth);

	}

	public String getHasTrunk() {
		return hasTrunk;
	}

	public String getOneOffSpring() {
		return oneOffSpring;
	}

	public void setHasTrunk(String hasTrunk) {
		this.hasTrunk = hasTrunk;
	}

	public void setOneOffSpring(String oneOffSpring) {
		this.oneOffSpring = oneOffSpring;
	}

	@Override
	public void move() {
		System.out.println("The Elephant is Moving Away...");

	}

	@Override
	public void eating() {
		System.out.println("The Elephant is Eating Too Much");

	}

	public void running() {
		System.out.println("The Elephant is Running Really Fast");

	}

}
