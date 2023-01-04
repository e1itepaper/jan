package inheritance;
//	상속 : 상위 클래스의 내용을 하위 클래스가 다 가져가서 자신의 것처럼 사용하는 것. 

//	상위 클래스 / 부모클래스				/ super class
//	하위 클래스 / 자식 클래스, 파생 클래스  / sub class

//	연결 : 자식 클래스 extends 부모 클래스{}

class Animal {
	int age;
	String name;

	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("동물이 탄생했습니다.");
	}
}

class NewHuman extends Human {
	public NewHuman(int age, String name, String ssn) {
		super(age, name, ssn);// 부모 생성자 호출

	}

	// 주민등록번호 앞자리만.. 부모거 가져다가 재정의해서 쓰기
	@Override // 어노테이션(표시기능)
	public void myInfo() {
//		super.myInfo();
		System.out.println(name + "의 주민등록번호는 " + ssn.substring(0, 6) + " 입니다.");
	}

}

class Human extends Animal {
	String ssn; // 주민등록번호

	public Human(int age, String name, String ssn) {
		super(age, name);// 부모의 생성자 호출
		this.ssn = ssn;
	}

	public void myInfo() {
		System.out.println(name + "의 주민등록 번호는 " + ssn + " 입니다.");
	}
}

class Dog extends Animal {
	public Dog(int age, String name) {
		super(age, name);
	}

	public void sound() {
		System.out.println("Bow Wow");
	}
}

class HoundDog extends Dog {// 단일 상속
	public HoundDog(int age, String name) {
		super(age, name);

	}
}

class Cat extends Animal {
	public Cat(int age, String name) {
		super(age, name);
	}

	public void sound() {
		System.out.println("Meow");
	}

}

class KoreaShortHair extends Cat { // Animal을 상속받는 Cat을 상속받는
	public KoreaShortHair(int age, String name) {
		super(age, name);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Human human = new Human(25, "애지", "9901052911111");

//		Dog dog = new Dog();
//		dog.age = 7;
//		dog.name = "";

		HoundDog houndDog = new HoundDog(7, "비비");
		houndDog.sound();

		KoreaShortHair koreaShortHair = new KoreaShortHair(5, "땅");
		koreaShortHair.sound();

		NewHuman human2 = new NewHuman(25, "나리", "990806-2845785");
		human2.myInfo();

	}
}
