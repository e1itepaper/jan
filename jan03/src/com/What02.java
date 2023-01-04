package com;

import java.io.IOException;

public class What02 {
	public static void main(String[] args) throws IOException {

		// 다른 입력방법 : Systme.in.read()
		System.out.println("한글자를 입력해주세요.");
		int user = System.in.read();
		System.out.println((char) user);
		System.in.read();
		System.in.read();
		System.out.println("두번째 숫자를 입력하세요");
		int sec = System.in.read();
		System.out.println((char) sec);
		System.in.read();
		System.in.read();
		System.out.println("세번째 숫자를 입력하세요");
		int th = System.in.read();
		System.out.println((char) th);

	}
}
