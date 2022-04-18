package ex11;

public class Genesis {
	
	// Mirror 멤버 변수를 정의 / 객체도 멤버 변수 가능
	Mirror m;
	
	// 다형성 메소드 : 생성자 : spring DI(의존성 주입)
	public Genesis(Mirror m) {
		this.m = m;
	}
	
	public void powerOff() {
		System.out.println("시동끄기");
		m.autoClose();
	}
	
	public void joystic() {
		System.out.println("조절기능");
		m.control();
	}
}
