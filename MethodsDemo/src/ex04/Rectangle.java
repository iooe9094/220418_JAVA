package ex04;

public class Rectangle {
	
	// 멤버변수 : 너비, 높이
	// 멤버메소드 : 면적 계산, 테두리 길이 계산(네 변을 모두 더하기)
	
	int width;
	int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void A() {
		int result = 0;
		result = (this.width * this.height);
		System.out.println("면적 = " + result);
	}
	
	public void B() {
		int result2 = 0;
		result2 = (this.width + this.height) * 2;
		System.out.println("둘레 = " + result2);
	}
}
