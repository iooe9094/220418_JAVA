package cooperation;

public class Bus {
	
	// 멤버변수 : 버스번호, 승객수, 버스수입
	private int busNum;
	private int busPassenger;
	private int busEarn;
	
	// 매개변수 1개 생성자
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	// 승객이 낸 돈을 받는 메소드
	public void take(int money) {
		// 버스 돈 증가
		this.busEarn += money;
		// 승객 수 증가
		this.busPassenger += 1;
		// 또는 this.busPassenger++;
	}
	
	// 현재 버스 승객 수와 버스 잔액 출력
	public void showInfo() {
		// print 출력 : "버스" + 버스번호 + "번의 승객은" + 승객수 + "명이고, 수입은 " + 버스돈 + "입니다."
		System.out.println("버스" + busNum + "번의 승객은 " + busPassenger + "명이고, 수입은 " + busEarn + "원 입니다.");
	}
}
