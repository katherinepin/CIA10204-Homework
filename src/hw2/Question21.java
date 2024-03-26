package hw2;

public class Question21 {
	public static void main(String[] args) {
		int j = 10;
		int sum = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % j == 4) {

			} else if (i / j == 4) {

			} else {
				System.out.print(i + ", ");
				sum++;
			}

		}

		System.out.println("\n總共" + sum + "個");
	}
}