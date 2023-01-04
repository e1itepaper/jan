package apple;

// 사과장수
public class AppleSeller {
// 필요한 정보는?
	// 사과 수
	int appleCount = 100;
	// 사과 가격
	final int APPLE_PRICE = 1000; // 상수처리 final 수정불가
	// 가지고 있는 돈
	int sellerMoney = 0;

// 필요한 메소드는?
	// 사과 파는 행동
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		sellerMoney += money; // 받은 돈 +
		appleCount -= num; // 판 사과 개수 -
		return num; // 결과값을 되돌려 줌.
	}

	// 자신의 정보 말하는 행동
	public void tellSeller() {
		System.out.println("남은 사과는 " + appleCount + "개 입니다.");
		System.out.println("수익은 " + sellerMoney + "원 입니다.");
	}

}
