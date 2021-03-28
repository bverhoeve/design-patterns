package proxy.gumballmonitor;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		int count = 10;
		String gumballName = "Machineo";
        
		GumballMachine gumballMachine = new GumballMachine(gumballName, count);
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
 
		monitor.report();

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		monitor.report();

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		monitor.report();

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		monitor.report();

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		monitor.report();

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		monitor.report();

	}
}
