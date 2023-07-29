package second_largest;

import java.util.Arrays;
import java.util.Scanner;

public class Second_largest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter length of Array");
        int n=scan.nextInt();
        int temp;
        int arr[] = new int[n];
        int size=arr.length;
        for (int i = 0 ;i<size;i++){
            arr[i]=scan.nextInt();
        }
        //using inbuilt function to sort an array
        Arrays.sort(arr);
        int largest=arr[size-1];
        
        int second_largest=-1;
        for(int i=0; i<size; i++){
           if(arr[i]>second_largest && arr[i]!=largest){
               second_largest=arr[i];
           }
        }
        System.out.println("Second Largest:"+second_largest);
scan.close();

	}
}
