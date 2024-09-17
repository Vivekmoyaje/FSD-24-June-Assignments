package Arrays_Tasks;

import java.util.Scanner;

//Write a program to array elements to print sum of Cubic Values

public class Sum_cubic_Array {

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

		for (int cube : arr) {
			sum += cube * cube * cube;
		}

		System.out.println("\n Sum of cubic Array is : " + sum);
	}

}

//Output :

//Enter length of the Array : 3
//arr[0] : 2
//arr[1] : 4
//arr[2] : 6
//
// Sum of cubic Array is : 288
