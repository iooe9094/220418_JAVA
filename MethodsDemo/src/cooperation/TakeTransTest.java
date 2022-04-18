package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100); // 100번 버스를 탑니다.
		james.takeBus(bus100);
		tomas.takeBus(bus100);
		
		// 학생 정보 출력
		james.showInfo();
		tomas.showInfo();
		
		// 버스 정보 출력
		bus100.showInfo();
	}

}
