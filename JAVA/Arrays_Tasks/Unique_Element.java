package Arrays_Tasks;

import java.util.Scanner;

//Write a program to Print Unique Elements in Array

public class Unique_Element {

	static void UniqueEle(int arr[], int n) {
		
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < i; j++)
				if (arr[i] == arr[j])
					break;
			if (i == j)
				System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Array Limit :");
		int length = input.nextInt();
		int[] arr = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("arr[%d] :", i);
			arr[i] = input.nextInt();

		}
		System.out.println("\n Unique Elements are : ");
		UniqueEle(arr, length);

	}

}

//Output:

//Enter the Array Limit :4
//arr[0] :1
//arr[1] :2
//arr[2] :3
//arr[3] :4
//
// Unique Elements are : 
//1 2 3 4 
