package practiceJava;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Given Number is "+ palindrome(num));

	}

	private static String palindrome(int num) {
		int rev = 0;
		int temp = num;
		while(temp>0) {
			rev = (rev*10) + temp%10;
			temp = temp/10;
		}
		
		if(num == rev) {
			return "a Palindrome";
		}
		return "Not a Palindrome";
	}

}
