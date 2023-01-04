package jan02;

//한 줄 주석 = 라인 주석
/* 
 * 
 * 단락 주석 = 블럭 주석 
 * */
/**
 * 문서 주석 = doc
 */
//EUC-KR -> MS949
//UTF-8로 바꾸기

//	파일명과 같은 클래스 앞에만 public을 붙일 수 있음
public class /* 주석 (안하는 게 좋음) */ Java01 { // Java01 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		System.out.println("Hi"); // 명령문

		// 호출 : 다른 클래스에서 호출
		// 클래스명 객체(변수)명 = new 클래스명();
		AppleKorea appleKorea = new AppleKorea(); // 객체 생성
		appleKorea.appleKorea();// 객체명. 메소드명()으로 호출

		// 호출 : 같은 클래스에서 호출
		// 메소드 명(파라미터(매개변수))
		print(100, "애지"); // >>>파라미터 수, 순서 중요!<<<

	} // main 메소드 끝

	// 메소드 속에 메소드가 들어갈 수 없음
	public static void print(int num, String name) { // print method(파라미터) >>>파라미터 순서 중요!<<<
		System.out.println("print Method입니다.");
		System.out.println("들어온 값은 " + num); // 들어온 값은 100
		System.out.println("이름은 : " + name); // 이름은 : 애지
	} // print 메소드 끝

} // Java01클래스 끝

// 클래스 = 대문자로 시작 ex) Apple
//	AppleKorea = 뒤에 오는 첫 글자는 대문자로 처리 = 파스칼 표기법
//	class = 예약어 
//	Class는 가능

// 메소드 = 소문자로 시작, 메소드 이름 뒤에 괄호를 붙임 ex) main( ...
// appleKorea = 첫글자는 소문자로, 뒤에오는 단어는 첫글자 대문자로 처리 = 카멜 표기법

//	변수 = 소문자로 시작, 뒤에 오는 단어 첫 글자 대문자 = 카멜 표기법
//	상수 = 모두 대문자, _(언더바) 붙여서 연결하기 = 스네이크 표기법
//						= APPLE_KOREA 

//	메소드, 변수, 상수는 모두 클래스 속에 들어가야함
//	클래스안에 클래스 넣지말기
//	들여쓰기 중요!

//	자동 정렬 Ctrl + Shift + f (단축키)

class AAA {

}

class AppleKorea {
	// 인스턴스 변수 =
	// 클래스 변수 =
	public static void appleKorea() {

		// 지역변수 = 메소드 속에서 생성된 변수 = 초기화 후 사용가능
		int appleKorea = 100; // 명령문이 끝났다 = 세미콜론(;)
		int APPLE_KOREA = 100; // 선언문 초기화식
		int ap; // (값 없이) 선언만
//		System.out.println(ap); // 출력문(선언만 하면 출력 불가)

		ap = 10; // 값 대입
		System.out.println(ap); // 출력문(값 대입을 하면 출력 가능)

		int ap01 = ap; // ap를 ap01에 대입하다. , = : 대입하다 <---- 값의 흐름
		System.out.println(ap01); // 10
	}

} // AppleKorea 클래스 끝


