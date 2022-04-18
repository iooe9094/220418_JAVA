package ex03;

public class CartDemo {

	public static void main(String[] args) {
		// 생성자를 이용하여 정보 저장 및 출력
		// Cart 클래스 생성, 멤버 - owner = "홍길동"
		// Product 클래스 생성, 멤버 - no "" , name "", price 0, discountRate 0.0
		// Product 생성자를 이용해서 초기화
		// no - a-111 , name - "iphone", price - 800000, discountRate - 0.001
		// no - b-222 , name - "ipad", price - 1000000, discountRate - 0.002
		// p1.info() : 위의 정보들 전체 출력되게
		// Cart 클래스의 mycart 객체 정보 getter 이용하여 출력
		
		Cart mycart = new Cart();
		Product p1 = new Product("a-111", "iphone", 800000, 0.001);
		Product p2 = new Product("a-222", "ipad", 1000000, 0.002);
		
		p1.info();
		p2.info();
		
		mycart.setOwner("홍길동");
		
		System.out.println("mycart = " + mycart.getOwner());
	}

}
