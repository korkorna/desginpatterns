package my.designpatterns.proxy.remote.gumball;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineTestDrive {
	public static final int RMI_PORT = 222;
	public static final String RMI_ID = "korkorna";
	
	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		int count;
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		try {
			count = Integer.parseInt(args[1]);
			
			gumballMachine = new GumballMachine(count, args[0]);
//			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
			Registry registry = LocateRegistry.createRegistry(RMI_PORT);
			registry.bind(RMI_ID, gumballMachine);
			System.out.println("GumballMachine is started!!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
