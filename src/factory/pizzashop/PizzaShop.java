package factory.pizzashop;

public class PizzaShop {

    private SimplePizzaFactory factory;

    public PizzaShop() {
        factory = new SimplePizzaFactory(); 
    }

    public Pizza orderPizza(String type) {
     
       Pizza pizza = this.factory.createPizza(type); 

        // This code will stay the same
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
