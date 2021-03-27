package proxy.gumball;
import java.rmi.RemoteException;
import java.rmi.Remote;

public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
