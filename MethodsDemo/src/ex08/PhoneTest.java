package ex08;

public class PhoneTest {

	public static void main(String[] args) {
		// 아이폰과 갤럭시의 기능을 모두 출력
		
		// 기본 풀이
		IPhone iphone = new IPhone();
//		System.out.println("IPhone의 기능");
//		iphone.facetime();
//		iphone.itunes();
//		
		Galaxy galaxy = new Galaxy();
//		System.out.println("Galaxy의 기능");
//		galaxy.dmb();
//		galaxy.navi();
//		
//		Phone phone = new Phone();
//		System.out.println("Phone의 기본 기능");
//		phone.call();
//		phone.sms();
		
		// 다형성 풀이
		// 다형성 메소드 : 매개변수로 부모 클래스가 있는 메소드
		testAllPhone(iphone);
		testAllPhone(galaxy);
	}
	
	public static void testAllPhone(Phone p) {
		
		// 공통 기능
		p.call();
		p.sms();
		
		if (p instanceof IPhone) {
			IPhone iphone = (IPhone)p; // 형변환
			// 아이폰 특수 기능
			iphone.facetime();
			iphone.itunes();
		} else if (p instanceof Galaxy) {
			Galaxy galaxy = (Galaxy)p; // 형변환
			// 갤럭시 특수 기능
			galaxy.dmb();
			galaxy.navi();
		}
	}

}
