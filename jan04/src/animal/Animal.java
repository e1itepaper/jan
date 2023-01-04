package animal;

// 추상 클래스로 변환
public abstract class Animal /* extends Object (생략되어있는 것) */ {
	protected int age;
	protected String name;

//	public void sound() {
//		System.out.println("동물마다 달라요.");
//	}
//	↓↓↓↓↓ 추상 메소드로 변환 // 추상메소드가 있으면 클래스도 추상클래스로 변환 해줘야함
	public abstract void sound(); // 추상메소드는 바디가 없음(변수와 추상메소드 구분!!)

	public abstract void add(); 

	public void thehagi() {

	}

	public void eat() {
		System.out.println("먹이를 먹습니다.");
	}
}
