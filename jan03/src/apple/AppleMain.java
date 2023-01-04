package apple;

import java.util.Scanner;

public class AppleMain {

	public static void main(String[] args) {
		
		//인스턴스 객체 생성
		AppleSeller seller = new AppleSeller();
		AppleBuyer buyer = new AppleBuyer();
		Scanner sc = new Scanner(System.in);
		seller.tellSeller();
		buyer.tellBuyer();
	}

}
