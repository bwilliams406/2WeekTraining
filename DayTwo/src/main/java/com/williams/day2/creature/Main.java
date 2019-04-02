package com.williams.day2.creature;

import com.williams.day2.creature.birds.Ostrich;
import com.williams.day2.creature.birds.Penguin;
import com.williams.day2.creature.birds.Wren;
import com.williams.day2.creature.mammals.Elephant;
import com.williams.day2.creature.mammals.Tiger;
import com.williams.day2.creature.mammals.Whale;

public class Main {

	public static void main(String[] args) {

		Tiger tiger = new Tiger(5, 4, 200, "A Tiger gives live birth");
		tiger.setHunting(true);
		tiger.isHunting();
		tiger.setRunningSpeed(30);
		tiger.running();
		tiger.swimming();
		tiger.move();
		tiger.eating();

		System.out.println("-----------------------------------------------------------");

		Whale whale = new Whale(50, 40, 20000, "A Whale gives live birth", "Whales Live in Water");
		whale.setHunting(true);
		whale.isHunting();
		whale.swimming();
		whale.move();
		whale.eating();

		System.out.println("-----------------------------------------------------------");

		Elephant elephant = new Elephant(20, 15, 4000, "A Elephant gives live birth", "Elephants have trunks",
				"Elephants have one offspring");
		elephant.running();
		elephant.move();
		elephant.eating();

		System.out.println("-----------------------------------------------------------");

		Wren wren = new Wren(3, 1, 10, "A Wren Has Wings", "a Wren Lays Eggs", "A Wren can Swim or Fly");
		wren.setWrenHunting(true);
		wren.isHunting();
		wren.setFlyingSpeed(70);
		wren.swimming();
		wren.move();
		wren.eating();

		System.out.println("-----------------------------------------------------------");

		Penguin penguin = new Penguin(6, 4, 70, "A Penguin Has Wings", "A Penguin Lays Eggs",
				"A Penguin can Swim or Walk");
		penguin.swimming();
		penguin.move();
		penguin.eating();
		penguin.walks();
		penguin.laysEggs();

		System.out.println("-----------------------------------------------------------");

		Ostrich ostrich = new Ostrich(6, 4, 70, "A Penguin Has Wings", "A Penguin Lays Eggs",
				"A Penguin can Swim or Walk");
		ostrich.swimming();
		ostrich.move();
		ostrich.eating();
		ostrich.running();
		ostrich.runs();

	}

}
