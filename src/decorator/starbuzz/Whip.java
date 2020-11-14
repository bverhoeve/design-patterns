package decorator.starbuzz;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.10 + this.beverage.cost();
    }
    
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
}
