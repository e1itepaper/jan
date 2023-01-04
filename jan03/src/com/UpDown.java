package com;

import java.util.Scanner;

class UpDownGame {
	int number = (int) (Math.random() * 100) + 1;
	int user = 0;
	int count = 0;

	public void Game() {
		if (user > 0 && user < 101) {
			count++;
			if (number > user) {
				System.out.println("UP");
			} else if (number < user) {
				System.out.println("DOWN");
			} else if (number == user) {
				System.out.println("정답입니다! " + count + "회 만에 맞췄어요.");
			}
		} else {
			System.out.println("1부터 100까지 숫자를 입력하십시오.");
		}
	}

}

public class UpDown {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		UpDownGame game = new UpDownGame();
		while (game.number != game.user) {
			System.out.print("숫자를 입력해주세요(1 ~ 100) : ");
			game.user = sc.nextInt();
			game.Game();
		}
		sc.close();
	}

}
