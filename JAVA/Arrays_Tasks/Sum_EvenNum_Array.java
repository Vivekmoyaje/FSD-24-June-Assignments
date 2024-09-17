package Arrays_Tasks;

import java.util.Scanner;

//Write a program to array elements to print sum of Even Numbers

public class Sum_EvenNum_Array {

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

		for (int Even : arr) {

			if (Even % 2 == 0) {

				sum += Even;
			}
		}

		System.out.println("\n The Addition of even number : " + sum);
	}

}

//Output:

//Enter length of the Array : 5
//arr[0] : 3
//arr[1] : 7
//arr[2] : 8
//arr[3] : 4
//arr[4] : 2

//The Addition of even number : 14
