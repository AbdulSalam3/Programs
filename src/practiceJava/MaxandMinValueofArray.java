package practiceJava;

import java.util.Arrays;
import java.util.Scanner;

public class MaxandMinValueofArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int [] arr = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter value at index-"+i);
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Maximum value of array is "+ maxValue(arr));
		System.out.println("Minimum value of array is "+ minValue(arr));
	}

	private static int maxValue(int[] arr1) {
		int res = 0;
		for(int j=1;j<arr1.length;j++) {
			if(arr1[j]>res) {
				res = arr1[j];
			}
		}
		return res;
	}
	private static int minValue(int[] arr1) {
		int res = arr1[arr1.length-1];
		for(int j=1;j<arr1.length;j++) {
			if(arr1[j]<res) {
				res = arr1[j];
			}
		}
		return res;
	}

}
