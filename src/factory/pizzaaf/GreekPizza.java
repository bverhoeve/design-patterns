package factory.pizzaaf;

public class GreekPizza extends Pizza {
    public GreekPizza() {
		name = "Greek Pizza";
		dough = "Regular Crust";
		sauce = "Tomato Pizza Sauce";
		toppings.add("Fresh Mozzarella");
        toppings.add("Feta cheese");
        toppings.add("Olives");
        toppings.add("Basil");
	}
}
