package my.designpatterns.state;

public class SoldOutState implements State {
	private GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("매진입니다. 다음 기회에 이용해주세요.");
	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("매진입니다.");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("매진입니다.");
	}

}
