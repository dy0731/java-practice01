package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {

			String number = String.valueOf(i);

			int size = number.length();

			int clapCount = 0;

			for (int j = 0; j < size; j++) {
				char c = number.charAt(j);
				if (c == '3' || c == '6' || c == '9') {
					clapCount++;
				}
			}

			if (clapCount > 0) {
				System.out.print(i + " ");
				for (int k = 0; k < clapCount; k++) {
					System.out.print("짝");
				}
				System.out.print("\n");
			}
		}
	}
}
