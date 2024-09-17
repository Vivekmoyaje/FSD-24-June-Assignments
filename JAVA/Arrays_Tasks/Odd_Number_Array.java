package Arrays_Tasks;

import java.util.Scanner;

//Write a program to array elements print all Odd number

public class Odd_Number_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the Array : ");
		int length = input.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {

			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();
		}

		System.out.println("\nThe Odd numbers are : ");

		for (int odd : arr) {

			if (odd % 2 == 1) {

				System.out.println(odd);
			}

		}

	}

}

//Output:

//Enter length of the Array : 5
//arr[0] : 3
//arr[1] : 7
//arr[2] : 4
//arr[3] : 9
//arr[4] : 5
//
//The Odd numbers are : 
//3
//7
//9
//5
