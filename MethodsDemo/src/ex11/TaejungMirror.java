package ex11;

public class TaejungMirror implements Mirror {

	@Override
	public void autoClose() {
		System.out.println("삐그덕 소리를 내며 접기");
		
	}

	@Override
	public void control() {
		System.out.println("삐그덕 소리를 내며 조절");
		
	}
}
