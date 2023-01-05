package wrapper;
// 랩퍼 클래스

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 
 * 컬렉션은 참조 값(레퍼런스 R타입)만 담을 수 있음. 
 * 
 * P타입은 저장할 수 없음.
 * 그래서 랩퍼 클래스로 변환 후 저장 가능함.
 * 
 * 기본 자료형의 값을 컬랙션에 저장하기 위해서 사용함.
 * 모든 기본 자료형에 대해 그에 대응되는 랩퍼 클래스가 있음.
 * 
 * 기본 자료형의 값을 멤버 변수에 저장하고
 * 이 값 주변으로 값을 감싸고 있는 메소드가 있다고 해서
 * 랩퍼(Wrapper, 감싸다) 클래스라고 불린다.
 * 
 *		기본 타입 		랩퍼 클래스명
 *			byte			Byte
 *			short			Short
 *			int				Integer
 *			long			Long
 *			float			Float
 *			double			Double
 *			char			Character
 *			boolean			Boolean
 *
 * 프로모션 ? 
 */
public class Wrapper {
	public static void main(String[] args) {

		Byte b = new Byte((byte) 127);
		Byte b2 = 127;

		Integer iNum = new Integer(127);
		Integer iNum2 = 127; // 오토박싱 : 자동으로 포장 한다는 뜻 <-> 언박싱

		byte bNum = iNum2.byteValue(); // 캐스팅(형변환) X
		short sNum = iNum2.shortValue(); // iNum2을 short으로 바꿔서 sNum에 대입
		float fNum = iNum2.floatValue();

		iNum = Integer.MAX_VALUE;
		System.out.println(iNum); // Integer의 최대값 2147483647
		iNum = Integer.MIN_VALUE;
		System.out.println(iNum); // Integer의 최소값 -2147483648

		System.out.println(Byte.MAX_VALUE); // Byte의 최대값 127
		System.out.println(Byte.MIN_VALUE); // Byte의 최소값 -128

		System.out.println(Short.MAX_VALUE); // Short의 최소값 32767
		System.out.println(Short.MIN_VALUE); // Short의 최소값 -32768

		System.out.println(Double.MIN_VALUE); // Double의 최소값 4.9E-324

		System.out.println(Byte.MAX_VALUE / Byte.MIN_VALUE); // 0
		System.out.println(Byte.MIN_VALUE / Byte.MAX_VALUE); // -1

		// 오토 박싱
		Integer iNum3 = 127;
		Integer iNum4 = new Integer(127);// 캐스팅(형변환) X, 기본타입이 참조타입으로 바뀜

		if (iNum3 == iNum4) {
			System.out.println("같아요");
		} else {
			System.out.println("달라요");
		}

		// 같으면 true, 다르면 false
		System.out.println(iNum3.equals(127)); // true

		// 같으면 0, 앞 숫자가 크면 1, 뒷 숫자가 크면 -1
		System.out.println(iNum3.compareTo(10)); // 1

		// 오토 언박싱
		int number = iNum3;
		// iNum23이 참조하고 있는 객체 안에 있는 int 값이 객체 밖으로 나와 number에 들어감.
		System.out.println(number); // 127

		Object obj = 10;
		System.out.println(obj);

		int result = (int) obj;
		System.out.println(result);

		result = (Integer) obj;
		result = ((Integer) obj).intValue();

		Set<Integer> lotto = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map;
	}

}
