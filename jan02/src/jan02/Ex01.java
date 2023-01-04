package jan02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Ascii ascii = new Ascii();
		System.out.println("문자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		ascii.print(c, c);
		sc.close();
	}

}

class Ascii {
	void print(char a, int b) {
		System.out.println(a + "는 아스키코드로 " + b + "입니다.");
	}
}
