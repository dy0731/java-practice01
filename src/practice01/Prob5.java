package practice01;

public class Prob5 {

	public static void main(String[] args) {
		
		//1에서 100까지 반복한다.
		for (int i = 1; i < 100; i++) {
			
			//반복되는 숫자를 문자열로 변환환다.
			String number = String.valueOf(i);
			
			//해당 문자열의 길이를 구한다.
			int size = number.length();

			//해당 문자열에 3,6,9 숫자가 몇개 들어있는지 저장할 변수를 생성 및 초기화 한다.
			int clapCount = 0;

			//해당 문자열의 길이만큼 반복한다.
			for (int j = 0; j < size; j++) {
				
				//해당문자열의 문자를 구한다. 
				char c = number.charAt(j);
				
				//3,6,9 문자가 있으면 clapCount를 1 증가시켜준다. (갯수를 구함)
				if (c == '3' || c == '6' || c == '9') {
					clapCount++;
				}
			}
			
			//해당 문자열에 3,6,9가 있으면
			if (clapCount > 0) {
				
				//해당 문자열을 출력한다.
				System.out.print(i + " ");
				
				//해당 문자열에 3,6,9가 들어있는 갯수만큼 반복한다.
				for (int k = 0; k < clapCount; k++) {
					//"짝"을 출력한다.
					System.out.print("짝");
				}
				//개행
				System.out.print("\n");
			}
		}
	}
}
