package factory.pizzaaf;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + this.name);
		this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
		this.clam = ingredientFactory.createClams();
	}
}