package practiceJava;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("String with all unique chars is "+removeDuplicate(str));

	}
	
	public static String removeDuplicate(String str) {
		LinkedHashSet<Character> uniqueChar = new LinkedHashSet<>();
		
		for(int i=0; i<str.length();i++) {
			uniqueChar.add(str.charAt(i));
		}
		
		StringBuilder result = new StringBuilder();
		for(Character ch: uniqueChar) {
			result.append(ch);
		}
		return result.toString();
	}
}
