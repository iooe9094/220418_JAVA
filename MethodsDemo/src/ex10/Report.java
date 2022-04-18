package ex10;

public class Report {
	// 온갖 그래프 출력 기능 구현
	// 컬러, 흑백 , 컬러+흑백 등 새로운 기능이 추가될 것을 예상하고 메소드 생성
	// 즉, 다형성 메소드를 고려해야함
	// spring DI 형태 (의존성 주입)
	public void drawing(Graph g) {
		g.draw();
	}
}
