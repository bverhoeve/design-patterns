package decorator.starbuzz;

public class Coffee extends Beverage {
    public Coffee() {
        this.description = "Regular old coffee";
    }

    public double cost() {
        return 0.70;
    }
}
