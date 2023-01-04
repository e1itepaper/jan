package dog;

import java.util.HashSet;
import java.util.Set;

import animal.Animal;
import animal.Human;

public class Dog extends Animal {

	// 1 ~ 45 숫자 중 6개를 뽑아주는 개
	public Set<Integer> lotto() {
		Set<Integer> lotto = new HashSet<Integer>(); // 중복제거
		while (lotto.size() < 6) { // size() : 몇개가 저장되어있는지
			lotto.add((int) (Math.random() * 45) + 1);
		}
		return lotto;
	}

	@Override
	public void sound() {
//		super.sound(); // 재정의해서 사용할 것이기때문에 필요 없음
		System.out.println("왕왕!");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
//		Animal ani = new Animal();
		Dog dog = new Dog();

		// >>다른 패키지일 경우!!<<
		// 부모 클래스에서 default로 필드 생성하면 자식 클래스에서 사용 불가
		// protected로 필드 생성시 사용가능
		dog.age = 10;
		Human human = new Human();
		human.setSsn("990105-11-");// 저장
		System.out.println(human.getSsn());// 출력

		Set<Integer> lotto = dog.lotto();
		System.out.println(lotto);
		System.out.println(dog.lotto());
	}

}
