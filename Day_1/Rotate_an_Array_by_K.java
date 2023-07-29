package left_rotate;

import java.util.Scanner;

public class Left_rotate_by_k_places {
	static void leftrotate(int arr[],int size, int k) {
		int temp[]=new int[k];
        for(int i=0; i<k; i++) {
        	temp[i]=arr[i];	
        }
        for(int i=k; i<size; i++) {
        	arr[i-k]=arr[i];
        }
        
        for(int i=size-k; i<size; i++) {
        	arr[i]=temp[i-(size-k)];
        	
        }		
	}

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
	        System.out.println("Enter length of Array");
	        int n=scan.nextInt();
	        int arr[] = new int[n];
	        int size=arr.length;
	        for (int i = 0 ;i<size;i++){
	            arr[i]=scan.nextInt();
	        }
	        System.out.println("Enter how many places to rotate");
	        int k=scan.nextInt();
	        k=k%size;
	        
	        leftrotate(arr,size,k);
	        System.out.println("After rotation:");
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	        
	        

	}

}
