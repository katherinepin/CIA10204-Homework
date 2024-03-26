package hw2;

public class Question11 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0;i<=1000; i+=2) {
			if(i != 0) {
				sum += i;
				System.out.print(i+", ");
			}
		}
		System.out.println("\n總和:"+ sum);
	}
}
