package factory.pizzaaf;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 180 degrees");
    }

    public void cut() {
        System.out.println("Cutting the pizza in 8 pieces");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        // code to display pizza name and the ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        
        if (this.dough != null) {
            display.append(this.dough + "\n");
        }

        if (this.sauce != null) {
            display.append(this.sauce + "\n");
        }

        if (this.veggies != null) {
            
            for(Veggies veggie : veggies) {
                display.append(veggie + "\n"); 
            }
        }
        if (pepperoni != null) {
            display.append(pepperoni + "\n");
        }
        if (this.clam != null) {
            display.append(this.clam + "\n");
        }
		return display.toString();
    }
    
}
