package what;

//싱글턴 패턴
public class What {
	public static void main(String[] args) {
		Human h1 = Human.getInstance();
		Human h2 = Human.getInstance();
		Human h3 = Human.getInstance(); // 여러개를 만들어도 무조건 하나,,,,?
		System.out.println(h1 == h2);
	}
}

// 데이터베이스 연결시 사용(p.243)
class Human {

	private static Human human = new Human(); // 객체로 생성

	// 외부에서 열람, 사용 불가
	private Human() {

	}

	public static Human getInstance() {

		return human;

	}
}
