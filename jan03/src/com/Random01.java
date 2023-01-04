package com;



public class Random01 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			int d = (int) (Math.random() * 100 + 1) ; // 1 ~ 100
			int d1 = (int) (Math.random() * 10 + 1) ; // 1 ~ 10
			System.out.println(d);
		}
		
		
	}
}
