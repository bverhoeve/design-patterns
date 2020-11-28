package factory.pizzafm;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Regular Crust";
		sauce = "Tomato sauce";
		toppings.add("Pepperoni");
		toppings.add("Parmesan");
	}
}
