package Arrays_Tasks;

import java.util.Scanner;

//Write a program to array elements print all Positive number

public class Possitive_Num_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the Array : ");

		int length = input.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();
		}

		System.out.println("\n The Possitive numbers are : ");

		for (int P : arr) {

			if (P > 0) {
				System.out.println(P);
			}
		}

	}

}

//Output:

//Enter length of the Array : 5
//arr[0] : 4
//arr[1] : -7
//arr[2] : 8
//arr[3] : 9
//arr[4] : -1
//
// The Possitive numbers are : 
//4
//8
//9