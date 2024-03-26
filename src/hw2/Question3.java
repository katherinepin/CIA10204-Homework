package hw2;

public class Question3 {
	public static void main(String[] args) {
		int a, b;
		for(a = 0; a <= 5; a++) {
			for(b =0; b<=a; b++) {
			
			int c = 65 + a ;
			char d = (char)c;
			System.out.print(d);
			}
			System.out.println();
		}
	}
}
