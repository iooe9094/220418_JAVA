package ex11;

public class MirrorTest {

	public static void main(String[] args) {
		
		TaejungMirror tm = new TaejungMirror();
		DongSungMirror ds = new DongSungMirror();
		
		// 다형성 클래스를 이용한 방법
		Genesis g1 = new Genesis(tm);
		Genesis g2 = new Genesis(ds);
		
		g1.powerOff();
		g2.powerOff();
	}

}
