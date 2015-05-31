package my.designpatterns.state;

public class GumballMachine {
	
	/*상태 정보*/
	private State soldOutState;		//제품 매진
	private State noQuarterState;	//동전 없음
	private State hasQuarterState;	//동전 있음
	private State soldState;		//제품 있음
	private State winnerState;		//보너스 추가 
	
	private State state = soldOutState;				//최초 상태는 매진상태
	private int count = 0;
	
	public GumballMachine(int numberGumballs) {
		super();
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		if(count > 0) {
			this.state = noQuarterState;
		}
	}
	
	/**
	 * 동전을 투입한다.
	 */
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	/**
	 * 동전을 반환한다. 
	 */
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	/**
	 * 손잡이를 돌린다.
	 */
	public void turnCrank() {
		state.turnCrank();
	}

	
	/**
	 * 제품 꺼내기
	 */
	public void dispense() {
		state.dispense();
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}

	public void setState(State state) {
		// TODO Auto-generated method stub
		this.state = state;
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0) {
			count = count -1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public int getCount() {
		return count;
	}
	
}
