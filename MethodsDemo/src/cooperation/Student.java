package cooperation;

public class Student {
	
	// 멤버변수 : 학생이름, 학년, 돈
	private String name;
	private int grade;
	private int money;
	
	// 생성자 : 이름과 돈을 초기화
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 메소드 : 버스타기 takeBus(Bus bus)
	public void takeBus(Bus bus) {
		bus.take(1000); // 버스 요금 1000원 소비
		// 학생 돈 감소
		this.money -= 1000;
	    
	}
	
//	public void takeSubway(Subway subway) {
//		subway.take(1500); // 지하철 요금 1500원 소비
//		// 학생 돈 감소
//	}
	
	public void showInfo() {
		// 잔액 출력
		System.out.println("학생이름 = " + this.name + "의 남은 돈은 " + this.money + "원 입니다.");
	}
}
