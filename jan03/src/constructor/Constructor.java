package constructor;

// 생성자
/*
 * 생성자는 클래스가 인스턴스화 될 때 실제 인스턴스를 생성해주는 코드를 말함
 * 
 * 생성자는 그 외 아래와 같은 기능을 한다.
 * 1. 클래스의 객체 생성
 * 2. 멤버 필드 초기화
 * 3. 필요에 따라서 초기화 메소드를 실행
 * 
 *  다시 이야기 하면 생성자 없이 인스턴스를 발생시킬 수 없다.
 *  
 *  생성자의 형식
 *  생성자는 메소드와 유사하게 생겼지만 메소드와 기능적인 부분에서 차이가 있다.
 *  
 *  1. 생성자의 이름은 반드시 클래스 이름과 같아야 한다.
 *     만약 다를 경우에는 일반 메소드로 인식함.(중요!!)
 *  2. 메소드가 아니기 때문에 리턴타입이 없다.
 *  
 *  
 *  기본 생성자(Default Constructor)
 *  자바에서는 모든 클래스마다 컴파일시 기본 생성자를 제공함.
 *  단, 클래스에 생성자가 하나라도 있다면 제공하지 않는다.
 *  
 *  
 *  만약 하나 이상의 생성자를 정의한다면 기본 생성자는 없다.
 *  (생성자가 여러개 있을 수 있다.)
 *  
 *  기본 생성자는 파라미터가 없는 생성자를 말하고
 *  이를 이용해서 생성된 객체를 기본 객체라고 합니다.
 * 또한 모든 필드 값은 기본 값으로 초기화 된다.
 */
public class Constructor {

	public Constructor() { // 생성자 : 클래스명과 동일하고, 리턴이 없음.
		System.out.println("생성자를 호출했습니다.");
		con();
	}

	public void con() {

	}

	public static void main(String[] args) {
//		Constructor constructor = new Constructor(); // 기본 생성자
		Human h = new Human("날");
//		h.name = "땅";
		h.sleep();
		Human h2 = new Human(5, "봉식");
		h2.sleep();
		Human h3 = new Human("설");
		h3.sleep(2);
		Human h4 = new Human("오복");
		h4.sleep(3, "방석 위");
	}

}

class Human {
	int age;
	String name;

	public Human(String name) { // 생성자
		this.name = name;
	}

	public Human(int age, String name) { // 생성자
		this(name); // 생성자 호출 : 첫줄에 등장해야함.
		this.age = age;
//		this.name = name;
	}

	public Human(int age, String name, String ssn) {
		this(age,name);
//		this.ssn = ssn;

	}

	public void sleep() {
		System.out.println(name + "이(가) 잡니다.");
	}

	public void sleep(int time) {
		System.out.println(name + "이(가) " + time + "시간 동안 잡니다.");
	}

	public void sleep(int time, String spot) {
		System.out.println(name + "이(가) " + spot + "에서 " + time + "시간 동안 잡니다.");
	}

	// >>오버로드<< (책 p.208)
	/*
	 * 같은 이름의 메소드 또는 생성자를 정의할 때 같은지를 판별하는 요소로 적용되는 기준을 메소드 혹은 생성자 시그니처라고 합니다.
	 * 
	 * 이 시그니처는 파라미터의 수, 순서, 타입이 모두 같다면 같은 메소드/생성자로 인지합니다. 하나라도 다르다면 다른 메소드/생성자로
	 * 인지합니다.
	 * 
	 * 호출할 때 호출하는 파라미터를 보고 해당 메소드/생성자를 호출합니다. 
	 * 이렇게 같은 이름이나 파라미터를 다르게 사용하는 기술을 
	 * 메소드 오버로드라고 합니다. (나중에 비슷한 이름으로 오버라이드/오버라이딩도 나옵니다. 조심하세요!!)
	 * 
	 * 
	 */
}
