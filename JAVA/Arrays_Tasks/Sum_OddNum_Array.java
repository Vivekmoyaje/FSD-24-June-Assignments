package Arrays_Tasks;

import java.util.Scanner;

//Write a program to array elements to print sum of Odd Numbers

public class Sum_OddNum_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the Array : ");

		int length = input.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();

		}

		int sum = 0;

		for (int odd : arr) {

			if (odd % 2 == 1) {

				sum += odd;
			}
		}

		System.out.println("\n The Addition of the odd numbers is : " + sum);

	}

}

//Output:

//Enter length of the Array : 5
//arr[0] : 2
//arr[1] : 4
//arr[2] : 5
//arr[3] : 7
//arr[4] : 9
//
// The Addition of the odd numbers is : 21
