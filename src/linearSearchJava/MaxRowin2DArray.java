package linearSearchJava;

import java.util.Arrays;
import java.util.Scanner;

public class MaxRowin2DArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter row and col size of array");
		int[][] arr= create2DArray(sc.nextInt(), sc.nextInt());
		System.out.println("Max value of 2D Array is "+ maxVal(arr)+"and the row is "+ maxvalRow(arr));
	}
	
//	Finds the max sum value among all the rows
	private static int maxVal(int[][] arr) {
		int ans = 0;
		for(int row=0;row<arr.length;row++) {		
			int res = calculator(arr[row]);
			if(ans < res) {
				ans = res;
			}			
		}
		return ans;
	}
	
//	Finds the Row with max sum value
	private static int maxvalRow(int[][] arr) {
		int ans = 0;
		int rowNum = 0;
		for(int row=0;row<arr.length;row++) {		
			int res = calculator(arr[row]);
			if(ans < res) {
				rowNum = row;
				ans = res;
			}			
		}
		return rowNum+1;
	}

//	Calculate sum of elements of a row
	private static int calculator(int[] row) {
		int colVal = 0;
		for(int col=0;col<row.length;col++) {
			colVal = colVal+row[col];
		}
		return colVal;
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
