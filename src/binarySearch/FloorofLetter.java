package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FloorofLetter {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter array size");
		char[] arr= createStrArray(sc.nextInt());
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter a value to search:");
		char target = sc.next().charAt(0);
		System.out.println("Floor char of the target value is:"+ floorChar(arr, target));
	}

	public static char floorChar(char[] arr, char target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAsc = arr[start]<arr[end];

		if(target == arr[end]) {
			return arr[start];
		}

		if(isAsc) {
			while(start<=end) {
				int mid = (start+end)/2;
				if(arr[mid]<target) {
					start = mid+1;
				}
				else {
					end = mid-1;
				}
			}
			return arr[start-1];
		}else {
			while(start<=end) {
				int mid = (start+end)/2;
				if(arr[mid]>target) {
					start = mid+1;
				}
				else {
					end = mid-1;
				}
			}return arr[start+1];
		}
	}

	public static char[] createStrArray(int size) {
		char[] arrCreator = new char[size];
		for(int i=0;i<arrCreator.length;i++) {
			System.out.println("Enter array value at index "+i);
			arrCreator[i]= sc.next().charAt(0);
		}
		return arrCreator;
	}

}
