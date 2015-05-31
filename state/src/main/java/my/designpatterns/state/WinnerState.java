package my.designpatterns.state;

public class WinnerState implements State{
	private GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.");
	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("이미 알맹이를 뽑으셨습니다.");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("손잡이를 한번만 돌려주세요.");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("축하드립닏.ㅏ 알맹이를 하나 더 받으실 수 있습니다.");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("매진입니다.");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
