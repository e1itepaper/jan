package str;

import obj.Human;

public class Starter {
	public static void main(String[] args) {

		// Human 클래스를 불러서 인스턴스 만들기
		Human human = new Human();

		// public이 붙지 않으면 다른 패키지 있는 변수(필드)를 불러와 사용 할 수 없음
		human.age = 10;
		human.show();
	}
}
