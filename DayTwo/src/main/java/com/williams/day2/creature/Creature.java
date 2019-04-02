package com.williams.day2.creature;

import com.williams.day2.creature.behavior.Eating;
import com.williams.day2.creature.behavior.Moving;

public abstract class Creature implements Moving, Eating {

	private int age;
	private double weight;
	private double height;

	public Creature(int age, double height, double weight) {

		super();
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void move() {
		System.out.println("All Animals Move");
	}

	public void eating() {
		System.out.println("All Anmials Eat");
	}

}