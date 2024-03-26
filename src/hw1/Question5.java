package hw1;

public class Question5 {
	public static void main(String[] args) {
		final int PV = 1500000;
		double r = 0.02;
		int n = 10;
		double FV = PV * Math.pow((1 + r),n);
		System.out.println(FV);
	}
}
