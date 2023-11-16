package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingandFloor {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter array size");
		int[] arr= createArray(sc.nextInt());
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter a value to search:");
		int target = sc.nextInt();
		System.out.println("Ceiling of the target is "+ceilingBS(arr, target));
		System.out.println("Floor of the target is "+floorBS(arr, target));
	}

	private static int ceilingBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAsc = arr[start]<arr[end];
		if(target > arr[arr.length-1]) {
			return -1;
		}
		while(start<=end) {
			int mid = (start+end)/2;//(or) start+((end-start)/2)
			if(arr[mid] == target) {
				return arr[mid];
			}
			if(isAsc) {
				if(arr[mid]>target) {
					end = mid-1;
				}
				else {
					start = mid+1;
				}	
			}
			else {
				if(arr[mid]<target) {
					end = mid-1;
				}
				else {
					start = mid+1;
				}
			}
		}
		return arr[start];	
	}
	
	private static int floorBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAsc = arr[start]<arr[end];
//		if(target < arr[0]) {
//			return -1;
//		}
		while(start<=end) {
			int mid = (start+end)/2;//(or) start+((end-start)/2)
			if(arr[mid] == target) {
				return mid;
			}
			
			if(isAsc) {
				if(arr[mid]>target) {
					end = mid-1;
				}
				else {
					start = mid+1;
				}	
			}
			else {
				if(arr[mid]<target) {
					end = mid-1;
				}
				else {
					start = mid+1;
				}
			}
		}
		return arr[end];	
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


