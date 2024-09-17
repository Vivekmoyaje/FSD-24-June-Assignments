package Arrays_Tasks;

import java.util.Scanner;

//Write a program to array elements to print sum of Negative Numbers

public class Sum_NegativeNum_Array {

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

		for (int neg : arr) {

			if (neg < 0) {
				sum += neg;
			}
		}

		System.out.println("\n The Addition of negative numbers is : " + sum);
	}

}

//Output:

//Enter length of the Array : 5
//arr[0] : -4
//arr[1] : 6
//arr[2] : -7
//arr[3] : 3
//arr[4] : -1

//The Addition of negative numbers is : -12
