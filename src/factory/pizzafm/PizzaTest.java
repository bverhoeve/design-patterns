package factory.pizzafm;

public class PizzaTest {
    
    public static void main(String[] args) {

        // TODO create a new NY or Chicago factory instead
        PizzaStore shop = new PizzaStore();

        Pizza pizza = shop.orderPizza("clam");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        Pizza pizza2 = shop.orderPizza("veggie");
        System.out.println("We ordered a " + pizza2.getName() + "\n");
        System.out.println(pizza2);

    }
}
