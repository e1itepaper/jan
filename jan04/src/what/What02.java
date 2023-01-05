package what;

class Add {
	int result ;
	
	public int addAll(int a, int b) {
		result= 0;
		for (int i = a; i <= b; i++) {
			result += i;
		}
		return result;
	}

	public int addEven(int a, int b) {
		result= 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}
		return result;
	}
}

public class What02 {
	public static void main(String[] args) {
		Add add = new Add();
		System.out.println(add.addAll(1, 3));
		System.out.println(add.addEven(1, 5));
	}
}
