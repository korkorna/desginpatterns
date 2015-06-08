package my.designpatterns.proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4129943538606252979L;

	protected MyRemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Server says, 'Hey'";
	}
	
	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
//			Naming.rebind("RemoteHello", service);
			Registry registry = LocateRegistry.createRegistry(6000);
			registry.bind("korkorna", service);
			System.out.println("Start server!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
