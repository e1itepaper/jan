package staticTest;

//static 키워드
/*
 * static은 정적이라는 의미가 있다. 
 * 자바에서는 동적과 정적이라는 개념으로 구분합니다.
 * 정적은 클래스가 로드되는 시점을 이야기하고
 * 동적은 로드된 클래스가 실행된 이후를 이야기합니다.
 * 
 * 이 중 객체는 동적 데이터라고 해서 프로그램이 실행된 이후에 발생되는 대표적인 형태임
 * 
 * 정적 멤버 :	인스턴스를 만들지 않고 사용할 수 있는 멤버.
 * 			  	모든 객체를 통틀어서 하나만 생성되고 모든 객체가 그것을 공유함.
 *				클래스명.멤버명으로 호출함.
 *				클래스에 의지함. 인스턴스와 별개의 것.
 *
 * 인스턴스 멤버 :  인스턴스 생성시 가지게 되는 자신의 변수
 * 					별도의 기억공간을 가지고 객체마다 각각 다른 값을 가짐
 *					인스턴스명.멤버명으로 호출함.
 *
 * 				
 * 
 */
public class Static01 {
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		// static 붙으면 객체 생성없이 호출가능
		add(12, 12); // 같은 클래스라면 클래스명 제거 가능
		Calc.add(12, 12); // 다른 클래스라면 클래스명.메소드명();

//		Calc.div(24,12); // 아래와 같이 객체 생성후 사용해야 함.
		Calc calc = new Calc();
		calc.div(24, 12);
		Calc.num = 10;

	}
}

class Calc {

	public int number;
	static int num;

	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
		num = num1 + num2; // static이 static 호출 가능
//		number = num1 + num2; // static이 non-static 호출 불가
//		div(200, 10); //  static이 non-static 호출 불가, 객체 생성 후 가능
	}

	public void div(int num1, int num2) {
		System.out.println(num1 / num2);
		num = num1 + num2;// non-static이 static 호출 가능
		number = num1 + num2; // non-static이 non-static 호출 가능
		add(10, 50);
	}
}
/* >>주의 사항<<
 * 객체가 생성되지 않은 상태에서 호출되는 메소드임.
 * 객체 안에서만 존재하는 인스턴스 변수들을 사용할 수 없음.
 * 정적변수와 지역변수만 사용가능함.
 * 
 * 정적 메소드에서 인스턴스 메소드를 호출하면 에러남.
 * 인스턴스 메소드도 객체가 생성되어야만 사용할 수 있기 때문임.
 * 
 * 정적 메소드에서 정적 메소드를 호출 가능
 * 정적 메소드는 this키워드를 사용할 수 없다.
 * 				 this키워드는 인스턴스가 사용가능함.
 * 
 * final 붙은 상수는 수정 불가이지만,
 * 객체를 만들지 않고 사용하면 좋음. 그래서 static을 붙임
 */
