package factory.pizzaaf;

public class PizzaTest {
    
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        //PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = chicagoStore.orderPizza("clam");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza2.getName() + "\n");
        System.out.println(pizza2);
        //
    }
}
