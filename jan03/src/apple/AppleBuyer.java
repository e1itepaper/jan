package apple;

public class AppleBuyer {
// 필요한 필드
	// 가지고 있는 돈
	int buyerMoney = 5000;
	// 사과의 수
	int appleCount;
	// 인스턴스가 생성되면 기본값을 가져감.
	// 정수 0, 실수 0.0, char 0, boolean false, R타입 null

// 필요한 메소드
	// 사과를 사는 행동
	public void buyApple(AppleSeller seller, int money) {
		appleCount += seller.saleApple(money); // 산 사과의 수
		buyerMoney -= money; // 사과를 사고 남은 돈

	}

	// 내 정보를 말하는 행동
	public void tellBuyer() {
		System.out.println("구매한 사과는 " + appleCount + "개 입니다.");
		System.out.println("남은 돈은 " + buyerMoney + "원 입니다.");
	}
}
