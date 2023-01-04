package jan02;

public class OOP01 {
	public static void main(String[] args) {
		// 인스턴스화 하기 = 객체 생성하기
		// 데이터타입 변수명 = 값;
			int 	  num 	 = 10; // 기본 타입
			Human 	 human	 = new Human(); // 참조 타입
			Human 	 human2  = new Human();
			String 	 str 	 = new String("Hi");

		// 호출
		// 객체명.메소드명();
		human.sleep();
		human2.sleep();
		
		human.eat("볶음밥");
		human2.eat("김치찌개");

		// 객체가 생성될 때 기본 값을 가져감
		System.out.println(human.age); // 0
		System.out.println(human.name); // null

		human.age = 150;
		human.name = "R2D2";
		human2.age = 10;
		human2.name = "3P0";
		System.out.println(human.age); // 150
		System.out.println(human.name); // R2D2
		System.out.println(human2.age); // 10
		System.out.println(human2.name); // 3P0

		Human human3 = human2;
		System.out.println(human2 == human3); // true
		human3.age = 33;
		human3.name = "냐옹이";
		System.out.println(human3.age);// 33
		System.out.println(human3.name); // name
		System.out.println(human2.age); // 33
		System.out.println(human2.name); // name
		// 주의 ! 객체는 new로 생성하는게 나음

		Animal cat = new Animal();
		Animal dog = new Animal();
		System.out.println(cat == dog); //false
		cat.name = "땅이";
		cat.sleep();
		dog.name = "오복이";
		dog.sleep();
	}
}

class Human { // public은 파일명과 같은 클래스에만 붙일 수 있음
	int age; // 인스턴스 변수, 멤버 필드 = 정보
	String name;

	public void sleep() { // 메소드 = 기능
		System.out.println("Zzzzzzzzzzzz...");
	}

	public void eat(String thing) {
		System.out.println(thing + " 먹습니다.");
	}
}// Human 클래스 끝

class Animal {
	int age, hp;
	String name, ssn, home;
	
	void add(){
		
	}
	public void sleep() {
		System.out.println(name + "가 잠을 자요.");
	}

}
