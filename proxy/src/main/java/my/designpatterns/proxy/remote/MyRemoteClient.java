package my.designpatterns.proxy.remote;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {
	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost", 6000);
		MyRemote remote = (MyRemote) registry.lookup("korkorna");
		System.out.println(remote.sayHello());
	}
}
