package ex07;

public class Account {
	// 멤버변수 : 이름, 잔액, 패스워드
	private String name;
	private int price;
	private int password;
	
	// 생성자 : 매개변수 3개짜리
	public Account(String name, int price, int password) {
		this.name = name;
		this.price = price;
		this.password = password;
	}
	
	// 메소드 : deposit (입금액, 패스워드)
	public void deposit(int x, int y) {
		if(y == this.password) {
			this.price += x; // 잔액증가(누적합)
			System.out.println(this.name + " 고객님 " + x + "원 입급되었습니다.");
			System.out.println("현재 잔액은 " + this.price + "원 입니다.");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			System.out.println("다시 입력해 주시기 바랍니다.");
		}
	}

	// 출력 : 이름 + "고객님" + 입금액 + "원이 입금되었습니다."
	// 출력 : "현재 잔액은" + 잔액 + "원입니다."
}
