package strategyduckapp;

public class DuckApp {
    
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        RedheadDuck redhead = new RedheadDuck();
        RubberDuck rubber = new RubberDuck();

        // let them quack
        mallard.quack();
        redhead.quack();
        rubber.quack();

        // display them
        mallard.display();
        redhead.display();
        rubber.display();

        // let them fly
        mallard.fly();
        redhead.fly();
        rubber.fly(); 

        System.out.println("The rubber duckie becomes a real duckie due to the fairy godmother!");
        rubber.setFlyBehaviour(new FlyWithWings());
        rubber.setQuackBehaviour(new Quack());

        rubber.fly();
        rubber.quack();
    }
}
