package jan02;

public class DataType {
	public static void main(String[] args) {
		// P타입(기본타입)
		/*
		 * 정수 타입 = 1, 100, 205 byte short int long
		 * 
		 * 실수 타입 = 3.14, 0.0005 float double
		 * 
		 * 문자 타입 = 가, A, @ (한 글자) char
		 * 
		 * 논리 타입 = 참, 거짓 boolean
		 */

		// 데이터타입 변수명 = 값;
		byte bNum = 127; // 초기화 = 리터럴
		// byte int
		bNum = (byte) 128; // -128 출력
		bNum = (byte) 129; // -127 출력
		bNum = (byte) 130; // -126 출력
		bNum = (byte) -129; // 127 출력
		bNum = (byte) 256250; // -6 출력 // 캐스팅 = 값 절삭이 발생함
		System.out.println("      " + bNum);

		short sNum = bNum; // 프로모션

		System.out.println(sNum); // -6

		bNum = (byte) sNum;
		System.out.println(bNum); // -6

		sNum = 32767;
		sNum = (short) 32768; // -32768
		System.out.println(sNum);

		int iNum = sNum + bNum + 125652;

		// 자바에서 사용하는 모든 숫자는 int를 기본으로 씀.
		// long으로 설정해도 표식자를 쓰지 않으면 long의 최대값까지 쓸 수 없음
//		long lNum = 2147483647; // int의 최대값

		// L을 쓰면 long의 최대값까지 쓸 수 있음.
		long lNum = 9223372036854775807L; // 표식자 L D F
		System.out.println(lNum);

		// =을 기준으로 왼쪽 오른쪽의 데이터타입이 같아야함(왼쪽 기준으로)
		iNum = (int) lNum;
		sNum = (short) iNum;
		bNum = (byte) sNum;
		System.out.println(bNum);

		// 실수
		// 실수 기본타입을 double으로 봄
//		float fNum = (float) 3.14; 
		float fNum = 3.14F;
		System.out.println(fNum); // 3.14

		double dNum = fNum;
		iNum = 3;
		dNum = 127;
		System.out.println(dNum); // 127.0

		iNum = (int) fNum; // 원래 fNum : 3.14
		System.out.println(iNum); // int로 cast 후 : 3

		// 1 2 4 8 4 8
		// byte < short < int < long < float < double

		// 문자 타입(한 글자만 가능)
		char ch = '가';
		System.out.println(ch);

		ch = 'A';
		ch = '^';
		ch = '@';
		ch = '藝';
		ch = 65; // A (아스키코드)
//		ch ='가나다'; //'가나다'는 문자열이기 때문에 안됨.
		System.out.println(ch);

		// 8진수 출력
		int iNum02 = 010;
		System.out.println(iNum02);

		// 16진수 출력 = 0 1 2 3 4 5 6 7 8 9 A B C D E F
		int iNum03 = 0x10;
		System.out.println(iNum03);
//						1  2  3	  4	   5	6	 7	  8 		
		// 2진수 출력 = 0, 1, 10, 11, 100, 101, 110, 111
		int iNum04 = 0b0100;
		System.out.println(iNum04);

		// 2진법으로 12를 출력해주세요
		System.out.println(0b1100);

		// 8진법으로 12를 출력해주세요
		System.out.println(014);

		// 16진법으로 12를 출력해주세요
		System.out.println(0xC);

		System.out.println(Integer.toBinaryString(12)); // 12를 2진수로
		System.out.println(Integer.toOctalString(12)); // 12를 8진수로
		System.out.println(Integer.toHexString(12)); // 12를 16진수로

		// boolean = 참, 거짓
		boolean bool = false;
		bool = true;
		System.out.println(bool);
		System.out.println(1 == 2);
		System.out.println(bool == true);
		System.out.println(bool == !false);
	}
}
