package practice01;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		
		//자원생성
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int number = scanner.nextInt();
			
			/* 코드를 완성합니다. */
			
			//합계
			int sum = 0;
			
			//홀수이면
			if(number%2 == 1) {
				for(int i = 1; i <= number; i++) {
					if(i%2 == 1) {
						sum += i;
					}
				}
			} else {
				for(int i = 1; i <= number; i++) {
					if(i%2 == 0) {
						sum += i;
					}
				}
			}
			
			System.out.println("결과 값 : " + sum + "\n");
		}
		
		//자원해제
		//scanner.close();
	}
}
