package singleton.chocolate;

public class ChocolateController {
    public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		System.out.println(boiler);
		boiler.fill();
		boiler.boil();
		boiler.drain();

		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		System.out.println(boiler2);
	}
}
