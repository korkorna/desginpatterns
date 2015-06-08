package my.designpatterns.proxy.remote.gumball;

public class NoQuarterState implements State{
	private transient GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣으셨습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어주세요.");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어주세요.");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어주세요.");
	}
	
}
