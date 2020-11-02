package strategyduckapp;

public abstract class Duck {

    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour fb) {
        this.flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }

    public void quack() {
        this.quackBehaviour.quack(); 
    }

    public void swim() {
        System.out.println("I am swimming");
    }

    public abstract void display();

    public void fly() {
        this.flyBehaviour.fly();
    }

}