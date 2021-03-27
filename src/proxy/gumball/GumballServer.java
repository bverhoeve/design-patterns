package proxy.gumball;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballServer {
    public GumballServer() {
        try {
            int count = 10;
            String gumballName = "Machineo";
            GumballMachineRemote gumballMachine = new GumballMachine(gumballName, count);
            Registry registry = LocateRegistry.createRegistry(8080);
            Naming.rebind("gumballMachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args) {
        new GumballServer();
    }
}
