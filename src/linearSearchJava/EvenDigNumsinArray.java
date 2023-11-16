package linearSearchJava;

import java.util.Arrays;
import java.util.Scanner;

public class EvenDigNumsinArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter array size");
		int[] arr= createArray(sc.nextInt());
		System.out.println(Arrays.toString(arr));
//		Print the no. of even digit numbers
		System.out.println("No. of even digit numbers are "+ even(arr));

	}
//	Check if there are even no. of digits in the number
	private static int even(int[] arr) {
		int count = 0;
		for(int value: arr) {
			if(digits(value) %2 == 0) {
				count++;
			}
		}	
		return count;
	}
//	Count the no. of digits in a number
	private static int digits(int value) {
//		Alternate method to count no. of digits
//		int count = 0;
//		int num = value;
//		while (num>0) {
//			count++;
//			num = num/10;
//		}
		String str = Integer.toString(value);
		int count = str.length();
		return count;
	}
//	Create an Array
	public static int[] createArray(int size) {
		int[] arrCreator = new int[size];
		for(int i=0;i<arrCreator.length;i++) {
			System.out.println("Enter array value at index "+i);
			arrCreator[i]= sc.nextInt();
		}
		return arrCreator;
	}
}
