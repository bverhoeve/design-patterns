package factory.pizzaaf;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        
       Pizza pizza;

       pizza = createPizza(type);

        // This code will stay the same
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
