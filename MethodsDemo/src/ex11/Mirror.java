package ex11;

// 모든 메소드가 추상메소드 형태
// 멤버 변수는 없고 상수만 가능
public interface Mirror {
	
	// 상수(final)
//	public static final int MAX_AGE = 5;
	// 위의 public static final 생략 가능
	int MAX_AGE = 5;
	
	void autoClose(); // 미러 자동 접힘 기능
	void control(); // 거울 각도 조절 기능
}
