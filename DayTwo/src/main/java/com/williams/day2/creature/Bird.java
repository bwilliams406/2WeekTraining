package com.williams.day2.creature;

public abstract class Bird extends Creature {

	private String hasWings;
	private String laysEggs;

	public Bird(int age, double height, double weight, String hasWings, String laysEggs) {
		super(age, height, weight);
		this.hasWings = hasWings;
		this.laysEggs = laysEggs;

	}

	public String getHasWings() {
		return hasWings;
	}

	public void setHasWings(String hasWings) {
		this.hasWings = hasWings;
	}

	public String getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(String laysEggs) {
		this.laysEggs = laysEggs;
	}

	public void hasWings() {
		System.out.println("All Birds have Wings");
	}

	public void laysEggs() {
		System.out.println("All Birds Lays Eggs");
	}

}
