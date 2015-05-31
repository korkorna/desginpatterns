package my.designpatterns.state;

public class GumballMachine {
	
	/*상태 정보*/
	private final static int SOLD_OUT = 0;		//제품 매진
	private final static int NO_QUARTER = 1;	//동전 없음
	private final static int HAS_QUARTER = 2;	//동전 있음
	private final static int SOLD = 3;			//제품 있음
	
	private int state = SOLD_OUT;				//최초 상태는 매진상태
	private int count = 0;
	
	public GumballMachine(int count) {
		super();
		this.count = count;
		if(count > 0) {
			this.state = NO_QUARTER;
		}
	}
	
	/**
	 * 동전을 투입한다.
	 */
	public void insertQuarter() {
		if(state == HAS_QUARTER) {
			System.out.println("동전은 한개만 넣어주세요.");
		} else if(state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("동전을 넣었습니다.");
		} else if(state == SOLD_OUT) {
			System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
		} else if(state == SOLD) {
			System.out.println("잠깐만 기다려 주세요. 알맹이가 나오고 있습니다.");
		}
	}
	
	/**
	 * 동전을 반환한다. 
	 */
	public void ejectQuarter() {
		if(state == HAS_QUARTER) {
			state = NO_QUARTER;
			System.out.println("동전이 반환됩니다.");
		} else if(state == NO_QUARTER) {
			System.out.println("동전을 넣어주세요.");
		} else if(state == SOLD) {
			System.out.println("이미 제품을 뽑으셨습니다.");
		} else if(state == SOLD_OUT) {
			System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
		}
	}
	
	/**
	 * 손잡이를 돌린다.
	 */
	public void turnCrank() {
		if(state == SOLD) {
			System.out.println("손잡이는 한번만 돌려주세요.");
		} else if(state == NO_QUARTER) {
			System.out.println("동전을 넣어주세요.");
		} else if(state == SOLD_OUT) {
			System.out.println("매진되었습니다.");
		} else if(state == HAS_QUARTER) {
			System.out.println("손잡이를 돌렸습니다.");
			state = SOLD;
			dispense();
		}
	}

	
	/**
	 * 제품 꺼내기
	 */
	public void dispense() {
		if(state == SOLD) {
			System.out.println("알갱이가 나가고 있습니다.");
			count--;
			if(count == 0) {
				System.out.println("더 이상 알갱이가 없습니다.");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if(state == NO_QUARTER) {
			System.out.println("돈전을 넣어주세요.");
		} else if(state == SOLD_OUT) {
			System.out.println("매진입니다.");
		} else if(state == HAS_QUARTER) {
			System.out.println("알맹이가 나갈 수 없습니다.");
		}
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}
	
}
