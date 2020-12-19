package state.gumball;

public interface State {

    public void insertEuro();
    public void ejectEuro();
    public void turnCrank();
    public void dispense();

    public void refill();
    
}
