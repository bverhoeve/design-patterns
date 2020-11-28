package factory.pizzafm;

public class PizzaTest {
    
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyStore.orderPizza("clam");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza2.getName() + "\n");
        System.out.println(pizza2);

    }
}
