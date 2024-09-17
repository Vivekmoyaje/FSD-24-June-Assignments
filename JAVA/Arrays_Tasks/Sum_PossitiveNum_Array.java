package Arrays_Tasks;

import java.util.Scanner;

//Write a program to array elements to print sum of Positive Numbers

public class Sum_PossitiveNum_Array {

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

		for (int P : arr) {

			if (P > 0) {

				sum += P;
			}
		}

		System.out.println("\n The Addition of possitive numbers is : " + sum);
	}

}

//Output:

//Enter length of the Array : 4
//arr[0] : 5
//arr[1] : 7
//arr[2] : -5
//arr[3] : 8

//The Addition of possitive numbers is : 20
