package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main (String args[]) {
		
		//자원생성
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("수를 입력하시오 : ");
		int number = scanner.nextInt();
		
		/* 코드를 완성합니다. */
		//출력
		if(number > 0 && number%3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		//자원해제
		scanner.close();
	}
}
