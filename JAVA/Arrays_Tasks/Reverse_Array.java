package Arrays_Tasks;

import java.util.Scanner;

//Write a program to read n number of values in an array and display in reverse order

public class Reverse_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the Array : ");

		int length = input.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {

			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();
		}

		System.out.println("\nReverse Array is : ");

		for (int i = length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}

//Output:

//Enter length of the Array : 4
//arr[0] : 1
//arr[1] : 2
//arr[2] : 3
//arr[3] : 4

//Reverse Array is : 
//4
//3
//2
//1
