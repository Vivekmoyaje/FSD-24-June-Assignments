package Arrays_Tasks;

import java.util.Scanner;

//Write a program in to find the sum of all elements of the array

public class Sum_Array {

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

		for (int add : arr) {

			sum += add;
		}

		System.out.println("\n The sum of elements in Array is : " + sum);
	}

}

//Output:

//Enter length of the Array : 5
//arr[0] : 5
//arr[1] : 8
//arr[2] : 9
//arr[3] : 4
//arr[4] : 7
//
// The sum of elements in Array is : 33
