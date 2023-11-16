package linearSearchJava;

import java.util.Arrays;
import java.util.Scanner;

public class SearchCharinString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		System.out.println("Enter the char to be searched");
		char target = sc.next().charAt(0);
		System.out.println(charSearch(str, target));

	}

	private static String charSearch(String str, char val) {
		
		if(str.length()==0) {
			return "String is empty";
		}
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==val) {
				return "Character is at position "+ i+1;
			}
		}
		return "Character does not exist";
	}

}
