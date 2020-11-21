package factory.pizzashop;

public class PizzaShop {

    private Pizza pizza;

    public Pizza orderPizza(String type) {

        // todo create code for new pizzas
        if(type.toLowerCase() == "pepperoni") {
            pizza = new PepperoniPizza();
        } else if(type.toLowerCase() == "cheese") {
            pizza = new CheesePizza();
        }else if(type.toLowerCase() == "greek") {
            pizza = new GreekPizza(); 
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
