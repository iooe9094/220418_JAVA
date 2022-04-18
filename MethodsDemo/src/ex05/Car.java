package ex05;

public class Car {
	// 멤버변수 : 이름, 메이커, 가격
	// 생성자 2개 -> 기본 + 매개변수 3개 생성자
	// 메소드 : 멤버변수의 값을 출력할 메소드
	
    String name;
    String maker;
    int price;
    
	public Car(String name, String maker, int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
	}

	public Car() {
		
	}
	
	public void show() {
		System.out.println("이름 = " + name + " / 메이커 =  " + maker + " / 가격 = " + price);
	}
	
	
    
    

}
