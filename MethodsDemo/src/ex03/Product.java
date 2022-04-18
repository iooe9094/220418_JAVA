package ex03;

public class Product {
	
	String no;
	String name;
	int price;
	double discountRate;
	
	// 매개변수가 있는 생성자
	public Product(String no, String name, int price, double discountRate) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	// 기본생성자 (매개변수 있어서 안해도 실행 됨)
	public void Product() {
		
	}

	// 멤버변수 출력용 메소드
	public void info() {
		System.out.println(this.no + " " + this.name + " " + this.price + " " + this.discountRate);
	}

}
