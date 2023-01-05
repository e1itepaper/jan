package enum01;

// Enum : 열거 타입
// 열거한 데이터만 쓸 수 있습니다.
// 같은 값으 ㄴ가질 수 ㅇ벗습니다.
// ENUM은 클래스명과 중복될 수 없습니다.
// 잘 사용하지 않음!
enum Week {
	MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class Enum01 {
//	↓↓↓↓↓ 이런 식으로 쓰는 것보다 ENUM을 쓰는게 더 효율적임
//	static final String mon = "월요일";
//	static final String tue = "화요일";

	public static void main(String[] args) {
		Week week = Week.FRI;
//		String se = Week.FRI; // 데이터 타입이 달라서 이렇게 쓸 수 없음 Week로만 받아야함

		var number = 10; // java 10버전에 도입된 변수 var
		// 값으로 데이터타입을 추론합니다. 지역변수로만 가능 
		// 꼭 초기화 후 사용, null 초기화 안 됨. 배열 사용 불가
		System.out.println(number);
		
		var name ="홍길동";
		String str = name;
		
		var test = 1.1; // 실수 타입으로 변환
	}
}
