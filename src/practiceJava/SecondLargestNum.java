package practiceJava;

import java.util.Scanner;

public class SecondLargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		int [] arr = new int[sc.nextInt()];
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter value at index-"+i);
			arr[i] = sc.nextInt();
		}
		int firstMax = 0;
		int secondMax = 0;
		for(int j=0;j<arr.length;j++) {
			if (arr[j]>firstMax){
				secondMax=firstMax;
				firstMax=arr[j];
			}
		}
		System.out.println(firstMax);
		System.out.println(secondMax);
	}
}
