package factory.pizzaaf;

public class VeggiePizza extends Pizza {
	
	private PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		
		this.ingredientFactory = ingredientFactory; 
	}

	public void prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		veggies = ingredientFactory.createVeggies();
		cheese = ingredientFactory.createCheese();

	}
}
