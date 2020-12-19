package state.gumball;

public class SoldOutState implements State {
    
    private GumballMachine gumballMachine; 

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertEuro() {
        // TODO Auto-generated method stub

    }

    @Override
    public void ejectEuro() {
        // TODO Auto-generated method stub

    }

    @Override
    public void turnCrank() {
        // TODO Auto-generated method stub

    }

    @Override
    public void dispense() {
        // TODO Auto-generated method stub

    }

    @Override
    public void refill() {
        // TODO Auto-generated method stub

    }

}
