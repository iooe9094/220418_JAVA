package ex02;

public class PersonDemo {

	public static void main(String[] args) {
		// 문제 1번. Person 클래스 생성
		// 멤버변수 - name : "" / age : 0 / email : ""
		// setter 이용해서 아래 값을 저장
		// 객체 p1 : name = "홍길동" / age = 23 / email = hong@gmail.com
		// 객체 p2 : name = "김유신" / age = 44 / email = kim@gmail.com
		// 출력 : getter 이용해서 print 출력
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setEmail("hong@gamil.com");
		p1.setAge(24);
		p1.setName("Hong");
		
		p2.setEmail("Kim@gamil.com");
		p2.setAge(44);
		p2.setName("Kim");
		
		System.out.println(p1.getName() + ", " + p1.getAge() + ", " + p1.getEmail());
		System.out.println(p2.getName() + ", " + p2.getAge() + ", " + p2.getEmail());
	}
}
