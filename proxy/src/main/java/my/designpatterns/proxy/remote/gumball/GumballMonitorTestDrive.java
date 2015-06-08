package my.designpatterns.proxy.remote.gumball;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMonitorTestDrive {
	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry registry =  LocateRegistry.getRegistry("localhost", GumballMachineTestDrive.RMI_PORT);
		GumballMachineRemote machine = (GumballMachineRemote) registry.lookup(GumballMachineTestDrive.RMI_ID);
		GumballMonitor monitor = new GumballMonitor(machine);
		monitor.report();
	}
}
