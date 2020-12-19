package state.gumball;

public class NoEuroState implements State {

    GumballMachine gumballMachine;

    public NoEuroState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertEuro() {
        System.out.println("You've inserted an euro");
        // edit state of gumballmachine
        gumballMachine.setState(gumballMachine.getHasEuroState());

    }

    @Override
    public void ejectEuro() {
        System.out.println("You've haven't inserted an euro");

    }

    @Override
    public void turnCrank() {
        System.out.println(" You turned, but there's no euro");

    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");

    }

    @Override
    public void refill() {
        // TODO Auto-generated method stub

    }

    
    
}
