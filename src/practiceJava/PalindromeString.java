package practiceJava;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println("Given string is "+ palindrome(str1));

	}

	private static String palindrome(String str1) {
		int mid = (str1.length())/2;
		int start = 0;
		int end = str1.length()-1;
		while(mid > start || mid < end) {
			
			if(str1.charAt(start) != str1.charAt(end)) {
				return "Not a Palindrome";
			}
			start++;
			end--;
		}
		return "a Palindrome";
	}

}
