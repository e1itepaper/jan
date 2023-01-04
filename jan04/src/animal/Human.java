package animal;

//Animal 클래스의 모든 것을 Human 클래스에서 쓸 수 있음
public class Human extends Animal {

	private String ssn; // 외부패키지에서 사용 불가

	// 정적 변수. 클래스에 의지
	final static int NUM = 101;
	static int check = 500;

	int add(int a, int b) {
		return a + b;
	}

	Object add(int a, String str) {
		return a + str;
	}

	// 같은 이름과 같은 파라미터(매개변수)를 가지고 있기 때문에 불가능
//	Object add(int a, int b) {
//		return a + b;
//	}

	@Override
	public void sound() {
//		super.sound(); // 재정의해서 사용할 것이기때문에 필요 없음
		System.out.println("집가고 싶다");

	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		// -기호빼기
		// replace(a,b)	a -> b로 바꾸는 명령어
		// replaceAll(a,b)	모든 a를 b로 바꾸는 명령어	 
		ssn = ssn.replace("-", "");
		if (ssn.length() == 13) {
			this.ssn = ssn;
		} else {
			// 모자란 자리 수만큼 *로 입력해서 저장하기
			// 080506*******
			while (ssn.length() != 13) {
				ssn += "*";
			}
			this.ssn = ssn;
		}
	}

	public static void main(String[] args) {

		Human human = new Human();
//		Object h = new Human();
//		부모			자식
//		Animal h2 = new Human();

		Human.check = 5000; // static붙은 필드는 클래스명.변수명으로 호출
//		Human.NUM = 15015; //final 붙어서 수정 불가

		int result = human.add(15, 30); // 반환타입이 있는 메소드기 때문에 맞춰줘야함
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
