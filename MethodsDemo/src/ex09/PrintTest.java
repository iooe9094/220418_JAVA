package ex09;

public class PrintTest {
	
	public static void main(String[] args) {
	LaserPrinter p1 = new LaserPrinter();
	ColorPrinter c1 = new ColorPrinter();
	
	// 부모에 들어갈 메소드 이름 : print()
	testAllPrint(p1); // 레이저로 선명하게 출력
	testAllPrint(c1); // 컬러로 출력
    }

	private static void testAllPrint(Printer p) {
		// 오버라이딩 메소드는 형변환이 필요 없음.
		// 부모자식 간 일반메소드는 형변환 필요
		p.Print();
	}
}

