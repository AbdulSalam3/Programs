package practiceJava;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();

		System.out.println(reverseScentence(str));
	}

	private static StringBuilder reverseScentence(String str) {
		String [] arr = str.split(" ");
		String[] ans = new String[arr.length];
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			ans[i] =  reverseWord(arr[i]);
			stringBuilder.append(ans[i]);
			stringBuilder.append(" ");
		}
		return stringBuilder;
	}

	public static String reverseWord(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res = res+str.charAt(i);
		}
		return res;
	}
}


