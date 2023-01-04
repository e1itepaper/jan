package obj;

public class Human {
	// 필드 : 변수, 정보 저장
	// public이 붙지 않으면 다른 패키지에서 사용할 수 없음(해당 패키지에서만 사용가능)
	public int age; // 접근지정자 붙이기(access/AccessModifier.java 참고)
	public String name;
	// 생성자 : 인스턴스를 생성하는 코드
	// 메소드 : function, 기능
	Animal ani;

	public void show() {
		ani = new Animal();
		ani.age = 10;
		ani.setName("홍길동");
		System.out.println(ani.getName());
	}
}

// private의 값을 저장, 호출할 때 필요한 메소드 getter, setter(우회해서 사용하는 방법) 
class Animal {

	private String name; // 다른 클래스에서 볼 수 없음
	int age;

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// 내부의 비밀스러운 동작을 위해서 외부에서 못 보게 할 때 private 사용
	private void sleep() {
		System.out.println("비밀스럽게 잡니다.");
	}


}