package test;

import java.util.Arrays;

public class Calc {

	public int add(int num1, int num2) {
//		System.out.println(num1 + num2);
		int result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {
		Calc calc = new Calc();
//		int result = calc.add(10, 30);
//		System.out.println(calc.add(10, 30));

//		String result = calc.print("홍길동");
//		System.out.println(calc.print("홍길동"));


		int[] arr = calc.makeArray(4, 8);
//		for(int a :arr) {
//			System.out.print(a+" ");
//		}
		System.out.println(Arrays.toString(arr));
		
		//쌤 코드
		int[] arr2 = calc.makeArray2(4, 10);
		System.out.println(Arrays.toString(arr2));

	}

	String print(String name) {
		return "입력하신 이름은 " + name + "입니다.";
	}

	
	
	// 문제1, 파라미터 int 타입 두 개를 받습니다.
	// 앞 숫자는 시작 숫자, 뒷 숫자는 끝 숫자입니다.
	// for문을 돌려 값을 배열에 저장해서 리턴해주세요
	// 예) (4,8) ---> 4,5,6,7,8

	int[] makeArray(int num3, int num4) {

		int[] arr = new int[num4 - num3 + 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = num3 + i;
		}

		return arr;

	}
	
	// 쌤 코드
	int[] makeArray2(int num5, int num6) {
		int[] arr2 = new int[num6 - num5 + 1];

		for (int i = num5, index = 0; i <= num6; i++) {
			arr2[index++] = i;

		}
		return arr2;
	}
}
