package strategyduckapp;
public class RedheadDuck extends Duck {
   

   public RedheadDuck() {
        this.quackBehaviour = new Quack();
        this.flyBehaviour = new FlyWithWings();
    }
    
    @Override
    public void display() {
        System.out.println("Picture of a readhead duck");
    }
}