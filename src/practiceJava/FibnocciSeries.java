package practiceJava;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		fibnocci(limit);
		System.out.println("Program is completed");
	}

	private static void fibnocci(int limit) {
		int j=1;
		int i=0;
		int fib=0;
		for(int k=1;k<limit;k++) {
			System.out.print(fib+" ");
			i=fib;
			fib = fib+j;
			j=i;
		}
	}
}

















