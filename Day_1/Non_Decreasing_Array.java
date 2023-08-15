package non_decreasing_array;

import java.util.Scanner;

public class Non_decreasing {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();		
			}
		
		System.out.println(ispossible(arr,n));
		scan.close();
	}

	private static boolean ispossible(int[] arr, int n) {
		int modified=0;
		for (int i=1; i<arr.length; i++) {
			if (arr[i-1] > arr[i]) {
				if (modified++ == 1)
					return false;
				if (i<2 || arr[i-2] <= arr[i])
					arr[i-1] = arr[i];
				else 
					arr[i] = arr[i-1];
			}
		}
		return true;
	}
}
