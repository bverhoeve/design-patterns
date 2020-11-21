package factory.pizzashop;

public class PizzaShop {

    public PizzaShop() {}

    public Pizza orderPizza(String type) {
     
       Pizza pizza = SimplePizzaFactory.createPizza(type); 

        // This code will stay the same
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
