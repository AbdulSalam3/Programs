package linearSearchJava;

import java.util.Arrays;
import java.util.Scanner;

public class Search2DArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter row size of array");
		int[][] arr= create2DArray(sc.nextInt(), sc.nextInt());

		System.out.println("Enter the value to be searched");
		int target = sc.nextInt();
//		Print the row and col values of searched element as an array i.e, target
		System.out.println("Index of the element searched is "+Arrays.toString(searchInt(arr, target)));
	}
	
//	Search the element in 2D array	
	private static int[] searchInt(int[][] arr, int target) {
		if(arr.length==0) {
			return  new int[] {-1,-1};
		}
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row, col};
				}
			}
		}
		return new int[] {-1, -1};
	}

//	Create 2D array
	public static int[][] create2DArray(int rowSize, int colSize) {
		int[][] arrCreator = new int[rowSize][colSize];
		for(int row=0;row<arrCreator.length;row++) {
			for(int col=0;col<arrCreator[row].length;col++) {
				System.out.println("Enter array value at row-"+row+" col-"+col);
				arrCreator[row][col]= sc.nextInt();	
			}
		}
//		Print the 2D array
		for(int[] row: arrCreator) {
			System.out.println(Arrays.toString(row));
		}
		return arrCreator;
	}
}
