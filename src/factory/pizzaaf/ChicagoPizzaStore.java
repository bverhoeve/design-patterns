package factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore {
	
	
	
	PizzaIngredientFactory ingredientFactory;

	  public ChicagoPizzaStore() {

		  
		  this.ingredientFactory = new ChicagoPizzaIngredientFactory();
	    }

    public Pizza createPizza(String type) {

    		PizzaIngredientFactory ingredientFactory;
    		Pizza pizza = null;

    	        if (type.equals("cheese")) {
    	            pizza = new CheesePizza(this.ingredientFactory);
    	            pizza.setName("New York Style Cheese Pizza");
    	        } else if (type.equals("veggie")) {
    	            pizza = new VeggiePizza(this.ingredientFactory);
    	            pizza.setName("New York Style Veggie Pizza");
    	        } else if(type.equals("clam")) {
    	            pizza = new ClamPizza(this.ingredientFactory);
    	            pizza.setName("New York Style Clam Pizza");
    	        } else if(type.equals("pepperoni")) {
    	            pizza = new PepperoniPizza(this.ingredientFactory);
    	            pizza.setName("New York Style Pepperoni Pizza");
    	        }

    	        return pizza;             
        
    }
        // if (type.equals("cheese")) {
        //     return new ChicagoStyleCheesePizza();
        // } else if (type.equals("veggie")) {
        //     return new ChicagoStyleVeggiePizza();
        // } else if(type.equals("clam")) {
        //     return new ChicagoStyleClamPizza();
        // } else if(type.equals("pepperoni")) {
        //     return new ChicagoStylePepperoniPizza();
        // }

        // return null; 
    
}

