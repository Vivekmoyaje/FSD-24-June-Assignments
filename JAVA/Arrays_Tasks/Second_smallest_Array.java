package Arrays_Tasks;

import java.util.Scanner;

//Write a program to find the second smallest element in an array

public class Second_smallest_Array {

	public static int SecondSmallest(int arr[], int length) {

		int temp;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr[1];

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter length of the Array : ");

		int length = input.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();
		}

		System.out.println("\n Second smallest number is : " + SecondSmallest(arr, length));
	}

}

//Output:

//Enter length of the Array : 
//4
//arr[0] : 1
//arr[1] : 2
//arr[2] : 3
//arr[3] : 4

//Second smallest number is : 2
