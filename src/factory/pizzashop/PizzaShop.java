package factory.pizzashop;

public class PizzaShop {

    private Pizza pizza;

    public Pizza orderPizza(String type) {

        // This code will change
        // Dealing with which concrete class we need to instantiate
        // is messing up our code.
        if(type.toLowerCase() == "pepperoni") {
            pizza = new PepperoniPizza();
        } else if(type.toLowerCase() == "cheese") {
            pizza = new CheesePizza();
        } else if(type.toLowerCase() == "veggie") {
            pizza = new VeggiePizza();
        } else if(type.toLowerCase() == "clam") {
            pizza = new ClamPizza();
        }

        // This code will stay the same
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
