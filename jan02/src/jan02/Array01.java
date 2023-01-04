package jan02;

// 배열 : 같은 값이 줄지어 있음
public class Array01 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		// index : 값이 저장된 위치 = 0 1 2 3 4 5 6 7 8 9
		// length : 배열의 길이 10

		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
		}

		int[] s = { 1, 3, 5, 8, 13, 17, 20,21 };
		int min = 100;
		int result = 0;
		int s1 = 0, s2 = 0;
		for (int i = 0; i < s.length - 1; i++) {
			result = s[i + 1] - s[i];

			if (min > result) {
				min = result;
				s1 = s[i];
				s2 = s[i + 1];
			}
		}
		System.out.printf("%d,%d", s1, s2);
	}
}
