package Arrays_Tasks;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to copy the elements of one array into another array

public class Copy_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the array : ");

		int length = input.nextInt();
		int Arr[] = new int[length];
		int Copy[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("Arr[%d] :", i);
			Arr[i] = input.nextInt();
		}

		for (int i = 0; i < length; i++) {

			Copy[i] = Arr[i];
		}

		System.out.print("\n Original Array is : ");

		for (int i = 0; i < length; i++) {
			System.out.print(Arr[i] + " ");
		}

		System.out.print(" \n\n Copy Array is : ");

		for (int i = 0; i < length; i++) {
			System.out.print(Copy[i] + " ");

		}

	}

}

//Output:

//Enter length of the Array : 5
//Arr[0] :4
//Arr[1] :7
//Arr[2] :2
//Arr[3] :8
//Arr[4] :4
//
// Original array is : 4 7 2 8 4  
//
// Copy Array is : 4 7 2 8 4 