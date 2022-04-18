package ex06;

public class StaticVarTest {

	public static void main(String[] args) {
		
		StaticVar sv1 = new StaticVar();
		
		// 일반, 전역변수 1씩 증가시키기
		sv1.increase();
		
		// x는 일반변수, y는 전역변수
		System.out.println("x = " + sv1.x + ", y = " + StaticVar.y);
		
		StaticVar sv2 = new StaticVar();
		
		// 일반, 전역변수 1씩 증가시키기
		sv2.increase();
		
		// x는 일반변수, y는 전역변수
		System.out.println("x = " + sv2.x + ", y = " + StaticVar.y);
		
		StaticVar sv3 = new StaticVar();
		
		// 일반, 전역변수 1씩 증가시키기
		sv3.increase();
		
		// x는 일반변수, y는 전역변수
		System.out.println("x = " + sv3.x + ", y = " + StaticVar.y);
		
		// 일반변수 sv.1은 고정값, 전역변수 StaticVar.y는 증가가 됨
		// static 메서드를 호출할 때 마다 y++가 되어 증가함
	}

}
