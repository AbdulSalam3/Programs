package practiceJava;

import java.util.ArrayList;
import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		subStrings(str);

	}

	private static void subStrings(String str) {
		char[] arr = str.toCharArray();
		for(int sub_length=1;sub_length<=str.length();sub_length++) {
			for(int sub_start=0; sub_start<=str.length()-sub_length;sub_start++) {
				int sub_end = sub_start+sub_length-1;{
					for(int sub_str=sub_start; sub_str<=sub_end;sub_str++) {
						System.out.print(arr[sub_str]);
					}System.out.println();
				}
			}
		}
	}

}
