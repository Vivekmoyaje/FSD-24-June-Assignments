package Arrays_Tasks;

import java.util.Scanner;

//Write a program to find the maximum and minimum element in an array

public class Min_Max_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the Array : ");

		int length = input.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

		for (int M : arr) {
			if (min > M) {
				min = M;
			}
			if (max < M) {
				max = M;
			}

		}

		System.out.println("\n Minimum value is : " + min);
		System.out.println("Maximum value is : " + max);

	}

}

//Output:

//Enter length of the Array : 7
//arr[0] : 3
//arr[1] : 45
//arr[2] : 7
//arr[3] : 23
//arr[4] : 8
//arr[5] : 23
//arr[6] : 57

//Minimum value is : 3
//Maximum value is : 57
