package linearSearchJava;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIntValue {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter array size");
		int[] arr= createArray(sc.nextInt());
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the value to be searched");
		int target = sc.nextInt();
		System.out.println("Index of the element searched is "+searchInt(arr, target));
	}

	public static int[] createArray(int size) {
		int[] arrCreator = new int[size];
		for(int i=0;i<arrCreator.length;i++) {
			System.out.println("Enter array value at index "+i);
			arrCreator[i]= sc.nextInt();
		}
		return arrCreator;
	}
	private static int searchInt(int[] arr, int target) {
		if(arr.length == 0) {
			return -1;
		}
		for(int index=0;index<arr.length;index++) {
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		return -1;
	}

}
