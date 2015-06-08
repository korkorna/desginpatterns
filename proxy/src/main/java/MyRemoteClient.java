import java.rmi.Naming;

import my.designpatterns.proxy.remote.MyRemote;


public class MyRemoteClient {
	
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			
			String s = service.sayHello();
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
