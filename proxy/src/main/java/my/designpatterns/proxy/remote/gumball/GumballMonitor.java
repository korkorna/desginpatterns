package my.designpatterns.proxy.remote.gumball;

import java.rmi.RemoteException;

public class GumballMonitor {
	GumballMachineRemote machine;

	public GumballMonitor(GumballMachineRemote machine) {
		super();
		this.machine = machine;
	}
	
	public void report() {
		// TODO Auto-generated method stub
		try {
			System.out.println("뽑기 기계 위치 : " + machine.getLocation());
			System.out.println("현재 재고 : " + machine.getCount());
			System.out.println("현재 상태 : " + machine.getState());
		} catch (RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
