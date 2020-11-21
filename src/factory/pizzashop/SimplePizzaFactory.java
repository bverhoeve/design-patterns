package factory.pizzashop;

public class SimplePizzaFactory {
    
    public static Pizza createPizza(String type)  {

         if(type.toLowerCase() == "pepperoni") {
            return new PepperoniPizza();
        } else if(type.toLowerCase() == "cheese") {
            return new CheesePizza();
        } else if(type.toLowerCase() == "veggie") {
            return new VeggiePizza();
        } else if(type.toLowerCase() == "clam") {
            return new ClamPizza();
        }

        return null; 
    }
}
