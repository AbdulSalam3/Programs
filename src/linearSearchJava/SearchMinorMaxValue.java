package linearSearchJava;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMinorMaxValue {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter array size");
		int[] arr= createArray(sc.nextInt());
		System.out.println(Arrays.toString(arr));
		System.out.println("Min value of array is "+ minval(arr));
		System.out.println("Max value of array is "+ maxval(arr));
	}
	private static int minval(int[] arr) {
		int ans = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<ans) {
				ans = arr[i];
			}
		}
		return ans;
	}
	private static int maxval(int[] arr) {
		int ans = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>ans) {
				ans = arr[i];
			}
		}
		return ans;
	}
	public static int[] createArray(int size) {
		int[] arrCreator = new int[size];
		for(int i=0;i<arrCreator.length;i++) {
			System.out.println("Enter array value at index "+i);
			arrCreator[i]= sc.nextInt();
		}
		return arrCreator;
	}
	
}
