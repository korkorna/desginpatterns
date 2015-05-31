package my.designpatterns.state;

public class SoldState implements State{
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.");
	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("이미 알맹이를 뽑았습니다.");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("손잡이를 한번만 돌려주세요.");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			System.out.println("매진되었습니다.");
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
	}

}
