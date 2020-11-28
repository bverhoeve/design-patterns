package factory.pizzafm;

public class PizzaStore {

    public PizzaStore() {}

    public Pizza orderPizza(String type) {
        
        // We'll need to change the factory that we create
        Pizza pizza = SimplePizzaFactory.createPizza(type); 

        // This code will stay the same
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
