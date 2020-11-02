package strategyduckapp;

public class RubberDuck extends Duck{

    public RubberDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Squeak();
    }

    public void display() {
        System.out.println("Looks like a rubber duck");
    }
    
}
