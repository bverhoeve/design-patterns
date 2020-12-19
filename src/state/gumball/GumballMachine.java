package state.gumball;

import javax.print.attribute.HashPrintJobAttributeSet;

public class GumballMachine {
    
    State soldOutState;
    State noEuroState;
    State hasEuroState;
    State soldState;

    State state;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noEuroState = new NoEuroState(this);
        hasEuroState = new HasEuroState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count > 0) {
            this.state = this.noEuroState;
        } else {
            this.state = this.soldOutState;
        }
    }

    public void insertEuro() {
        this.state.insertEuro();
    }

    public void ejectEuro() {
        this.state.ejectEuro();
    }

    public void turnCrank() { 
        this.state.turnCrank();
        this.state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out....");
        if (count > 0) {
            count--;
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
    }

	public State getHasEuroState() {
		return this.hasEuroState;
	}
}
