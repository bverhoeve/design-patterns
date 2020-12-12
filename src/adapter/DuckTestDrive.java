package adapter;

import adapter.homework.Drone;
import adapter.homework.DroneAdapter;
import adapter.homework.SuperDrone;

public class DuckTestDrive {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();

		Turkey turkey = new WildTurkey();

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		// Challenge
		Drone drone = new SuperDrone();
		//Duck droneAdapter = new DroneAdapter(drone);
		//testDuck(droneAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
