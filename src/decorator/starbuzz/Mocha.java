package decorator.starbuzz;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.50 + this.beverage.cost();
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
    
}
