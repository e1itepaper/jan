package com;

import java.util.Random;

public class Random02 {
	public static void main(String[] args) {
		
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
//			int user = r.nextInt(10);// 0 ~ 9
			int user1 = r.nextInt(100);// 0 ~ 99
			System.out.println(user1);
		}		
	}
}
