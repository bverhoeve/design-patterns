package state.gumball;

public class GumballMachineTest {
    
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertEuro();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertEuro();
        gumballMachine.ejectEuro();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertEuro();
        gumballMachine.turnCrank();
        gumballMachine.insertEuro();
        gumballMachine.turnCrank();
        gumballMachine.ejectEuro();

        System.out.println(gumballMachine);

        gumballMachine.insertEuro();
        gumballMachine.insertEuro();
        gumballMachine.turnCrank();
        gumballMachine.insertEuro();
        gumballMachine.turnCrank();
        gumballMachine.insertEuro();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
