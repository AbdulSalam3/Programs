package practiceJava;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseanArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int [] arr = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter value at index-"+i);
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
	private static void swap(int[] arr1, int num1, int num2) {
		int temp = arr1[num1];
		arr1[num1] = arr1[num2];
		arr1[num2] = temp;
	}
}
