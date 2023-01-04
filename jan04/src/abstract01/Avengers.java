package abstract01;

public class Avengers {
	public static void main(String[] args) {
		IronMan ironman = new IronMan();
		Hulk hulk = new Hulk();
		Thor thor = new Thor();

		ironman.attack();
		hulk.attack();
		thor.attack();

		
		// 한꺼번에 공격하게 하기
		Hero[] avan = new Hero[3];
		avan[0] = ironman; // 부모타입이더라도 생성은 IronMan
		avan[1] = hulk;
		avan[2] = thor;
		
		for (int i = 0; i < avan.length; i++) {
			avan[i].attack();
		}
		
		//다형성
		Hero h1 = new IronMan();
		
		h1.attack();
		h1.defense();
		
		((IronMan)h1).jarvis="";
		((IronMan)h1).callJarvis();
		
		IronMan h2 = (IronMan) h1;
		h2.callJarvis();
		//부모타입, super타입으로 변환가능
		
		
		
 	}
}

/*	>>다형성<<
 * 	다형성은 동적 바인딩을 지원해야함.
 * 	런타임 때 최종 타입이 결정되는 것
 * 	다형성의 한계 : 상위 클래스에 만들어진 메소드에 한해 가능 
 */













