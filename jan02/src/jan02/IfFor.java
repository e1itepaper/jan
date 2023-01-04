package jan02;

import java.util.Iterator;

// 제어문
// 반복문 for, foreach, while, do~while
// 조건문 if, switch
public class IfFor {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		// whiled은 참일 때만 실행
//		while (1 == 2) {
//			System.out.println("*");
//		}

		// do - while은 참이든 거짓이든 무조건 한 번은 실행됨
		do {
			System.out.println("^");
		} while (1 == 2);

//		for(int i : 집합) { // 향상 for문
//			
//		}

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		// 조건식
//		if (조건식1) {
//			참일때
//		} else if(조건식2){
//			조건식 1이 거짓이고 조건식2가 참일 때
//		} else{
//			거짓일때
//		}

		int num = 5;
		if (10 < num && 15 > num) {

		} else {

		}

		// switch(스위치)
		switch (num) {
		case 1:
			System.out.println("num은 1입니다");
			break;

		case 2:
			System.out.println("num은 2입니다");
			break;
		default:
			break;
		}

	}
}
