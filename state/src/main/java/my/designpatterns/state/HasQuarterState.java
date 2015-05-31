package my.designpatterns.state;

import java.util.Random;

public class HasQuarterState implements State{
	private GumballMachine gumballMachine;
	private Random randomWinner = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 한개만 넣어주세요.");
	}
	
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 반환합니다.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("손잡이를 돌렸습니다.");
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 나갈 수 없습니다.");
	}
	
}
