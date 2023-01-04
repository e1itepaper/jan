package jan02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

//		char c1 = 'A';
//
//		Caesar caesar = new Caesar();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("암호화할 단어를 입력하세요");
//		String str = sc.nextLine();
//		for (int i = 0; i < str.length(); i++) {
//			char cc = str.charAt(i);
//			if ((cc < 91 && cc > 64) || (cc < 123 && cc > 96)) {
//				caesar.ecp(5, cc);
//			} else {
//				System.out.println("범위에 맞는 값이 아님");
//			}
//
//		}
//		System.out.println("\n암호화 완료");
//		sc.close();
	}
}

class Caesar {

	void ecp(int n, char c) {
		c += n;
		System.out.printf("%c", c);
	}
}