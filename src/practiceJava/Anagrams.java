package practiceJava;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println("Given Strings are "+anagramDetect(str1,str2));

	}

	private static String anagramDetect(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return "not an Anagram";
		}else {
			char [] arr1 = str1.toCharArray();
			char [] arr2 =	str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					return "not an Anagram";
				}
			}
		}
		return "an Anagram";
	}

}
