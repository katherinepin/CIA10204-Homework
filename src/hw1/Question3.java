package hw1;

public class Question3 {
	public static void main(String[] args) {
		int a = 256559;
		int hr = 24;
		int min = 60, s = 60;

		
		System.out.println((a/s/min/hr)+"天"+(a/s/min % hr)+"時"+(a/s % min)+"分"+(a % s)+"秒");
	}
}
