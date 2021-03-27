package proxy.gumball;

import java.rmi.Naming;

public class GumballMonitorClient {
    public static void main(String[] args) {
        GumballMonitor monitor = null;
        
        try {
            GumballMachineRemote gumballMachine = (GumballMachineRemote) Naming.lookup("rmi://localhost/gumballMachine");
            monitor = new GumballMonitor(gumballMachine);
            System.out.println(monitor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        monitor.report();
    }
}
